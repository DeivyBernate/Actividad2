package actividad2;
public class Actividad2 {
    public static void main(String[] args) {
        double x,y,SUMA;
        SUMA = 0;
        x = 20;
        SUMA = SUMA + x;
        y = 40;
        x = x + Math.pow(y,2);
        SUMA = SUMA + (x/y);
        System.out.println("El valor de la suma es: " + SUMA);                                    
    }
}

