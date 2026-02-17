import java.util.Scanner;

public class condicionales_video21_trabajador {
    public static void main (String[]args){
        /*
        Programa que ayuda a un obrero a calcular cuanto gana
        si trabaja 40 horas o menos las horas son 16$
        si trabaj mas de 40 horas las horas hasta 40 son 16 y por cada hora extra son 20$
         */
        System.out.println("ingrese sus horas laboradas en la semana");
        Scanner horasObrero= new Scanner(System.in);
        double horasIngresadas= horasObrero.nextDouble();

        if(horasIngresadas>40){
            double horasExtra= (horasIngresadas-40);
            double horaNormal=(horasIngresadas-horasExtra);
            horasExtra*=20;
            horaNormal*=16;
            System.out.println("hora extra "+ horasExtra+"$ horas normales:  "+horaNormal);
            System.out.println("horas laboradas  total a pagar  con aumento  " + (horasExtra+horaNormal));
        }else{
            System.out.println("horas laboradas son "+ horasIngresadas +" total a pagar: "+(horasIngresadas*16));
        }
    }

}
