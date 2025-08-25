import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class MyVisitor extends RuBaseVisitor<java.lang.Object> {
    private Map<String, java.lang.Object> vars = new HashMap<>();
    private PrintWriter writer;
    private Map<String, RuParser.Declaracion_funcionContext> funciones = new HashMap<>();

    public MyVisitor() {
        try {
            writer = new PrintWriter(new FileWriter("src/salida.txt", false)); // false = sobrescribir
        } catch (IOException e) {
            System.err.println("Error al abrir el archivo de salida");
            e.printStackTrace();
        }
    }


    public void cerrarArchivo() {
        if (writer != null) {
            writer.close();
        }
    }

    @Override
    public java.lang.Object visitPrograma(RuParser.ProgramaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public java.lang.Object visitBloque(RuParser.BloqueContext ctx) {
        for(RuParser.SentenciaContext s : ctx.sentencia()){
            visit(s);
        }
        return 0.0;
    }

    @Override
    public java.lang.Object visitSentencia(RuParser.SentenciaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public java.lang.Object visitDeclaracion_funcion(RuParser.Declaracion_funcionContext ctx) {
        String nombreFuncion = ctx.ID().getText();

        if(funciones.containsKey(nombreFuncion)){
            System.err.println("Error: funcion '" + nombreFuncion + "' ya fue declarada.");
            System.exit(1);
        }

        funciones.put(nombreFuncion, ctx);
        return null;
    }

    @Override
    public java.lang.Object visitLista_parametros(RuParser.Lista_parametrosContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public java.lang.Object visitLlamada_funcion(RuParser.Llamada_funcionContext ctx) {
        String nombre = ctx.ID().getText();
        RuParser.Declaracion_funcionContext funcion = funciones.get(nombre);

        if (funcion == null) {
            throw new RuntimeException("Función no definida: " + nombre);
        }

        // Preparar un nuevo entorno para los parámetros
        Map<String, Object> entornoAnterior = vars;
        vars = new HashMap<>();
        System.out.println("Aqui bien");

        //Asignar parametros
        List<TerminalNode> params = funcion.lista_parametros() != null
                ? funcion.lista_parametros().ID()
                : Collections.emptyList();
        System.out.println("Aqui bien");
        List<RuParser.ExprContext> args = ctx.lista_argumentos() != null
                ? ctx.lista_argumentos().expr()
                : Collections.emptyList();
        System.out.println("Aqui bien");
        //Verifica que el numero de argumentos sea igual al numero de parametros
        if(params.size() != args.size()){
            throw new RuntimeException("Número incorrecto de argumentos para la función: " + nombre);
        }

        for (int i = 0; i < params.size(); i++) {
            System.out.println("Aqui bien " + i);
            String param = params.get(i).getText();
            if(((Double) visit(args.get(i)) == -1.0)){
                Object valor = entornoAnterior.get(args.get(i).getText());
                System.out.println(valor);
                vars.put(param, valor);
            }
            else {
                Object valor = visit(args.get(i));
                vars.put(param, valor);
            }

        }

        // Ejecutar cuerpo
        visit(funcion.bloque_de_sentencia());

        // Restaurar entorno anterior
        vars = entornoAnterior;

        return null;
    }

    @Override
    public java.lang.Object visitLista_argumentos(RuParser.Lista_argumentosContext ctx) {
        return visitChildren(ctx);
    }


    @Override
    public java.lang.Object visitDeclaracion(RuParser.DeclaracionContext ctx) {
        String nombreVariable = ctx.ID().getText();
        Object valorVariable = visit(ctx.expr());

        if(vars.containsKey(nombreVariable)){
            System.err.println("Error: variable '" + nombreVariable + "' ya fue declarada.");
            System.exit(1);
        }

        vars.put(nombreVariable, valorVariable);
        return null;
    }

    @Override
    public java.lang.Object visitAsignacion(RuParser.AsignacionContext ctx) {
        String nombreVariable = ctx.ID().getText();
        Object valorVariable = visit(ctx.expr());

        if(!vars.containsKey(nombreVariable)){
            System.err.println("Error: variable '" + nombreVariable + "' no declarada.");
            System.exit(1);
        }

        vars.put(nombreVariable, valorVariable);
        return null;
    }

    @Override
    public java.lang.Object visitSentencia_if(RuParser.Sentencia_ifContext ctx) {
        boolean valorRegreso = true;
        for(RuParser.Bloque_condicionalContext s : ctx.bloque_condicional()){
            valorRegreso = (Boolean) visit(s);
            if(valorRegreso)
                break;
        }
        if(!valorRegreso && ctx.bloque_de_sentencia() != null) {
            visit(ctx.bloque_de_sentencia());
        }
        return null;
    }

    @Override
    public java.lang.Object visitBloque_condicional(RuParser.Bloque_condicionalContext ctx) {
        boolean condicion = toBoolean(visit(ctx.expr()));
        if (condicion)
            visit(ctx.bloque_de_sentencia()); // bloque del "if"
        return condicion;
    }

    @Override
    public java.lang.Object visitBloque_de_sentencia(RuParser.Bloque_de_sentenciaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public java.lang.Object visitSentencia_while(RuParser.Sentencia_whileContext ctx) {
        while(true){
            boolean condicion = (Boolean) visit(ctx.expr());
            if(!condicion) break;
            visit(ctx.bloque_de_sentencia());
        }
        return null;
    }

    @Override
    public java.lang.Object visitSentencia_for(RuParser.Sentencia_forContext ctx) {
        visit(ctx.declaracion());

        while(true){
            Object condicion = visit(ctx.expr());
            if(!(condicion instanceof Boolean))
                throw new RuntimeException("La condicion del for no es booleana.");
            if(!(Boolean) condicion)
                break;

            visit(ctx.bloque_de_sentencia());
            visit(ctx.asignacion());
        }
        return null;
    }


    @Override
    public java.lang.Object visitLog(RuParser.LogContext ctx) {
        double valor = (Double) visit(ctx.expr());

        return Math.log(valor);
    }

    @Override
    public java.lang.Object visitImprimir(RuParser.ImprimirContext ctx) {
        java.lang.Object resultado = visit(ctx.expr());
        System.out.println(resultado);
        writer.println(resultado);
        return null;
    }

    @Override
    public java.lang.Object visitMenosUnarioExpr(RuParser.MenosUnarioExprContext ctx) {
        return - (Double) visit(ctx.expr());
    }

    @Override
    public java.lang.Object visitNotExpr(RuParser.NotExprContext ctx) {
        return ! (Boolean) visitChildren(ctx);
    }

    @Override
    public java.lang.Object visitMultiplicacionExpr(RuParser.MultiplicacionExprContext ctx) {
        double izq = (Double) visit(ctx.expr(0));
        double der = (Double) visit(ctx.expr(1));
        double resultado=0.0;
        if(ctx.op.getText().equals("*"))
            resultado = izq * der;
        else if(ctx.op.getText().equals("/")){
            if(der==0){
                System.err.println("Error: division por cero");;
                System.exit(1);
            }
            resultado = izq / der;
        }
        else if(ctx.op.getText().equals("%"))
            resultado = izq % der;

        return resultado;
    }

    @Override
    public java.lang.Object visitAtomExpr(RuParser.AtomExprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public java.lang.Object visitOrExpr(RuParser.OrExprContext ctx) {
        boolean izq = toBoolean(visit(ctx.expr(0)));
        boolean der = toBoolean(visit(ctx.expr(1)));
        return izq || der;
    }

    @Override
    public java.lang.Object visitPowExpr(RuParser.PowExprContext ctx) {
        double izq = (Double) visit(ctx.expr(0));
        double der = (Double) visit(ctx.expr(1));
        return Math.pow(izq, der);
    }

    @Override
    public java.lang.Object visitIgualdadExpr(RuParser.IgualdadExprContext ctx) {
        Double izq = (Double) visit(ctx.expr(0));
        Double der = (Double) visit(ctx.expr(1));
        return ctx.op.getText().equals("==") ?  izq.equals(der): !izq.equals(der);
    }

    @Override
    public java.lang.Object visitRelacionalExpr(RuParser.RelacionalExprContext ctx) {
        Double izq = (Double) visit(ctx.expr(0));
        Double der = (Double) visit(ctx.expr(1));
        Boolean resultado=true;
        if(ctx.op.getText().equals(">="))
            resultado = izq >= der;
        else if(ctx.op.getText().equals("<="))
            resultado = izq <= der;
        else if(ctx.op.getText().equals(">"))
            resultado = izq > der;
        else if(ctx.op.getText().equals("<"))
            resultado = izq < der;

        return resultado;
    }

    @Override
    public java.lang.Object visitAditivaExpr(RuParser.AditivaExprContext ctx) {
        double izq = (Double) visit(ctx.expr(0));
        double der = (Double) visit(ctx.expr(1));

        return ctx.op.getText().equals("+") ?  izq + der: izq - der;
    }

    @Override
    public java.lang.Object visitAndExpr(RuParser.AndExprContext ctx) {
        boolean izq = toBoolean(visit(ctx.expr(0)));
        boolean der = toBoolean(visit(ctx.expr(1)));
        return izq && der;
    }

    @Override
    public java.lang.Object visitParExpr(RuParser.ParExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public java.lang.Object visitNumberAtom(RuParser.NumberAtomContext ctx) {
        if(ctx.INT() != null)
            return Double.parseDouble(ctx.INT().getText());
        else if(ctx.FLOAT() != null)
            return Double.parseDouble(ctx.FLOAT().getText());
        return null;
    }

    @Override
    public java.lang.Object visitBooleanAtom(RuParser.BooleanAtomContext ctx) {
        if(ctx.TRUE() != null)
            return Boolean.parseBoolean(ctx.TRUE().getText());
        else if(ctx.FALSE() != null)
            return Boolean.parseBoolean(ctx.FALSE().getText());
        return null;
    }

    @Override
    public java.lang.Object visitIdAtom(RuParser.IdAtomContext ctx) {
        String nombre = ctx.ID().getText();
        if (!vars.containsKey(nombre)) {
            System.err.println("Error: variable '" + nombre + "' no está definida.");
            return -1.0;
        }
        return vars.get(nombre);
    }

    @Override
    public java.lang.Object visitStringAtom(RuParser.StringAtomContext ctx) {
        String texto = ctx.getText();
        return texto.substring(1, texto.length() - 1); //Esto nos permite quitar las comillas
    }

    @Override
    public java.lang.Object visitNilAtom(RuParser.NilAtomContext ctx) {
        return visitChildren(ctx);
    }

    private boolean toBoolean(java.lang.Object value) {
        if (value instanceof Boolean) {
            return (Boolean) value;
        } else if (value instanceof Number) {
            return ((Number) value).doubleValue() != 0;
        } else if (value == null) {
            return false;
        } else {
            return true;
        }
    }
}