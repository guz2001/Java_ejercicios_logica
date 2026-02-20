import java.util.Arrays;
import java.util.Scanner;

public class array_ejercicio5_ab {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int [] A= new int[10];
        int [] B= new int[10];

        //String D= Arrays.toString(B);
        Integer [] ul= new Integer[20];

        int arrayA=0,arrayB=0;
        for(int i=0;i<10;i++){
            System.out.print("INGRESE EL de A:-> "+ (i+1)+" ");
            arrayA=A[i]=in.nextInt();
            System.out.print("INGRESE EL de B : ->"+ (i+1)+" ");
            arrayB=B[i]= in.nextInt();


        }
        for (int i=0;i<20;i++){
            String C= Arrays.toString(A)+" "+Arrays.toString(B);
            System.out.println(C);
        }



    }
}
