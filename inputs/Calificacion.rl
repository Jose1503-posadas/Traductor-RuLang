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