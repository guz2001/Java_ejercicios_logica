import java.util.Scanner;

public class bucleFor_ejercicios {
    public static void main(String[] args){
        //bucle for i= valor inicia; i condicion; i que se hace con ese valor
        for(int i=1; i<=10; i++)
            System.out.println("iteracion:  "+ i);
        // serie fibonacci
        System.out.println("limite de serie n:");
        Scanner fibo= new Scanner(System.in);
        int serieF=fibo.nextInt();
        int a=1;
        int b=0;
        for(int i=1;i<=serieF;i++){

            int serieSum= a+b;
            a=b;
            b=serieSum;
            System.out.println(serieSum);
            fibo.close();

        }


    }



}
