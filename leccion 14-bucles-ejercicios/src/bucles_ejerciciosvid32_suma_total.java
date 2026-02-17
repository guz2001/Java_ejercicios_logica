import java.util.Scanner;

public class bucles_ejerciciosvid32_suma_total {
    public static void main(String[] args){
        /*
        Pedir numeros  hasta que  teclee un 0, mostrar la  suma de  todos los numeros introducidos
         */
        Scanner numAzar= new Scanner(System.in);
        int numeroIngresado;
        int intentos=0;
        int sumaTotal=0;
        do {

            System.out.println("INGRESE UN NUMERO ");
            numeroIngresado= numAzar.nextInt();
            sumaTotal+=numeroIngresado;

            intentos++;

        }while (numeroIngresado!=0);
        System.out.println("suma total es: "+ sumaTotal +"\n"+ "numero de intentos: "+ intentos);
    }
}
