import java.util.Arrays;
import java.util.Scanner;

public class array_ordenamiento {
    public static void main(String [ ]args){
        Scanner sc= new Scanner(System.in);
        int [] arreglo= new int[10];
        boolean ascendente=false, decendiente=false;
        System.out.println("completar arreglo");
        for (int i=0; i<10;i++){
            System.out.println("ingrese numero de arreglo");
            arreglo[i]=sc.nextInt();



        }
        for(int i =0; i<9;i++){
            if(arreglo[i]< arreglo[i+1]){
                //System.out.printf("el numero del arreglo numero  %d es menor al  valor del arreglo" +
                        //"%d que es el %d \n ",i,arreglo[i],i);
                ascendente=true;

            } else if (arreglo[i] > arreglo[i+1]){
                //System.out.printf("el numero del arreglo numero  %d es mayor al valor del arreglo" +
                       // " %d que es el %d \n ",i,arreglo[i],i);
                decendiente=true;


            }

        }
        if (ascendente==true && decendiente==true) {
            System.out.println("los numeros estane en desorden");

        }else if (ascendente==true && decendiente==false){
            System.out.println("son ascendentes");

        }else if(decendiente==true && ascendente==false){
            System.out.println("son todos decendientes");
        } else if (decendiente == false && ascendente == false) {
            System.out.println("todos los numeros son iguales");
        }
    }
}
