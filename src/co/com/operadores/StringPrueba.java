package co.com.operadores;

public class StringPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "El que se fue a Sevilla perdio su silla y el que se fue al Torreon, su sillon";
		
		System.out.println(cadena.charAt(0));
		System.out.println(cadena.charAt(11));
		
		System.out.println(cadena.endsWith("n"));
		System.out.println(cadena.startsWith("e"));
		
		System.out.println(cadena.equals("El que se fue"));
		
		System.out.println(cadena.indexOf("fue"));
		
		System.out.println(cadena.length());
		
		System.out.println(cadena.replace('a', 'e'));
		
		System.out.println(cadena.toLowerCase());
		
		System.out.println(cadena.toUpperCase());
		

	}

}
