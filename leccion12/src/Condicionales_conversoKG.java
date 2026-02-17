import java.util.Scanner;
import java.util.SortedMap;

public class Condicionales_conversoKG {
    public static void main(String[] args){
        /*
        Conversora de KG a otra unidad de medida:
        1-inicia con kg
        2- crear opcion 1 cambiaremos a g
        3- crear opcion 2 cambiar a lb
        4- opcion 3 cambiar a oz

         */
        double kg,gr,onz,lb;
        System.out.println(" |-------------------------------------------| \n" +
                " |--Conversora de masas escoja 3 opciones :--|\n " +
                "|--1: convertir kg a libras               --| \n "+ "|--2: convertir kg a gramos               --| \n "
                + "|--3: convertir kg a onzas                --|" );
        Scanner conMasa= new Scanner(System.in);
        int opciones= conMasa.nextInt();

        switch (opciones){
            case 1:
                System.out.println("ingrese los kilogramos  que desea convertir a lb");
                kg=conMasa.nextDouble();
                lb=kg*2.2046;
                System.out.println("los kg :" +kg+ " Equivale en libras a  "+ lb);
                break;
            case 2:
                System.out.println("Ingrese los kilogramos que desea convertir a gramos");
                kg=conMasa.nextDouble();
                gr=kg*1000;
                System.out.println("los kg :" +kg+ " Equivale en gramos a  "+ gr);
                break;
            case 3:
                System.out.println("Ingrese los kilogramos que desea convertir a onzas");
                kg=conMasa.nextDouble();
                onz=kg*35.274;
                System.out.println("los kg :" +kg+ " Equivale en onzas a "+ onz);
                break;

            default:
                System.out.println("Error magistral, no ingreso ninguna opción");

        }
    }
}
