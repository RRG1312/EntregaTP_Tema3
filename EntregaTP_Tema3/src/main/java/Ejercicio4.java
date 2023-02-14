import java.util.Scanner;

public class Ejercicio4 {
    public static void cocinar(){
        Scanner teclado = new Scanner(System.in);

        String tipoCarne;
        int peso;
        char modoCoccion;

        System.out.println("Dime el tipo de carne(Vacuno o Cordero): ");
        tipoCarne = teclado.nextLine();
        System.out.println("Dime el peso del carne(en gramos):");
        peso = teclado.nextInt();
        System.out.println("Dime el tipo de coccion usando una letra(C->Casi Cruda, P-> Al Punto, B->Bien hecha)");
        modoCoccion = Character.toUpperCase(teclado.next().charAt(0));
        if(tipoCarne.toLowerCase().equals("vacuno")){
            if(modoCoccion=='B'){
                System.out.println("Tiempo de coccion sera "+((peso*(25*60))/500)+" segundos");
            } else if (modoCoccion=='P') {
                System.out.println("Tiempo de coccion sera "+((peso*(17*60))/500)+" segundos");
            }else if(modoCoccion=='C'){
                System.out.println("Tiempo de coccion sera "+((peso*(10*60))/500)+" segundos");
            }else{
                System.out.println("Modo de coccion incorrecto");
            }
        } else if (tipoCarne.toLowerCase().equals("cordero")) {
            if(modoCoccion=='B'){
                System.out.println("Tiempo de coccion sera "+((peso*(40*60))/400)+" segundos");
            } else if (modoCoccion=='P') {
                System.out.println("Tiempo de coccion sera "+((peso*(25*60))/400)+" segundos");
            }else if(modoCoccion=='C'){
                System.out.println("Tiempo de coccion sera "+((peso*(15*60))/400)+" segundos");
            }
        }else{
            System.out.println("Tipo de carne incorrecto");
        }


    }
}
