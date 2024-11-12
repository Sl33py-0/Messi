package menu;
import java.util.Scanner;
public class Men {
	static Scanner gato = new Scanner(System.in);
	static int esp=0;
	static String [] nombres = new String[50];
	static String [] apellidos = new String[50];
	static String [] telefonos = new String[50];
	static String [] correos = new String[50];
	static int [] edades = new int[50];
	static String [] direcciones = new String[50];
	static boolean [] EC = new boolean[50];
	static boolean [] fav = new boolean[50];
	static int cont=0;
	
	public static void main(String[]args) {
		Men menu=new Men();
		int op, contra;
		System.out.println("Ingrese la contraseña (4 numeros): ");
		contra=gato.nextInt();
		if (contra == 2404) { 
		do {
		System.out.println("- AGENDA -");
		System.out.println("1- Ingreso");
		System.out.println("2- Eliminacion");
		System.out.println("3- Listado");
		System.out.println("4- Busqueda");
		System.out.println ("5- Extras");
		System.out.println("0- Salir");
		System.out.print("Opcion:");
		op=gato.nextInt(); 
		switch(op) {
		
		case 1: menu.ingreso();
		break;
		case 2: menu.eliminacion();
		break;
		case 3: menu.listado();
		break;
		case 4: menu.busqueda();
		break;
		case 5: menu.extra();
		break;}
		
		}while(op!=0);
		}else {System.out.println("Contraseña Incorrecta");}
		
	}
	public void ingreso() {
		System.out.println("Ingrese los datos del nuevo contacto:");

        System.out.print("Nombre: ");
        nombres[cont] = gato.next();
        
        System.out.print("Apellido: ");
        apellidos[cont] = gato.next();

        System.out.print("Teléfono: ");
        telefonos[cont] = gato.next();

        System.out.print("Email: ");
        correos[cont] = gato.next();

        System.out.print("Edad: ");
        edades[cont] = gato.nextInt();
        gato.nextLine();

        System.out.print("Dirección: ");
        direcciones[cont] = gato.next();
        gato.nextLine(); 

        System.out.print("¿Está casado? (true para casado, false para soltero): ");
        EC[cont] = gato.nextBoolean();
        
        System.out.print("Quieres agregar este contacto a favoritos? (true para si, false para no");
        fav[cont] = gato.nextBoolean();

        cont++;

        System.out.println("El Contacto ha sido agregado.");
    }
	
	public void eliminacion() {
		System.out.println("Ingrese el nombre del contacto que desea eliminar: ");
		String eliminar = gato.next();
		boolean encontrado = false;
		
		for (int i = 0; i < cont; i++) {
			if (nombres[i].equalsIgnoreCase(eliminar)) {
				encontrado = true;
				for (int x = i; x < cont - 1; x++) {
					nombres[x] = nombres[x + 1];
					apellidos[x] = apellidos[x + 1];
					telefonos[x] = telefonos[x + 1];
					correos[x] = correos[x + 1];
					edades[x] = edades[x + 1];
					direcciones[x] = direcciones[x + 1];
					EC[x] = EC[x + 1];
				}
				cont--;  
				System.out.println("El contacto ha sido eliminado.");
				break;
			}
		}
		if (!encontrado) {
			System.out.println("No se encontró el contacto con el nombre especificado.");
		}
	}

	
	public void listado() {
		int op;
		do { System.out.println(" - MENU LISTADO - ");
		System.out.println("1- Listar todos los datos");
		System.out.println("2- Listar solo nombres");
		System.out.println("3- Listar solo apellidos");
		System.out.println("4- Listar solo telefonos");
		System.out.println("5- Listar solo correos");
		System.out.println("6- Listar solo edades");
		System.out.println("7- Listar solo direcciones");
		System.out.println("8- Listar solo los contactos Solteros");
		System.out.println("9- Listar solo los contactos Casados");
		System.out.println("0- Salir");
		System.out.print("Opcion:");
		op=gato.nextInt(); 
		switch(op) {
		case 1:  if (cont == 0) {
            System.out.println("No hay contactos registrados.");
        } else {
            for (int i = 0; i < cont; i++) {
                System.out.println("Nombre: " + nombres[i] + " Apellido: " + apellidos[i] + " Teléfono: " + telefonos[i] + ", Email: " + correos[i] + ", Edad: " + edades[i] + ", Dirección: " + direcciones[i] +", Estado Civil: " + (EC[i] ? "Casado" : "Soltero"));}
        } break;
		case 2:  if (cont==0) {
            System.out.println("No hay contactos registrados.");
        } else {
            for (int i=0;i<cont;i++) {
                System.out.println("Nombre: " + nombres[i]);}}
			break;
		case 3:  if (cont==0) {
            System.out.println("No hay contactos registrados.");
        } else {
            for (int i=0;i<cont;i++) {
                System.out.println("Apellidos: " + apellidos[i]);}}
		break;
		case 4:  if (cont==0) {
            System.out.println("No hay contactos registrados.");
        } else {
        	for(int i=0;i<cont;i++) {
			System.out.println("Telefonos: "+telefonos[i]);}}
			break;
		case 5: if (cont == 0) {
            System.out.println("No hay contactos registrados.");
        } else { for(int i=0;i<cont;i++) {
			System.out.println("Correos: "+correos[i]);}}
			break;
		case 6:  if (cont == 0) {
            System.out.println("No hay contactos registrados.");
        } else { for(int i=0;i<cont;i++) {
			System.out.println("Edades: "+edades[i]);}}
			break;
		case 7:  if (cont == 0) {
            System.out.println("No hay contactos registrados.");
        } else { for(int i=0;i<cont;i++) {
			System.out.println("Direcciones: "+direcciones[i]);}}
		break;
		case 8: boolean encontrado = false;
			if (cont == 0) {
            System.out.println("No hay contactos registrados.");
        } else { for(int i=0;i<cont;i++) {
        	if (!EC[i]) {
                System.out.println("Nombre: " + nombres[i] + ", Estado Civil: Soltero");
                encontrado = true;}}
        if (!encontrado) {
            System.out.println("No hay contactos solteros.");}}
        break;
		case 9: boolean encontrado1 = false;
			if (cont == 0) {
            System.out.println("No hay contactos registrados.");
        } else { for(int i=0;i<cont;i++) {
        	if (EC[i]) {
                System.out.println("Nombre: " + nombres[i] + ", Estado Civil: Casado");
                encontrado1 = true;}}

        if (!encontrado1) {
            System.out.println("No hay contactos casados.");}}
        break;
        
		
		default: System.out.println("Opcion Incorrecta");
		}}while(op!=0);
		}
	
	
	public void busqueda() {
		int op;
		do { System.out.println(" - MENU BUSQUEDA - ");
		System.out.println("1- Buscar por nombres");
		System.out.println("2- Buscar por apellido");
		System.out.println("3- Buscar por telefono");
		System.out.println("4- Buscar por correo");
		System.out.println("5- Buscar por direccion");
		System.out.println("6- Buscar por edad");
		System.out.println("0- Salir");
		System.out.print("Opcion:");
		op=gato.nextInt(); 
		 gato.nextLine(); 
	        boolean encontrado = false;
		switch(op) {
		case 1: System.out.println("Ingrese el nombre que desee buscar: ");
        String buscarNombre = gato.next();
		  for (int i=0;i<cont;i++) {
	            if (nombres[i].equalsIgnoreCase(buscarNombre)) {
	            	System.out.println("- RESULTADO -");
	                System.out.println(buscarNombre + "fue encontrado:");
	                System.out.println("Nombre: " + nombres[i] + ", Teléfono: " + telefonos[i] + ", Email: " + correos[i] +
	                        ", Edad: " + edades[i] + ", Dirección: " + direcciones[i] +
	                        ", Estado Civil: " + (EC[i] ? "Casado" : "Soltero"));
	                encontrado = true;}}

	        if (!encontrado) {
	        	System.out.println("- RESULTADO -");
	            System.out.println("Nombre no encontrado.");}
	            break;
	        
		case 2: System.out.println("Ingrese el apellido que desee buscar: ");
        String buscarApe = gato.next();
		  for (int i = 0; i < cont; i++) {
	            if (apellidos[i].equalsIgnoreCase(buscarApe)) {
	            	System.out.println("- RESULTADO -");
	                System.out.println(buscarApe + "fue encontrado:");
	                System.out.println("Nombre: " + nombres[i] + ", Teléfono: " + telefonos[i] + ", Email: " + correos[i] +
	                        ", Edad: " + edades[i] + ", Dirección: " + direcciones[i] +
	                        ", Estado Civil: " + (EC[i] ? "Casado" : "Soltero"));
	                encontrado = true;}}

	        if (!encontrado) {
	        	System.out.println("- RESULTADO -");
	            System.out.println("Apellido no encontrado.");}
	            break;
	    
		case 3: System.out.print("Ingrese el Telefono que desea buscar: ");
        String buscarTel = gato.next();

        for (int i = 0; i < cont ; i++) {
            if (telefonos[i].equalsIgnoreCase(buscarTel)) {
            	System.out.println("- RESULTADO -");
            	System.out.println(buscarTel+ "fue encontrado:");
                System.out.println("Nombre: " + nombres[i] + ", Teléfono: " + telefonos[i] + ", Email: " + correos[i] +
                        ", Edad: " + edades[i] + ", Dirección: " + direcciones[i] +
                        ", Estado Civil: " + (EC[i] ? "Casado" : "Soltero"));
                encontrado = true;
            }}

        if (!encontrado) {
        	System.out.println("- RESULTADO -");
            System.out.println("Telefono no encontrado.");}
                break;
                
		case 4: System.out.println("Ingrese el correo que desee buscar: ");
                String buscarCorreo = gato.next();
        		  for (int i=0;i<cont;i++) {
        	            if (correos[i].equalsIgnoreCase(buscarCorreo)) {
        	            	System.out.println("- RESULTADO -");
        	                System.out.println(buscarCorreo + "fue encontrado:");
        	                System.out.println("Nombre: " + nombres[i] + ", Teléfono: " + telefonos[i] + ", Email: " + correos[i] +
        	                        ", Edad: " + edades[i] + ", Dirección: " + direcciones[i] +
        	                        ", Estado Civil: " + (EC[i] ? "Casado" : "Soltero"));
        	                encontrado = true;}}

        	        if (!encontrado) {
        	        	System.out.println("- RESULTADO -");
        	            System.out.println("Correo no encontrado.");}
        	            break;
        	            
		case 5: System.out.println("Ingrese la direccion que desee buscar: ");
        String buscarDir = gato.next();
		  for (int i=0;i<cont;i++) {
	            if (direcciones[i].equalsIgnoreCase(buscarDir)) {
	            	System.out.println("- RESULTADO -");
	                System.out.println(buscarDir + "fue encontrado:");
	                System.out.println("Nombre: " + nombres[i] + ", Teléfono: " + telefonos[i] + ", Email: " + correos[i] +
	                        ", Edad: " + edades[i] + ", Dirección: " + direcciones[i] +
	                        ", Estado Civil: " + (EC[i] ? "Casado" : "Soltero"));
	                encontrado = true;}}

	        if (!encontrado) {
	        	System.out.println("- RESULTADO -");
	            System.out.println("Direccion no encontrada.");}
	            break;
	            
		case 6: System.out.println("Ingrese la edad que desee buscar: ");
        int buscarEdad = gato.nextInt();
		  for (int i=0;i<cont;i++) {
	            if (edades[i]==buscarEdad) {
	            	System.out.println("- RESULTADO -");
	                System.out.println(buscarEdad + "fue encontrado:");
	                System.out.println("Nombre: " + nombres[i] + ", Teléfono: " + telefonos[i] + ", Email: " + correos[i] +
	                        ", Edad: " + edades[i] + ", Dirección: " + direcciones[i] +
	                        ", Estado Civil: " + (EC[i] ? "Casado" : "Soltero"));
	                encontrado = true;}}

	        if (!encontrado) {
	        	System.out.println("- RESULTADO -");
	            System.out.println("Edad no encontrada.");}
	            break; 
	        default: System.out.println("Opcion invalida");	
		}
		} while(op!=0);}
	
	public void extra() {
		int op = 0;
		do { System.out.println(" - MENU EXTRAS - ");
		System.out.println("1- Calcular promedios de edades");
		System.out.println("2- Editar informacion de Contacto");
		System.out.println("3- Agregar un contacto a favoritos.");
		System.out.println("0- Salir");
		System.out.print("Opcion:");
		op=gato.nextInt();
		switch(op) {	
		case 1: if (cont == 0) {
            System.out.println("No hay contactos registrados.");
            return;}
        int suma = 0;
        for (int i = 0; i < cont; i++) {
            suma += edades[i];}
        double promedio = (double) suma / cont;
        System.out.println("El promedio de edad de los contactos es: " + promedio);
        break;
        
		case 2: System.out.println("Ingrese el nombre del contacto que desea editar: ");
		String nombreEditar = gato.next();
		boolean encontrado = false;

		for (int i = 0; i < cont; i++) {
			if (nombres[i].equalsIgnoreCase(nombreEditar)) {
				encontrado = true;
				System.out.println("Contacto encontrado. Ingrese la nueva información.");

				System.out.print("Nombre (" + nombres[i] + "): ");
				nombres[i] = gato.next();

				System.out.print("Apellido (" + apellidos[i] + "): ");
				apellidos[i] = gato.next();

				System.out.print("Teléfono (" + telefonos[i] + "): ");
				telefonos[i] = gato.next();

				System.out.print("Email (" + correos[i] + "): ");
				correos[i] = gato.next();

				System.out.print("Edad (" + edades[i] + "): ");
				edades[i] = gato.nextInt();
				gato.nextLine();

				System.out.print("Dirección (" + direcciones[i] + "): ");
				direcciones[i] = gato.next();
				gato.nextLine();

				System.out.print("¿Está casado? (true para casado, false para soltero) (" + (EC[i] ? "Casado" : "Soltero") + "): ");
				EC[i] = gato.nextBoolean();

				System.out.println("El contacto ha sido actualizado.");
				break;
			}
		}
		if (!encontrado) {
			System.out.println("No se encontró el contacto con el nombre especificado.");} 
		break;
		
		}}while (op!=0);
		
}}
    
		
	