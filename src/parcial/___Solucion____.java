package parcial;

public class ___Solucion____ {

	double[] s = {1200.5,1600.2,700.4,1000.3,4700.1,600.0,
			3400.8,3600.6,5100.9,2000.7};
	
	//TAMAÑO
	public int tamaño(){
		return s.length ;
	}
	
	//OBTENER
	public double obtener(int pos){
		return s[pos];
	}
	
	//PROMEDIO
	public double promedio(){
		double prom=s[0];
		for (double aux : s) {
			prom+=aux;
		}
		return prom/s.length;
	}
	
	//PRECIO MAYOR
	public double precioMayor(){
		double may=s[0];
		for (double aux : s) {
			if(aux>may)
				may=aux;
		}
		return may;
	}
	
	//PRECIO MENOR
	public double precioMenor(){
		double meno=s[0];
		for (double aux : s) {
			if(aux<meno)
				meno=aux;
		}
		return meno;
	}
	
	//SUPERIORES AL PROMEDIO
	public int superioresAlPromedio(){
		int c=0;
		double p=promedio();
		for (double aux : s) {
			if(aux>p)c++;
		}
		return c;
	}
	
	//INFERIORES AL PROMEDIO
	public int menoresAlPromedio(){
		int c=0;
		double p=promedio();
		for (double aux : s) {
			if(aux<p)c++;
		}
		return c;
	}
	
	//PRIMER PRECIO A 1000.0
	public int primerPrecioMayorAlMinimo(){
		int salida=-1;
		for (int i=0; i<s.length;i++){
			if(s[i]>1000){
				salida=i;
				break;
			}
		}
		return salida;
	}
	
	//ULTIMO PRECIO MENOR A 1000.0
	public int ultimoPrecioMenorAlMinimo(){
		int salida=-1;
		for (int i = 5; i<s.length; i++) {
			if(s[i]<1000){
				salida=i;
				break;
			}
		}
		return salida;
	}
}











