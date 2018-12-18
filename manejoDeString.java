package cursoJava;

public class manejoDeString {
	
	public static void main(String[] args) {
		
		/*tema inicial para visualizar que los string solo tienen apuntadores
		  de memoria y sus datos no puede ser cambiados normalmente*/
		
	String hola = "Hola";
	String hola2 = hola ;
	
	hola = "adios";
	
	System.out.println(hola);
	System.out.println(hola2);
	
}
}