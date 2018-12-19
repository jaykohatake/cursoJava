package cursoJava;

import java.util.Scanner;

public class validacion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//pedir el primer nombre
		System.out.println("escriba el primer nombre");
		String primerNombre = scanner.nextLine();
		
		//pedir el primer apellido
		System.out.println("escriba el primer apellido");
		String apellidoPaterno = scanner.nextLine();
				
		//pedir la direccion
		System.out.println("escriba la direccion");
		String direccion = scanner.nextLine();
		
		//pedir la direccion
		System.out.println("escriba la ciudad");
		String ciudad = scanner.nextLine();
		
		//pedir el estado
		System.out.println("escriba el estado");
		String estado = scanner.nextLine();
		
		//pedir el codigo postal
		System.out.println("escriba el cp");
		String cp = scanner.nextLine();
				
		//pedir el codigo postal
		System.out.println("escriba el telefono");
		String telefono = scanner.nextLine();
		
		//validar resultado
		System.out.println("\nValidar resultado");
		
		if(!validacionEntrada.validarPrimerNombre(primerNombre)) {
			System.out.println("Primer Nombre invalido");
		}
		if(!validacionEntrada.validarApellidoPaterno(apellidoPaterno)) {
			System.out.println("Primer apellido invalido");
		}
		if(!validacionEntrada.validarDireccion(direccion)) {
			System.out.println("direccion invalido");
		}
		if(!validacionEntrada.validarCiudad(ciudad)) {
			System.out.println("ciudad invalido");
		}
		if(!validacionEntrada.validarEstado(estado)) {
			System.out.println("estado invalido");
		}
		if(!validacionEntrada.validarCP(cp)) {
			System.out.println("cp invalido");
		}
		if(!validacionEntrada.validarTelefono(telefono)) {
			System.out.println("telefono invalido");
		}
	}

}
