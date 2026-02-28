import java.util.Arrays;
import java.util.Scanner;

public class array_ejercicio5_ab {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int  A [],B [], C[];


        A= new int[10];
        B= new int[10];
        C= new int[20];


        //String D= Arrays.toString(B);


        int arrayA=0,arrayB=0;
        for(int i=0;i<10;i++){
            System.out.print("INGRESE EL de A: "+ (i+1)+" ");
            A[i]=in.nextInt();
            System.out.print("INGRESE EL de B "+ (i+1)+" ");
            B[i]= in.nextInt();
        }
        int j=0;
        for(int i=0;i<10;i++){
            C[j]=A[i];
            j++;
            C[j]=B[i];
            j++;

        }
        for(int i = 0; i<20;i++){
            System.out.print    (C[i]+"---");

        }
        // ejercicio finalizado con logica pura mia


    }
}
