import java.util.Scanner;

public class operadores_repaso2_scanner {
    public static void main(String[] args){
        float numero1,numero2,division,multipliacion,resta,suma;
        Scanner numeros= new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        numero1= numeros.nextFloat();
        numero2= numeros.nextFloat();
        division=numero1/numero2;
        multipliacion=numero1*numero2;
        resta= numero1-numero2;
        suma= numero1+numero2;

        System.out.println("total de la division: "+division+" \n total multipliacion: "+multipliacion);


    }
}
