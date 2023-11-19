package facturar_productos1;
import java.util.Scanner;
public class Facturar_productos1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double iphone, ipad, iphoneCosto,ipadCosto, iphoneCostoT, ipadCostoT, subtotal, descuento1, descuento2, envio, subtotalIva, montoFactura1, montoFactura2;
        System.out.println("Ingrese el Envio que se puede adquirir: ");
        envio = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de Iphones Compradas: ");
        iphone = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de Ipads Compradas: ");
        ipad = teclado.nextDouble();
        System.out.println("Ingrese el costo del IPHONE por unidad: ");
        iphoneCosto = teclado.nextDouble();
        iphoneCostoT = iphone * iphoneCosto;
        System.out.println("Ingrese el costo por unidad del IPAD: ");
        ipadCosto = teclado.nextDouble();
        ipadCostoT = ipad * ipadCosto;
        subtotal = (ipadCostoT + iphoneCostoT);
        subtotalIva = ((ipadCostoT + iphoneCostoT) * 0.12) + subtotal;
        descuento1 = (subtotal * 0.20);
        descuento2 = (subtotal * 0.050);
        montoFactura1 = (subtotal + (subtotal - descuento1)*0.12)+envio;
        montoFactura2 = (subtotal + (subtotal - descuento1)*0.12);
        System.out.println("Costo Iphones: " + iphoneCostoT);
        System.out.println("Costo Ipads. " + ipadCostoT);
        System.out.println("SUBTOTAL: " + subtotal);
        System.out.println("Subtotal + IVA: " + subtotalIva);
        if (montoFactura1>1000)
            System.out.println("DESCUENTO: " + descuento1);
        else
            System.out.println("DESCUENTO: " + descuento2);
        if (subtotal < 5000)
            System.out.println("ENVIO: " + envio);
        System.out.println("MONTO FACTURA: " + montoFactura1);
    }   
}
