import java.util.Scanner;

public class array_repaso_ejercicio8 {
    public static void main(String[] args){
        Scanner es= new Scanner(System.in);
        int [] tenArray= new int[10];
        int j=0,addNumber,position;
        for(int i=0; i<8;i++){
            System.out.println("ingrese un numero");
            tenArray[i]= es.nextInt();
            j++;

        }
        System.out.println("es j"+j);
        for(int i=j;i<10;i++){
            System.out.println("ingrese un numero para agregar:");
            tenArray[i]= es.nextInt();
            addNumber=tenArray[i];
        }
        for(Integer arrayResultado: tenArray){
            System.out.println("resultado del array es: "+arrayResultado);
        }// imprimir mas simplificado

    }
}
