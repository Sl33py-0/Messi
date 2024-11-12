import java.util.Scanner;
public class Class2 {

	public static void main(String[] args) {
		Scanner gato = new Scanner(System.in);
		int [] edades = new int [5];
		
		System.out.println("Ingrese el primer valor:");
		edades [0] = gato.nextInt();
		System.out.println("Ingrese el segundo valor:");
		edades [1] = gato.nextInt();
		System.out.println("Ingrese el tercer valor:");
		edades [2] = gato.nextInt();
		System.out.println("Ingrese el cuarto valor:");
		edades [3] = gato.nextInt();
		System.out.println("Ingrese el quinto valor:");
		edades [4] = gato.nextInt();
		
		System.out.println("Las edades ingresadas son: ");
		for (int x=0;x>5;x++) {
			System.out.println(edades[x]);	}
		

	}

}
