import java.sql.SQLOutput;
import java.util.Scanner;

public class bucles_concodicionales {
    public static void main(String[] args){
        /*
        Leer numeros hasta  que sea 0
        2- para cada uno  indicar si es par o impar

         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num= scanner.nextInt();

        while (num!=0) {


            if (num % 2 == 0) {
                System.out.println("el numero ingresado es par");
                System.out.println("ingrese otro numero ");
                num = scanner.nextInt();
            } else {
                System.out.println("el numero ingresado es impar");
                System.out.println("ingrese otro numero ");
                num = scanner.nextInt();
            }
        }
    }
}
