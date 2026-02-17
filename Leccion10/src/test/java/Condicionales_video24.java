import java.util.Scanner;

public class Condicionales_video24 {
    public static void main (String[] args){
        System.out.println("problema calendarios");
        /*
        Realizar un programa que pida el dia el mes y el año
        2-indicar si la fecha ingresada esta correcta
         */

        Scanner fechaCal= new Scanner(System.in);
        System.out.println("ingrese un fecha estrcitamente con el indicativo: \n" +
                "Dia: "+"\n"+"Año: "+"\n"+"Mes: "+"\n ----------------");
        System.out.println("Dia : ");
        int fechaDia= fechaCal.nextInt();
        System.out.println("Mes : ");
        int fechaMes= fechaCal.nextInt();
        System.out.println("Año: ");
        int fechaAnio= fechaCal.nextInt();


        if(fechaDia>0 && fechaDia<=30 && fechaMes>0 && fechaMes<=12 && fechaAnio>=0 && fechaAnio<=2026){
            System.out.println("La fecha esta correcta y es"+ " Dia:  "+fechaDia +" Mes:  "+ fechaMes + "Año: "+ fechaAnio);

        }else{
            System.out.println("volver a ingresar fecha con el orden indicado");
        }
    }
}
