import java.util.Scanner;

public class Ejercicio2 {
    public static void riesgoDeHielo(){

        int temp;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la temperatura");

        if((temp = teclado.nextInt())<2){
            System.out.println("Riesgo de hielo");
        } else if (temp >= 2 && temp < 15) {
            System.out.println("Hace frio");
        } else if (temp >= 15 && temp < 30) {
            System.out.println("Buenas temperatura");
        } else if (temp >= 30) {
            System.out.println("Demasiado calor");
        }

    }
}
