import java.util.Random;
import java.util.Scanner;
public class Class03 {
	public static void main(String[] args) {
		Scanner gato = new Scanner(System.in);
		 Random random = new Random();

	        int[]u3={0,0,0};
	        boolean seguirJugando=false;
	        String seguir;
	        int numR;
	        do {
	        	do {numR = random.nextInt(10) + 1;
	        	} while (numR == u3[0] || numR == u3[1] || numR == u3[2]);

	            System.out.println("NUMERO ALEATORIO (1 al 10): " + numR);

	         
	             for (int x = 0;x<u3.length;x++) {
	                 if ( x == (u3.length-1)) {
	                	 u3[u3.length-1] = numR;}
	                 else {
	 		            u3[x] = u3 [x+1]; }
	 		            
	                 }
		           

	             
	       
	            System.out.println("Ultimos 3 números:");
	            for (int x = 0; x < 3; x++) {
	                System.out.print(u3[x]);
	                if (x < 2)
	                    System.out.print(" - ");
	            }
	            
	            System.out.print("\n¿Generar otro número? (s/n): ");
	            seguir = gato.next();
	            seguirJugando = seguir.equalsIgnoreCase("s");

	            System.out.println("");
	        } while (seguirJugando);

	        gato.close();
	    }
	}


