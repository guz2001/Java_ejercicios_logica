import java.util.Scanner;

public class bucles_Productos_10_numeros_impares {
    /*
    Diseñar  un programa  que muestre  el  producto (Multiplicacion) de los 10
    primeros  numeros impares

     */

    public static void main(String[] args){
        //Scanner d= new Scanner(System.in);
        //int num= d.nextInt();
        int numero=1,producto = 1;
        for(int contar=1; contar<=20; contar+=2){
            System.out.println("conteo es: "+ contar);
            producto*=contar;
            System.out.println("multiplicacion  de todos los numerso es: "+producto);

        }

    }
}
