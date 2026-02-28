import java.util.Scanner;

public class array_ejercicio9_repeticion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int []array= new int[10];//creamos el array con 10 espacio
        for(int i=0;i<10;i++){// pedimos al usuario 10 datos
            System.out.println("escoja numero");
            array[i]=sc.nextInt();
        }
        int ultimo=array[9];//guardamos el valor del ultimo array
        for(int i=8;i>=0;i--){//vamos disminuyendo
            array[i+1]=array[i];// el array n copia al array n-1 osea array8 =10 toma el valor de array7=9 osea quedaria
            //array8 =9 array 7=9 duplicado hasta el mas bajo
        }
        array[0]=ultimo;//el ultimo arra que queda con valor 1 toma el valor del ultimo que era 10 o el ultimo digitado
        for(Integer lista: array){//hacemos un for each para imprimir los valores de cada uno evidenciando que se logro el objetivo
            System.out.println("valor array es: "+ lista);
        }
//finalizacion del ejercicio estaba breve
        //mas commits jejej
//superemos el reto de 15 commits
    }
}
