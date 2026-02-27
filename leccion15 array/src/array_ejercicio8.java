import java.util.Scanner;

public class array_ejercicio8 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] tabla= new int[10];
        int posicion,nuevoNumero=0,punto=0,valorFinal=0,iteracion=0;

        for(int i=0; i<8;i++){
            System.out.printf("Ingrese el numero para el espacio = %d es = ",i);
            tabla[i]= sc.nextInt();
            iteracion++;

        }



        System.out.println("valor largo de tabla es"+ punto);
        for(int i=iteracion;i<10;i++){
                System.out.println("nuevo numero :");
                nuevoNumero= sc.nextInt();
                //System.out.println("posicion 9: ");
                //posicion= sc.nextInt();
                tabla[i]=nuevoNumero;


        }

        for(Integer total :tabla){
            System.out.println(total);
        }
        System.out.printf("valor final es %d  \n",valorFinal);



    }
}
