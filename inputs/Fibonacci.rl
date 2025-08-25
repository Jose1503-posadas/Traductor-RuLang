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
