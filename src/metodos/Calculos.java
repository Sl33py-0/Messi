//Implementar la clase operaciones. Se deben cargar dos valores enteros, 
//calcular su suma, resta, multiplicación y división, cada una en un método, imprimir dichos resultados.
package metodos;
import java.util.Scanner;
public class Calculos {
	private Scanner gato;
	int n1,n2;
	int sum,r,mult,div;
	
	public void Ingreso(){
		Scanner gato = new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		n1=gato.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		n2=gato.nextInt();
}
	
	void Suma() {
		sum=n1+n2;
		System.out.println("La suma de ambos valores es: "+sum);
	}
	void Resta() {
		r=n1-n2;
		System.out.println("La resta de ambos valores es: "+r);
	}
	void Multiplicacion() {
		mult=n1*n2;
		System.out.println("La Multiplicacion de ambos valoreses: "+mult);
	}
	void Division() {
		div=n1/n2;
		System.out.println("La Division de ambos valores es: "+div);
	}
	
	public static void main(String[]ar) {
		Calculos calc;
		calc = new Calculos();
		calc.Ingreso();
		calc.Suma();
		calc.Resta();
		calc.Multiplicacion();
		calc.Division();
	}
}
