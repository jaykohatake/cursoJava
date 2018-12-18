package cursoJava;

public class StringBuilderInsertDelete {

	public static void main(String[] args) {
		Object refObject = "hola";
		String cadena = "adios";
		char[] arregloChar = {'a','b','c'};
		boolean valorBoolean = true;
		int valorInt = 7;
		long valorLong = 10000000000000L;
		float valorFloat = 2.5f;
		double valorDouble = 33.33;
		
		StringBuilder buffer = new StringBuilder();
		buffer.insert(0, refObject);
		System.out.println(buffer);
		buffer.deleteCharAt(3);
		System.out.println(buffer);
	}
}
