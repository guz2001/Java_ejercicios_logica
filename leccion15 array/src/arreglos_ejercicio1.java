import java.util.Scanner;

public class arreglos_ejercicio1 {
    public static void main(String[] args){
        Scanner ar= new Scanner(System.in);
        float  entrada[]=  new float[5];
        for (int i=0;i<entrada.length;i++){
            System.out.println("ingrese los datos:");
            entrada[i]=ar.nextInt();


        }

        for(Float i:entrada){
            System.out.println(i);
        }
        for(Float i: entrada){
            i--;
            System.out.println("inversa "+(i));
        }


    }
}

