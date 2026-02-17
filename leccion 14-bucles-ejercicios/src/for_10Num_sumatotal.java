import javax.crypto.spec.PSource;
import java.util.Scanner;

public class for_10Num_sumatotal {
    public static void main(String[] args){
        /*
        Pedir 10 numeros y escribir la suma total
         */
        Scanner p= new Scanner(System.in);

        double sumTotal=0;
        for(int i=1;i<=10;i++){
            System.out.println("Ingrese otro numero: ");
            double num10= p.nextInt();
            sumTotal+=num10;
            System.out.println("----suma progresiva numero : "+i +" Es: --- "+ sumTotal);
        }
        p.close();// cerramos el scanner
        System.out.println("----Suma final es de : "+ sumTotal);
       /* while (limite<=10){

            System.out.println("Otro numero: ");
            sumTotal= p.nextInt();
            sumaFinal+=sumTotal;
            limite++;

        }
        System.out.println("suma total es "+ sumaFinal);


        */
    }

}
