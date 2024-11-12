//Escribe un método que reciba dos números enteros y devuelva el mayor de ellos.
package metodos;

import java.util.Scanner;
public class Met1{
	public static void main(String[] args) {
		int a = 0,b = 0;
		Scanner gato = new Scanner(System.in);
		System.out.println("Ingrese dos numeros enteros: ");
		a=gato.nextInt();
		b=gato.nextInt();
		
		Met2.mm(a,b);
		
	}

	

}
