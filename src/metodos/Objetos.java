package metodos;
class Coche {
    String marca;
    String modelo;
    int anio;

    void arrancar() {
        System.out.println("El coche ha arrancado.");
    }
}

public class Objetos {
	

	    public static void main(String[] args) {
	        Coche miCoche = new Coche();  // Creación del objeto
	        miCoche.marca = "Toyota";
	        miCoche.modelo = "Corolla";
	        miCoche.anio = 2020;
	        miCoche.arrancar();  // Llamada al método del objeto
	    }
	
	        

}
