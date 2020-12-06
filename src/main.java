import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        double IBA;
        double MontoUITDescont;
        double rentaNetaGravable;
        double sueldo;

        Scanner teclado = new Scanner(System.in);

        // Solicitamos que el usuario ingrese el sueldo mensual:
        System.out.print("Ingrese el sueldo = ");
        sueldo = teclado.nextDouble();

        //Calculamos el sueldo total anual
        double totalSueldoAnual = 12*sueldo;
        //Monto de 7 UIT descontable
        MontoUITDescont = 7*4300;
        //Renta neta gravable de impuesto de quinta
        rentaNetaGravable = totalSueldoAnual - MontoUITDescont;

        =+SI(G5<=(G6),0,(SI(G7<=E10,G7,E10)));

        if(totalSueldoAnual<=MontoUITDescont){

        }


        System.out.println("El sueldo total anual = " + totalSueldoAnual);
        System.out.println("AFP                   = " + 0.1*totalSueldoAnual);
        System.out.println("Comision              = " + 0.38/100*totalSueldoAnual);
        System.out.println("Seguro                = " + 1.35/100*totalSueldoAnual);
        System.out.println("Renta Quinta          = " + "Calculando");
        System.out.println("Seguro Medico         = " + 128);



    }
}
