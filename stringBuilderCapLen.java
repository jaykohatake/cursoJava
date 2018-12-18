package cursoJava;

public class stringBuilderCapLen {

	public static void main(String[] args) {
		StringBuilder buffer = new StringBuilder("hola, como estas?");
		System.out.printf("buffer = %s%nlongitud = %d%ncapacidad = %d%n",buffer.toString(),buffer.length(),buffer.capacity());
		
		//metodo length= tamaño de la cadena
		//metodo capacity = capacidad del almacenamiento
		
		buffer.ensureCapacity(75);
		System.out.printf("Nueva capacidad = %d%n",buffer.capacity());
		
		
		buffer.setLength(20);
		System.out.printf("Nueva longitud = %d%nbuffer = %s%n", buffer.length(),buffer.toString());
}
}
