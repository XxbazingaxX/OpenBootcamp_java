import java.util.Scanner;

public class Tema1_ejer2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Introduce un precio");

        int precio = scanner.nextInt();

        double iva = precio * 0.21;

        double PrecioFinal = precio + iva;

        System.out.println("El precio con iva es de: " + PrecioFinal);
    }

}
