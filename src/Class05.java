import java.util.Scanner;
public class Class05 {
	public static void main(String[] args) {
		Scanner gato = new Scanner(System.in);
		String[] nombres= {"Luis", "Maria", "Juan"};
		int[] edades= {34, 29, 21};
		boolean encon = false;
		System.out.println("Ingrese el nombre que busca: ");
		String Buscarnombre = gato.nextLine();
		
		for ( int i = 0; i < nombres.length; i++) {
			 if (nombres[i].equalsIgnoreCase(Buscarnombre)) {
			System.out.println(Buscarnombre+ " Tiene "+ edades[i] + " Años.");
			encon = true; }
		
			
			if(i == nombres.length)
				System.out.println("Nombre no encontrado.");	
			else
				System.out.println(Buscarnombre + " tiene " + edades[i] + " años.");	
		
			
		}
		
		

	}
}

