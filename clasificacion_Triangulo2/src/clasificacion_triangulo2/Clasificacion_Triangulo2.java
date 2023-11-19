package clasificacion_triangulo2;

import java.util.Scanner;

public class Clasificacion_Triangulo2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lado1, lado2, lado3, resultado;
        System.out.println("Ingrese la longitud de los 3 lados del TRIÁNGULO: ");
        lado1 = teclado.nextDouble();
        lado2 = teclado.nextDouble();
        lado3 = teclado.nextDouble();
        resultado = lado1 + lado2;
        if (resultado < lado3) {
            System.out.println("No es un triangulo");
        } else {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("El trinagulo es Equilátero");
            } else {
                if (lado1 == lado2 && lado2 != lado3) {
                    System.out.println("El triángulo es Isóceles");
                } else {
                    if (lado1 != lado2 && lado2 != lado3) {
                        System.out.println("El triángulo es Escaleno");
                    }
                }
            }
        }
    }
}
