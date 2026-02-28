import java.util.Scanner;

public class ejerciciorepeticion4_array {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("largo de array: ");
        int n=sc.nextInt(),inicioArray=0,finalArray=0;
        int [] array= new int[n];
        for(int i =0; i<n;i++){
            System.out.println("Ingrese numeros para el array, Este es el"+(i+1));
            array [i]=sc.nextInt();
            inicioArray=array[i];
        }
        for(int i= 0; i<n;i++){
            inicioArray=array[i];
            finalArray=array[(n-1)-i];
            System.out.println("primer elemento es:"+inicioArray);
            System.out.println("ultimo elemento es: "+ finalArray);
        }// sencillo paso para organizar arrays del primero al ultimo

    }
}
