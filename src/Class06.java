//Se tienen las notas del primer parcial de los alumnos de dos cursos, el curso A y el curso B, 
//cada curso cuenta con 5 alumnos. Realizar un programa que muestre el curso que obtuvo el mayor promedio general.
import java.util.Scanner;
public class Class06 {

	public static void main(String[] args) {
		Scanner gato = new Scanner(System.in);
		int [] V1 = new int [5];
		int [] V2 = new int [5];
		int prom1=0,prom2=0;
		System.out.println("Notas del Curso A:");

		for(int i=0;i<V1.length;i++) {
			System.out.println("Ingrese la nota del alumno "+i+ ":");
			V1[i]= gato.nextInt();
			}
		
		System.out.println("Notas del Curso B:");
		
		for(int i=0;i<V2.length;i++) { 
			System.out.println("Ingrese la nota del alumno" + i + ":");
			V2[i]= gato.nextInt();}
		
		prom1= V1[0]+V1[1]+V1[2]+V1[3]+V1[4]/5;
		prom2= V2[0]+V2[1]+V2[2]+V2[3]+V2[4]/5;
		
		if (prom1 > prom2) { System.out.println("El promedio del curso A es el que tuvo el mayor promedio."); }
		else { if (prom2 > prom1) {System.out.println("El Promedio del curso B es el que tuvo el menor promedio.");}
		else { System.out.println("Ambos Cursos obtuvieron el mismo promedio.");}
		}
	}

}
