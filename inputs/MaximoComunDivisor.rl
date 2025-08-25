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
