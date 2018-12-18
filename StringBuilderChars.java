package cursoJava;

public class StringBuilderChars {

	public static void main(String[] args) {
		StringBuilder buffer = new StringBuilder("hola a todos");
		
		System.out.printf("buffer = %s%n", buffer.toString());
		
		System.out.printf("Caracter en 0 : %s%nCaracter en 3 : %s%n%n", buffer.charAt(0),buffer.charAt(3));
		
		char[] arregloChars = new char [buffer.length()];
		
		buffer.getChars(0, buffer.length(), arregloChars, 0);
		
		System.out.print("LOS CARACTERES SON : ");
		
		for (char caracter : arregloChars) {
			System.out.print(caracter);
		}
		
		buffer.setCharAt(0, 'h');
		buffer.setCharAt(7,'t');
	}
}
