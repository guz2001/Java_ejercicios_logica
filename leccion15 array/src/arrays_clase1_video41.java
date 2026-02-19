import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrays_clase1_video41 {
    public static void main(String[] args) {
        //se puede definir uno por uno asi
        int[] edad = new int[5];
        edad[0] = 1;
        edad[1] = 3;
        edad[2] = 5;
        edad[3] = 6;
        edad[4] = 7;
        System.out.println(edad[0]);
        // o todos asi

        for (int i = 0; i < edad.length; i++) {//evitar poner igual a la longitud del array por que da error
            System.out.println("iteraciones" + edad[i]);
        }


        String[] letras = new String[7];
        for (int i = 0; i < letras.length; i++) {
            System.out.println("valor nuevo es" + (letras[i] = "juandavid" + i));


        }

        Scanner cr = new Scanner(System.in);
        System.out.println("ingrese numero n para caracteres");
        int nchar = cr.nextInt();
        char[] caracter = new char[nchar];
        System.out.println("elementos del arreglo");
        for (int i = 0; i < nchar; i++) {

            System.out.println((i + 1) + " caracter digite caracteres: ");
            caracter[i] = cr.next().charAt(0);



        }
        for (int i = 0; i < nchar; i++){
            System.out.print(  caracter[i]+" ");
        }

    }
}
