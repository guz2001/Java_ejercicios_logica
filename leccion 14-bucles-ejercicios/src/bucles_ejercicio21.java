import java.util.Scanner;

public class bucles_ejercicio21 {
    public static void main(String[] args){
    /*pediar 10 numeros
    mostrar si se metio algun negativo al final
     */
        Scanner ne= new Scanner(System.in);
        int numeros,conteoNumerosPos=0,conteoNumerosNeg=0;
        boolean siNegativos=false;
        for (int i=1;i<=10;i++){
            System.out.println("ingrese 10  numeros: ");
            numeros=ne.nextInt();

            if (numeros>0){
                conteoNumerosPos++;
                siNegativos=false;
            }else if(numeros<0) {
                conteoNumerosNeg++;
                siNegativos=true;

            }else{
                System.out.println("Numero erroneo ");
            }

        }
        System.out.println("si hay negativos es igual a "+ siNegativos);
        System.out.println("cantidad numeros negativos: "+conteoNumerosNeg );
        System.out.println("numeros negtativos fueron de  " + conteoNumerosPos );

    }
}
