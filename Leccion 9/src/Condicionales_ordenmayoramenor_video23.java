import java.sql.SQLOutput;
import java.util.Scanner;

public class Condicionales_ordenmayoramenor_video23 {
    public static void main(String[] args){
        /*
        Programa que al ingresar 3 numero los ordena
         */
        Scanner ordeNar= new Scanner(System.in);
        int numerCompara1,numerCompara2,numerCompara3;
        System.out.println("ingresar numero 1");
        numerCompara1=ordeNar.nextInt();
        System.out.println("Ingresar numero 2");
        numerCompara2=ordeNar.nextInt();
        System.out.println("Ingresar numero 3");
        numerCompara3=ordeNar.nextInt();
        if(numerCompara1<numerCompara2 && numerCompara2<numerCompara3 ){
            System.out.println("esta ordenado los numero por defecto "+ numerCompara1 + numerCompara2 + numerCompara3);
        } else if (numerCompara1>numerCompara2 && numerCompara2>numerCompara3 ) {
            System.out.println("ordenamos "+ numerCompara3+ numerCompara2 + numerCompara1);


        } else if (numerCompara1>numerCompara3 && numerCompara2>numerCompara1) {
            System.out.println("orden es == "+ numerCompara3+ numerCompara1+ numerCompara2);


        } else if (numerCompara2<numerCompara3 && numerCompara2<numerCompara1 ) {
            System.out.println("orden es "+ numerCompara2+ numerCompara1+ numerCompara3);

        }else if (numerCompara2>numerCompara3 && numerCompara1<numerCompara3 ) {
            System.out.println("orden es "+ numerCompara1+ numerCompara3+ numerCompara2);

        }


    }
}
