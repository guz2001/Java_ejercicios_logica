import java.util.Scanner;

public class bucles_ejercicio_cuadrado_negativo {
    public static void main(String[] args){
        /*
        Ejercicio
         */
        Scanner entrada= new Scanner(System.in);
        System.out.println("ingrese un numero para sacar su cuadrado");
        double numero=entrada.nextInt();
        while(numero>=0){
            System.out.println("numero del cuadrado inicial es: "+ numero);
            double cuadrado= Math.pow(numero,2);
            System.out.println("el cuadrado es: "+  cuadrado);
            System.out.println("digite otro numero: ");
            numero=entrada.nextInt();

        }

    }
}
