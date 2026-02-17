import java.util.Scanner;

public class ciclos_while_video_30 {
    public static void main(String[] args){
        /*
        ejercicio leer un numero e indicar si  es positivo o negativo  el proceso se repetira  hasta que
        se introduzca el 0
         */
        Scanner num= new Scanner(System.in);
        System.out.println("numero ingresado nuevo ");
        int numero= num.nextInt();

        do {

            System.out.println("numero actual es "+ numero);
            System.out.println("ingrese un nuevo numero");
            numero= num.nextInt();

        }while(numero!=0);
    }
}
