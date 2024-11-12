import java.util.Random;

public class Class07 {
    public static void main(String[] args) {
        Random rand = new Random();

        int randomInt = rand.nextInt(10); // Genera un número entero aleatorio hasta el 10
        System.out.println("Número entero aleatorio: " + randomInt);

        double randomDouble = rand.nextDouble(); // Genera un número double aleatorio entre 0.0 y 1.0
        System.out.println("Número double aleatorio: " + randomDouble);

        boolean randomBoolean = rand.nextBoolean(); // Genera un valor booleano aleatorio
        System.out.println("Valor booleano aleatorio: " + randomBoolean);
        
        int min = 5;
        int max = 15;
        int randomNum = rand.nextInt((max - min) + 1) + min;

        System.out.println("Número aleatorio entre " + min + " y " + max + ": " + randomNum);
  

    }
}
        

