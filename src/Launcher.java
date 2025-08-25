import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

public class Launcher {
    InputStream is=null;
    CharStream input = null;
    RuLexer lexer = null;
    CommonTokenStream tokens = null;
    RuParser parser = null;
    ParseTree arbol = null;
    MyVisitor visitor = null;

    public Launcher(String codigo){
        // 1. Crear la tuberia para los datos de entrada desde un archivo
        /*String archivo = "src/Pruebas.txt";
        this.is = null;
        try {
            is = new FileInputStream(archivo);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        this.input = null;
        try {
            input = CharStreams.fromStream(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        // 1. Crear la tuberia para los datos de entrada desde la consola
        //CharStream input = CharStreams.fromStream(System.in);
        input = CharStreams.fromString(codigo);

        // 2. Crear el lexer a partir de la grámatica
        this.lexer =  new RuLexer(input);

        //3. Crear el flujo de tokens entre el lexer y el parser
        this.tokens = new CommonTokenStream(lexer);

        //4. Crear el parser a partir de los tokens
        this.parser = new RuParser(tokens);

        //5. Parsear el programa completo (regla inicial: 'programa')
        this.arbol = parser.programa();

        //6. Crear una instancia de nuestro visitor
        this.visitor = new MyVisitor();
        System.out.println("Comience a escribir: ");
    }

    public void IniciarProceso() {
        //7. Recorrer el arbol y ejecutar la logica
        this.visitor.visit(arbol);
        if (this.visitor != null) {
            this.visitor.cerrarArchivo();
        }
    }
}

