package ejercicio_clase;
import java.util.Scanner;
public class operacion_Matematica {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese de la operacion (1 al 4)");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Suma: ");
                break;
            case 2:
                System.out.println("Resta: ");
                break;
            case 3:
                System.out.println("Multiplicacion: ");
                break;
            case 4:
                System.out.println("Division: ");
                break;
            default:
                System.out.println("Operacion no encontrada");
        }
    }
}
