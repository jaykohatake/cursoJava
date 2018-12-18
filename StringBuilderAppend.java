package cursoJava;

public class StringBuilderAppend {

	public static void main(String[] args) {
		Object refObject = "hola";
		String cadena = "adios";
		char[] arregloChar = {'a','b','c'};
		boolean valorBoolean = true;
		int valorInt = 7;
		long valorLong = 10000000000000L;
		float valorFloat = 2.5f;
		double valorDouble = 33.33;
		
		StringBuilder ultimoBuffer = new StringBuilder("ultimo buffer");
		StringBuilder buffer = new StringBuilder();
		
		//metodo append para agregar elementos al final
			buffer.append(refObject)
				.append("\n")
				.append(cadena)
				.append("\n")
				.append(arregloChar)
				.append("\n")
				.append(arregloChar,0,3)
				.append("\n")
				.append(valorBoolean)
				.append("\n")
				.append(valorInt)
				.append("\n");
						
		System.out.printf("%s%n%n", buffer.toString());	
	}
}
