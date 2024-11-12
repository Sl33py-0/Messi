//Realizar un programa que permita ingresar un vector de 8 elementos, e informe:
//El valor acumulado de todos los elementos del vector.
//El valor acumulado de los elementos del vector que sean mayores a 36.
//Cantidad de valores mayores a 50.
import java.util.Scanner;
public class Class04 {
	public static void main(String[] args) {
		Scanner gato = new Scanner(System.in);
		int [] num = new int [8];
		int acum=0, m50 = 0;
		int sum36= 0;
	
		for(int i=0;i<num.length;i++) {
		System.out.println("Ingrese el valor: ");
		num[i]=gato.nextInt();
		
		acum += num[i];
		
		if (num[i] > 36) {
			sum36+= num[i];}
		
		if (num[i] > 50) {
			m50++;}
		}
		
		System.out.println("Acumulado de todos los elementos del vector: "+acum);
		System.out.println("Acumulado de todos los elementos mayor a 36: "+sum36);
		System.out.println("Cantidad de valores mayores a 50: "+m50);
		
	}}