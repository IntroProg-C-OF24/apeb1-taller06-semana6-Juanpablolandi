package ejercicio_clase;
import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Seleccione que quiere merendar: ");
        System.out.println("[1] Chaulafa: ");
        System.out.println("[2] Repe: ");
        System.out.println("[3] Tallarin");
        System.out.println("Ingrese su opcion: ");
        int opcion = sc.nextInt();
        if (opcion == 1){
            System.out.println("Comiendo chaulafan");
        } else 
            if (opcion == 2){
            System.out.println("Comiendo Repe");
        } else 
                if (opcion == 3){
            System.out.println("Comiendo tallarin");
        } else {
            System.out.println("Opcion incorrecta");
        }
    }
    
}
