package ejercicio_clase;
public class Ejercicio_clase {
    public static void main(String[] args) {
        double x = 2;
        double y;
        if (x>=-3 && x<=2){
            y = Math.pow(x, 2) + 2 * x-3;
        }else if (x > 2 && x <=10){
                y = 5 * x + 7;
        } else {
            y = 0;
        }
        System.out.print("x - " + x + "y - " + y);
    }
}
