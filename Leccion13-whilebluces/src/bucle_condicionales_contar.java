import java.util.Scanner;

public class bucle_condicionales_contar {
    public static void main(String[] args){
        /*
        pedir numeros hasta que sean negativo
        2-indicar cuantos numeros hemos ingresado
         */
        Scanner numero= new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numeroIngresar= numero.nextInt();
        int totalNumero=1;
        while(numeroIngresar>=0){
            System.out.println("ingrese otro numero");
            numeroIngresar= numero.nextInt();
            totalNumero++;



        }
        System.out.println("total numeros contados es: "+totalNumero );
    }
}
