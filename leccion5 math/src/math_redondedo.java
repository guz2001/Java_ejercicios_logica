import java.util.Scanner;

import static java.lang.Double.*;

public class math_redondedo {
    public static void  main(String[] args){
        //scanner para redondeo
        Scanner redondeo= new Scanner(System.in);
        System.out.println("escoja un numero con comas para redonder:");
        double exact= redondeo.nextDouble();
        long redo=Math.round(exact);
        System.out.println("numero redondeado a:"+redo);
        int conversicon= (int)exact;
        System.out.println("convertido a int : "+conversicon);
        /*
            En este apartado se muestra la manera en que se redondea un numero decimal a entero
            la equivalencia es la siguiente
            int => float
            long => double
            esto es debido a que depende de que tan exacto es el numero para redondear se soporta el tamaño del numero
            int es mas corto que long
            float es mas corto que double
         */
        //ejemplos redondeo primero con int

        float cortoF = 2999122.12f;
        int exactoF= Math.round(cortoF);
        System.out.println("el valor redondeado es: "+ exactoF);

        //AHORA CON DOUBLE LONG NUMEROS GRANDES

        double largoD=18912838.1231213;
        long exactoD=Math.round(largoD);
        System.out.println("el valor redondeado a esreeeeeeeeee: "+exactoD);


    }
}

