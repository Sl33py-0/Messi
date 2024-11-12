package proyecto;
import java.util.Scanner;

import menu.Men;
public class Almacen {
	static Scanner gato = new Scanner(System.in);
	static int esp=0;
	static int [] ID = new int[esp];
	static String [] car = new String[esp];
	static int [] valor = new int[esp];


	public static void main(String[] args) {
		Men menu=new Men();
		int op;
		int contra;
		
		System.out.println("Ingrese la contraseña (Numerico): ");
		contra=gato.nextInt();
		if (contra == 1002) { 
		do {
			System.out.println("Ingrese cuantos espacios disponibles para cajas hay: ");
			esp=gato.nextInt();
		System.out.println("- Almacen de Supermercado -");
		System.out.println("1- Ingreso de caja");
		System.out.println("2- Retiro de caja");
		System.out.println("3- Listado de todas las cajas.");
		System.out.println("4- Busqueda de caja");
		System.out.println("0- Salir");
		System.out.print("Opcion:");
		op=gato.nextInt(); 
		switch(op) {
		case 1: for(int i=0;i<esp;i++) {
			System.out.println("Ingrese el numero identificador:");
			ID[i]=gato.nextInt();
			System.out.println("Ingrese la caracteristica principal del objeto dentro de la caja:");
			car[i]=gato.next();
			System.out.println("Ingrese el valor de la caja:");
			valor[i]=gato.nextInt();}
			break;
			
		case 3: for (int i=0;i<esp;i++) {
			
		}
		}

	
}while(op!=0);
		
		}else {System.out.println("La Contraseña es incorrecta, Usted no esta autorizado para modificar el almacen");}
}
}