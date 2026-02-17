import java.util.Scanner;
import java.util.Random;

public class ejerciciovideo32_bucles {
    public static void main(String[] args){
        /*
        Realizar un juego  para adviniar un numero del 0 al 100
        luego ir pidiendo numeros indicando si es mayor o menor segun sea mayor o menos respecto a n
        el proceso termina cuando el usuario acierta y muestra el numero de intentos
         */
        Scanner adivina= new Scanner(System.in);
        System.out.println("ingrese un numero para adivinar");
        int numeroAdivina=adivina.nextInt();
        Random random= new Random();
        int numAleatorio= random.nextInt(0, 100);
        System.out.println("numero aleatorio generado ---");
        int numIntentos=1;
        /*
        while(numeroAdivina!=numAleatorio){
            System.out.println("ingrese otro numero:");
            numeroAdivina=adivina.nextInt();
            if(numeroAdivina>numAleatorio){
                System.out.println("el numero  ingresado es mayor al aleatorio \n" +
                        "_____________Intenete denuevo_________");
            }else if (numeroAdivina<numAleatorio){
                System.out.println("el numero ingresado es menor al aleatorio \n" +
                        "_______Intenete denuevo______ ");
            }else {
                System.out.println("felicidades Era el numero => "+ numAleatorio );
            }
            numIntentos++;

        }

         */
        System.out.println("total numero intentos es de "+ numIntentos);
        int suma=0;
        suma++;
        suma+=suma;
        System.out.println(suma);

    }


}
