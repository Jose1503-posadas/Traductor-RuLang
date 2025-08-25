# Traductor Ru
 - *Proyecto:* Traductor del lenguaje Ru usando ANTLR
 - *Autores:*
   - José Alberto Posadas Gudiño 2213026541
   - Jonathan Alejandro Ibañez Aguilar 2213026738
 - *Profesor:* Dr. Roberto Bernal Jáquez
 - *Universidad Autónoma Metropolitana* - Cuajimalpa
---
## Descripción

Este proyecto implementa un traductor para el lenguaje Ru utilizando ANTLR4 y el patrón Visitor. El traductor permite analizar programas escritos en Ru, evaluarlos y mostrar sus resultados mediante una interfaz gráfica.

---
## Componentes

*Analizador léxico (RuLexer)*
- Define los tokens del lenguaje Ru: identificadores, palabras clave (var, if, while, etc.), operadores (+, -, *, /, etc.), literales, etc.

*Analizador sintáctico (RuParser)*
- Define la gramática del lenguaje Ru, incluyendo estructuras como declaraciones de variables, condicionales, ciclos, funciones, etc.

*Visitor personalizado (MyVisitor.java)*
- Clase que recorre el árbol de análisis sintáctico generado por ANTLR y ejecuta las instrucciones del lenguaje Ru.

*Clase de ejecución (Launcher.java)*
- Encargada de invocar ANTLR, procesar el código fuente y ejecutar el árbol sintáctico con el Visitor.

*Interfaz gráfica (MainApp.java)*
- Proporciona una interfaz al usuario para escribir código Ru, cargar archivos y mostrar los resultados de la ejecución. Los elementos que tiene la interfaz son los siguientes:
  - Areas de texto
    - *Imput:* Es la seccion en la que el usuario puede ingresar el codigo deseado.
    - *Output:* Es la sección en la que aparece el resultado de la ejecución del progrma, es decir se imprimiran los resultados obtenidos por la ejecución de este.
   
  - Botones
    - *Boton de ejecución:* Ejecutara el codigo que se ingreso en el area del imput. 
    - *Boton de Cargar archivo:* Se podra seleccionar desde los archivos de la computadora algun archivo para colocar su contenido en el area del imput. 
    - *Boton para guardar codigo:* Se podra almacenar el codigo que se escriba en caso de que se requiera.
    - *Boton de guardar salida:*: Se almacenara en un archivo la salida que se obtuvo despues de ejecutar el codigo, es decir se almacenara lo que se ve en pantalla en la seccion del area del output.

---
## Gramatica 
```bash
grammar Ru;

programa
 : bloque EOF
 ;

bloque
 : sentencia*
 ;

sentencia
 : asignacion
 | declaracion
 | declaracion_funcion
 | llamada_funcion
 | sentencia_if
 | sentencia_while
 | sentencia_for
 | log
 | imprimir
 | OTRO {System.err.println("caracter desconocido: " + $OTRO.text);}
 ;

declaracion_funcion
 : VAR ID APAR lista_parametros? CPAR bloque_de_sentencia
 ;

lista_parametros
 : ID (COMA ID)*
 ;

llamada_funcion
 : ID APAR lista_argumentos? CPAR PTOCOMA
 ;

lista_argumentos
 : expr(COMA expr)*
 ;

declaracion
 : VAR ID ASIGNA expr PTOCOMA
 | VAR ID ASIGNA expr
 ;

asignacion
 : ID ASIGNA expr PTOCOMA
 | ID ASIGNA expr
 ;

sentencia_if
 : IF bloque_condicional (ELSE IF bloque_condicional)* (ELSE bloque_de_sentencia)?
 ;

bloque_condicional
 : APAR expr CPAR bloque_de_sentencia
 ;

bloque_de_sentencia
 : ALLAVE bloque CLLAVE
 | sentencia
 ;

sentencia_while
 : WHILE expr bloque_de_sentencia
 ;

sentencia_for
 : FOR APAR declaracion PTOCOMA expr PTOCOMA asignacion CPAR bloque_de_sentencia
 ;

log
 : LOG expr PTOCOMA
 ;

imprimir
: IMPRIMIR expr PTOCOMA
;

expr
 : expr POW<assoc=right> expr                      #powExpr
 | MENOS expr                                      #MenosUnarioExpr
 | NOT expr                                        #notExpr
 | expr op=(MULT | DIV | MOD) expr                 #multiplicacionExpr
 | expr op=(MAS | MENOS) expr                      #aditivaExpr
 | expr op=(MAYIG | MENIG | MENORQ | MAYORQ) expr  #relacionalExpr
 | expr op=(IGUAL | DIFQ) expr                     #igualdadExpr
 | expr AND expr                                   #andExpr
 | expr OR expr                                    #orExpr
 | atomo                                           #atomExpr
 ;

atomo
 : APAR expr CPAR #parExpr
 | (INT | FLOAT)  #numberAtom
 | (TRUE | FALSE) #booleanAtom
 | ID             #idAtom
 | STRING         #stringAtom
 | NIL            #nilAtom
 ;

```

## Compilación

Esta compilación se realiza en caso de no estar trabajandoo en el entorno de intelliji, el cual se puede ejecutar solamente con el icono de "Run", el cual se encarga de hacer el siguiente proceso.

1. Compilar los archivos de la gramatica , para asi generar el analizador lexico(RuLexer) y el analizador sintactico (RuParser)

 antlr4  Ru.g4

2. Despues de generar los archivos con antlr, se compilan todos los archivos que terminen en .java

javac *.java

3. Ejecuta el archivo que contiene el main, para inicializar la interfaz

java MainApp

---

## Instrucciones de uso

1. Ejecuta MainApp.java para abrir la interfaz.

2. Escribe código Ru en el área de entrada o usa el botón "Cargar archivo".

3. Haz clic en "Ejecutar" para ver los resultados.

4. Se Puede especificar un archivo de salida para guardar la ejecución, o el codigo en Ru.

---
## Flujo principal del programa

1. El usuario ingresa código Ru o carga un archivo desde la interfaz.

2. Se llama a Launcher, que crea el analizador léxico y sintáctico.

3. Se construye el árbol de análisis con ANTLR.

4. MyVisitor recorre el árbol y ejecuta el código.

5. Los resultados se muestran en la interfaz y se guardan en un archivo si se desea.

---
## Ejemplpos (imputs)
ejemplo 1 -> Factores

```bash
var Factores(numero){
    imprime "Factores del numero dado:";
    for(var i = 1; i<= numero; i = i+1){
        if(numero % i == 0){
            imprime i;
        }
    }
    imprime "";
}

var num=20;
imprime num;
Factores(num);
```

ejemplo 2 -> Fibonacci

```bash
imprime "PRIMEROS 10 NUMEROS DE LA SUCESION DE FIBONACCI";
var x=0;
var y=1;
var z=0;

imprime "0";
imprime "1";

for(var cont=1; cont <= 8; cont=cont+1){
	z=x+y;
	imprime z;
	x=y;
	y=z;
}
```

ejemplo 3
```bash
imprime "Calculadora de Calificacion";
var calificacion = 8.7;
if(calificacion < 6.0){
    imprime "NA";
}
else if(calificacion >= 6.0 && calificacion < 7.5){
    imprime "S";
}
else if (calificacion >= 7.5 && calificacion < 9.0){
    imprime "B";
}
else if(calificacion >= 9.0 && calificacion <= 10.0){
    imprime "MB";
}
else{
    imprime "Calificacion erronea";
}
```

ejemplo 4 

```bash
var MinimoComunMultiple(a, b){
	var temporal=0;
	var primero = a;
	var segundo = b;
	while(b != 0){
		temporal=b;
		b=a%b;
		a=temporal;
	}
	imprime (primero * segundo)/a;
}

imprime "MAXIMO COMUN DIVISOR";
MinimoComunMultiple(258, 597);
```



ejemplo 5

```bash
var MaximoComunDivisor(a, b){
	var temporal=0;
	while(b != 0){
		temporal=b;
		b=a%b;
		a=temporal;
	}
	imprime a;
}

imprime "MAXIMO COMUN DIVISOR";
MaximoComunDivisor(258, 597);
```
