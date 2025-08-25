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
