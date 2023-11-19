package costo_paquetes3;
import java.util.Scanner;
public class Costo_Paquetes3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int region,  costo1, costo2, costo3;
        double pesoPaquete;
        System.out.println("Ingrese el peso del paquete en KG: ");
        pesoPaquete = teclado.nextDouble();
        System.out.println("Si su region es local, ingrese el numero 1: ");
        System.out.println("Si su regio es Nacional, ingrese el numero 2: ");
        System.out.println("Si su region es otra, ingrese 3: ");
        region = teclado.nextInt();
        costo1 = 5;
        costo2 = 10;
        costo3 = 15;
        switch (region){
            case 1:
                System.out.println("Local");
                break;
            case 2:
                System.out.println("Nacional");
                break;
            case 3:
                System.out.println("Otras");
                break;
        }
        if (pesoPaquete < 5 && region == 1){
            System.out.println("El costo de envío es de: " + costo1 + "Dólares");
        } else {
            if (pesoPaquete >= 5 && pesoPaquete < 10 && region == 2){
                System.out.println("El costo de envío es de: " + costo2 + "Dólares");
            } else {
                System.out.println("El costo de envio es de: " + costo3 + "Dólares");
            }
        }
    }   
}
