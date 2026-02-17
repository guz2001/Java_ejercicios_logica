import java.util.Scanner;

public class Ejercicios_hackerankBucles {
    public static void main(String[] args){
        /*Objetivo
        En este desafío, vamos a utilizar bucles para ayudarnos a realizar algunos cálculos matemáticos simples.

                Tarea
        Dado un número entero,, imprime su primera múltiplos. Cada múltiplo(dónde) debe imprimirse en una nueva línea con el formato: N x i = result.

                Formato de entrada

        Un solo entero,.

        Restricciones

        Formato de salida

        Imprimirlíneas de salida; cada línea(dónde) contiene eldeen la forma:
        N x i = result.

                Entrada de muestra

        entrada=2

         */
        System.out.println("ingrese el numero");
        Scanner input= new Scanner(System.in);
        int entero= input.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(entero+"X"+i+"=="+entero*i);
        }
        System.out.println("quedo meloo");
    }
}
