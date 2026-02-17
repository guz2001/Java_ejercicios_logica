import java.util.Scanner;

public class bucles_ejercicio16_video37 {
    public static void main(String[] args){
        /* Pide un numero (entre 0 y 10) y mostrar la tabla de multiplicar de dicho numero
         */
        //1-crear la entrada de datos
        Scanner m=new Scanner(System.in);
        System.out.println("Ingrese un numero del 0 a 10");
        int numMul=m.nextInt();;
        int   datoMul=0;

        if(numMul>=0 && numMul<11){
            for(int i=1;i<=10;i++){
                datoMul+=numMul;
                System.out.println(numMul + " x " + i + " = " + datoMul);

            }
        }

        /* Pide un numero (entre 0 y 10) y mostrar la tabla de multiplicar de dicho numero
         */
        //1-crear la entrada de datos

        System.out.println("Ingrese un numero del 0 a 10");
        int numMulti=m.nextInt();;


        if(numMul>=0 && numMul<11){
            for(int i=1;i<=10;i++){
                int resultado=numMulti*i;
                System.out.println("iterar "+ i);
                System.out.println(numMul + " x " + i + " = "+resultado);

            }
        }
        m.close();

    }
}
