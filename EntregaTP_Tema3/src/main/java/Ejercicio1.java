import java.util.Scanner;

public class Ejercicio1 {
    public static void riesgoDeHielo(){
        int temp;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la temperatura");

        if((temp = teclado.nextInt())<2){
            System.out.println("Riesgo de hielo");
        }else{
            System.out.println("No hay riesgo de hielo");
        }
    }
}
