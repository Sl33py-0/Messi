//Confeccionar una clase que represente un empleado. Definir como atributos su nombre y su sueldo.Confeccionar los métodos para la 
//carga, otro para imprimir sus datos y por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000)
package metodos;
import java.util.Scanner;
public class Suel {
	private Scanner gato;
	String nom;
	int sueldo;
	
	public void Inicio() {
		gato=new Scanner(System.in);
		System.out.println("Ingrese el nombre del empleado: ");
		nom=gato.next();
		System.out.println("Ingrese el sueldo del empleado: ");
		sueldo=gato.nextInt();
	}
	
	void Datos() {
		System.out.println("Nombre: "+nom);
		System.out.println("Sueldo: "+sueldo);
	}
	
	void DebeImpuestos() {
		if (sueldo>3000) { System.out.println("El Empleado debe paga impuestos."); }
		else {System.out.println("El Empleado no debe pagar impuestos."); }
	}
	
	public static void main (String[]ar) {
		Suel suel1;
		suel1 = new Suel();
		suel1.Inicio();
		suel1.Datos();
		suel1.DebeImpuestos();
	}
	

}
