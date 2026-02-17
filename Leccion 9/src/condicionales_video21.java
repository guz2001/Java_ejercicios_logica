import java.util.Scanner;

public class condicionales_video21 {
    public static void main (String []arg){
        /*
        Programa que da un descuento si la persona gasta mas de 300$
         */
        System.out.println("Ingrese el valor de su compra:");
        Scanner desCuento= new Scanner(System.in);
        double valorFinal=desCuento.nextDouble();
        if(valorFinal>300){
            double descuento= valorFinal*0.2;
            System.out.println("su valor a pagar con el 20% descuento es de "+
                    ( valorFinal - descuento )+ " se ahorro |" +descuento);
        }else{
            System.out.println("valor a pagar sin descuento por que no supero 300$ es ____ "+ valorFinal);
        }
    }
}
