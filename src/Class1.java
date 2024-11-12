//Realizar un programa que pida la carga de dos vectores numéricos enteros de 4 elementos,
//y obtener la suma de los dos vectores, guardando el resultado en un tercer vector del mismo tamaño.
import java.util.Scanner;
public class Class1 {

	public static void main(String[] args) {
		Scanner gato = new Scanner(System.in);
		int [] V1 = new int [4];
		int [] V2 = new int [4];
		int [] V3 = new int [4];
		System.out.println("Ingrese los elementos del primer vector:");

		for(int i=0;i<V1.length;i++) {
			System.out.println("Elementos " + i + ":");
			V1[i]= gato.nextInt();
			}
		
		System.out.println("Ingrese los elementos del segundo valor:");
		
		for(int i=0;i<V2.length;i++) { 
			System.out.println("Elementos " + i + ":");
			V2[i]= gato.nextInt();}
	
			for(int i=0;i<V3.length;i++) {
				V3[i]= V1[i] + V2[i];}
			
			System.out.println("La suma de dos vectores es:");
			for (int i = 0; i < V3.length; i++) {
				System.out.println("Elemento" + i +":"+V3[i]);
			}
		

	}

}
