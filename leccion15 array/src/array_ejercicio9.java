import java.util.Scanner;

public class array_ejercicio9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] tablaDiez= new int[10];
        int inverso=0,a,b;
        for(int i=0;i<10;i++){
            System.out.printf("ingrese numero para espacio %d\n",i);
            tablaDiez[i]=sc.nextInt();

        }
        inverso=tablaDiez[9];
        for(int i=8;i>=0;i--){

            tablaDiez[i+1]=tablaDiez[i];//  el de la posicion 1 sera igual al de la posicion
            System.out.println("arreglo "+tablaDiez[i]+"posicion es: "+i);
        }
        tablaDiez[0]=inverso;
        for(int i=0; i<10;i++){
            System.out.println("es "+ tablaDiez[i]);
        }

    }
}
