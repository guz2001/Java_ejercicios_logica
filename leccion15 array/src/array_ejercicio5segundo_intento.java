import java.util.Scanner;

public class array_ejercicio5segundo_intento {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int [] arrayA=new int[10];
        int [] arrayB=new int[10];
        int [] arraC= new int[20];

        for(int i=0;i<10;i++){
            System.out.println("numero A:");
            arrayA[i]=sc.nextInt();
            System.out.println("numero B: ");
            arrayB[i]=sc.nextInt();


        }
        int iter=0;
        for(int i=0;i<10;i++){
            arraC[iter]=arrayA[i];
            iter++;
            arraC[iter]=arrayB[i];
            iter++;
        }

        for (int i=0; i<20;i++){
            System.out.println("valor a y b array es: "+ arraC[i] );
        }
    }
}
