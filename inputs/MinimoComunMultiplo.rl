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
