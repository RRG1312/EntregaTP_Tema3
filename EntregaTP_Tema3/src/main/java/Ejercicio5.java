import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio5 {
    public static void calcularNomina(){
        String nombre,apellido;
        int puesto,horas,hijos;
        double tarifa;
        double salarioBruto=0;

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
        tarifa = teclado.nextDouble();
        System.out.println("Cuantos hijos tienes? :");
        hijos = teclado.nextInt();

        salarioBruto = calculoSalarioBruto(horas,tarifa);
        double deduccionesTotales = calculoPagoDeudaSocial(salarioBruto)+calculoPagoContingenciasComunes(salarioBruto) +
                calculoPagoSeguroMedico(salarioBruto)+calculoPagoFondoPensiones(salarioBruto)+calculoPagoSeguroDesempleo(salarioBruto)+calculoPagoPensionComplementaria(salarioBruto)+calculoPagoJubilacionAnticipada(salarioBruto);
        double salarioNeto = salarioBruto-deduccionesTotales+calculoReciboPrimaFamiliar(hijos);
        System.out.println("Nomina de "+nombre+" "+apellido);
        System.out.println("Salario bruto: " +salarioBruto+"$");
        System.out.println("-Contribucion para el pago de la deuda social: "+calculoPagoDeudaSocial(salarioBruto)+"$");
        System.out.println("-Contribucion de  contingencias comunes no imponible: "+calculoPagoContingenciasComunes(salarioBruto)+"$");
        System.out.println("-Seguro medico: "+calculoPagoSeguroMedico(salarioBruto)+"$");
        System.out.println("-Fondo de pensiones: "+calculoPagoFondoPensiones(salarioBruto)+"$");
        System.out.println("-Seguro de desempleo: "+calculoPagoSeguroDesempleo(salarioBruto)+"$");
        System.out.println("-Pension complementaria: "+calculoPagoPensionComplementaria(salarioBruto)+"$");
        System.out.println("-Contribucion de jubilacion anticipada: "+calculoPagoJubilacionAnticipada(salarioBruto)+"$");
        System.out.println("-Deducciones totales de los empleados: "+deduccionesTotales+"$");
        System.out.println("-Prima familiar: "+calculoReciboPrimaFamiliar(hijos)+"$");
        System.out.println("Salario neto a pagar "+salarioNeto);


    }

    public static double calculoSalarioBruto(int horas, double tarifa){
        double res = 0;
        if(horas > 169){
            res = 169 * tarifa;
            horas -= 169;
            if(horas > 11){
                res += 11 * (tarifa*1.5);
                horas -= 11;
                res += horas * (tarifa*1.6);
            }else{
                res += horas * (tarifa*1.5);
            }
        }else{
            res = horas * tarifa;
        }
        return res;
    }

    public static double calculoPagoDeudaSocial(double bruto){
        return bruto*0.0349;
    }

    public static double calculoPagoContingenciasComunes(double bruto){
        return bruto*0.0615;
    }

    public static double calculoPagoSeguroMedico(double bruto){
        return bruto*0.0095;
    }

    public static double calculoPagoFondoPensiones(double bruto){
        return bruto*0.0844;
    }

    public static double calculoPagoSeguroDesempleo(double bruto){
        return bruto*0.0305;
    }

    public static double calculoPagoPensionComplementaria(double bruto){
        return bruto*0.0381;
    }

    public static double calculoPagoJubilacionAnticipada(double bruto){
        return bruto*0.0102;
    }

    public static double calculoReciboPrimaFamiliar(int hijos){

        if(hijos == 1){
            return 20;
        }else if(hijos ==2){
            return 50;
        }else if(hijos>2){
            return 70+20*hijos;
        }else{
            return 0;
        }
    }

}



