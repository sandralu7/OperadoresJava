package co.com.operadores;

public class ClaseOperadores {

	public static void main(String[] args) {
		int resultado = 1+2;
		System.out.println("1+2 = " + resultado);
		int resultadoOriginal = resultado;
		
		resultado = resultado - 1;
		System.out.println(resultadoOriginal + " - 1 = " + resultado);
		resultadoOriginal = resultado;
		
		resultado = resultado * 2;
		System.out.println(resultadoOriginal + " * 2 = " + resultado);
		resultadoOriginal = resultado;
		
		resultado = resultado / 2;
		System.out.println(resultadoOriginal + " / 2 = " + resultado);
		resultadoOriginal = resultado;
		
		resultado += 8;
		System.out.println(resultadoOriginal + " + 8 = " + resultado);
		resultadoOriginal = resultado;
		
		resultado = resultado % 7;
		System.out.println(resultadoOriginal +  " % 7  = " + resultado );
		
		String primeraCadena = "Esta es";
		String segundaCadena = " una cadena de caracteres concatenada.";
		String terceraCadena = primeraCadena +  segundaCadena;
		System.out.println(terceraCadena);
		
		int i = 3;
		

		
		System.out.println(i);
		++i;
		
		System.out.println(i);
		System.out.println(++i);
		
		System.out.println(i++);
		System.out.println(i);
		
		int valor1 = 1;
		int valor2 = 2;
		
		if(valor1==valor2) {
			System.out.println("valor1 ==  valor2");
		}
		if (valor1 != valor2)
			System.out.println("valor1 != valor2");
		if (valor1> valor2)
			System.out.println(" valor1 > valor2");
		if (valor1 < valor2) {
			System.out.println("valor1 < valor2");
		}
		/* Linea 1
		 * linea 2
		 * */
		if (valor1 <= valor2)
			System.out.println("valor1 <= valor2");
		
		valor1 = 1;
		valor2 = 2;
		//Comparación con &&
		if((valor1==1) & (1==3) & (valor2 == 2))
			System.out.println("valor1 es 1 AND valor2 es 2");
		
		
		
	}

}
