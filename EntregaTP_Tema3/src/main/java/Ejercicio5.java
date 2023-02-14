import java.util.Scanner;

public class Ejercicio5 {
    public static void calcularNomina(){
        String nombre,apellido;
        int puesto,horas, tarifa,hijos;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu apellido:");
        apellido = teclado.nextLine();
        System.out.println("Dime tu nombre:");
        nombre = teclado.nextLine();
        System.out.println("Dime dime tu puesto(1-Agente de servicio, 2-Empleado de oficina, 3-Directivo):");
        puesto = teclado.nextInt();
        System.out.println("Dime tus horas trabajadas:");
        horas = teclado.nextInt();
        System.out.println("Dime tu tarifa horaria:");
        tarifa = teclado.nextInt();
        System.out.println("Cuantos hijos tienes? :");
        hijos = teclado.nextInt();





    }

}



