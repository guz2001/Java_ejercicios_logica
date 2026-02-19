import java.util.Scanner;

public class array_ejercicio2_repaso {
    public static void main(String[] args){
        //primero la entrada de datos
        Scanner es= new Scanner(System.in);
        float[] arrays= new float[5];
        for(int i=0;i<arrays.length;i++){
            System.out.println("entre 5 numeros");
            arrays[i]=es.nextInt();
        }
        for(int i=arrays.length;i>0;i--){// esta hace que haga los ciclos
            System.out.println("ordenamos: "+arrays[i-1]);// esta mierda disminuye el valor la asignacion del array i-1
            /*
            En esta gran puta mierda, pasa que cuando ponemos dentro del array la iteracion menos 1, imprime el valor
            que hay dentro de cada espacio del array ejemplo
            si el array es de 10 elementos hara lo siguiente:
            array[9-1]-> esta mierda es igual a array[8]-> y el espacio del 9 puede ser un numero que asignamos arriba
            y sigue, IMPORTANTE NO ES DESDE 10 por que el 0 es un espacio
            array[9-1]-> es igual a array[8]-> y se imprime la mierda de valor que halla en 8 gg naiz
             */
        }

    }
}

