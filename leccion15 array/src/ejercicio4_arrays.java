import java.util.Scanner;

public class ejercicio4_arrays {
    public static void main(String[] args){
        Scanner es= new Scanner(System.in);
        int [] lista10= new int[10];
        int primerElemnto=lista10[0],ultimoElemento=0,longList=lista10.length;

        for(int i=0;i<lista10.length;i++){
            System.out.println("10 numeros este es el :"+(i+1));
            lista10[i]=es.nextInt();
            primerElemnto=lista10[i];



        }
        for(int i=0;i<lista10.length;i++){
            primerElemnto=lista10[i];
            ultimoElemento=lista10[9-i];
            System.out.println("primer elemento es "+ primerElemnto + "ultimo es"+ ultimoElemento);
        }


        /*System.out.println("primer numero "+lista10[0]+" Ultimo es: "+lista10[10-1]);
        System.out.println("primer numero "+lista10[1]+" Ultimo es: "+lista10[10-2]);
        System.out.println("primer numero "+lista10[2]+" Ultimo es: "+lista10[10-3]);
        System.out.println("primer numero "+lista10[3]+" Ultimo es: "+lista10[10-4]);
        System.out.println("primer numero "+lista10[4]+" Ultimo es: "+lista10[10-5]);
        System.out.println("primer numero "+lista10[5]+" Ultimo es: "+lista10[10-6]);
        System.out.println("primer numero "+lista10[6]+" Ultimo es: "+lista10[10-7]);
        System.out.println("primer numero "+lista10[7]+" Ultimo es: "+lista10[10-8]);
        System.out.println("primer numero "+lista10[8]+" Ultimo es: "+lista10[10-9]);
        System.out.println("primer numero "+lista10[9]+" Ultimo es: "+lista10[10-10]);

         */




    }
}
