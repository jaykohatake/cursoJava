package cursoJava;

public class constructoresStringBuilder {
	public static void main(String[] args) {
		
		StringBuilder buffer1 = new StringBuilder();
		StringBuilder buffer2 = new StringBuilder(10);
		StringBuilder buffer3 = new StringBuilder("hola");
		
		System.out.printf("buffer 1 = \"%s\"%n", buffer1);
		System.out.printf("buffer 2 = \"%s\"%n", buffer2);
		System.out.printf("buffer 3 = \"%s\"%n", buffer3);
	}
}
