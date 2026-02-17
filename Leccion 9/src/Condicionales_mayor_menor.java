import java.util.Scanner;

public class Condicionales_mayor_menor {
    public static void  main(String[] args){
        /*
        Pedir dos numero y decidir cual es mayor
         */
        Scanner entradaNum= new Scanner(System.in);
        double numeroEscogido1,numeroEscogido2;
        Scanner entrada= new Scanner(System.in);
        System.out.println("ingrese un numero:");
        numeroEscogido1=entrada.nextDouble();
        System.out.println("ingrese otro numero: ");
        numeroEscogido2=entrada.nextDouble();
        if(numeroEscogido1<numeroEscogido2 ){
            System.out.println("numero"+numeroEscogido1+" es  menor que "+ numeroEscogido2);
        } else if (numeroEscogido2<numeroEscogido1){
            System.out.println("numero "+numeroEscogido2+" es menor que "+ numeroEscogido1);

        } else if (numeroEscogido1== numeroEscogido2) {
            System.out.println("numeros iguales ");

        }


    }
}
