import java.util.Scanner;

public class scanner_chart {
    public static void main(String[] args){
        System.out.println("dato de tipo caracter");
        char caracter=65;
        System.out.println("caracter escrito es de:"+ caracter);
        // especificamente para carateres tiene un rango de 0 a 65535
        //cada numero representa un caracter
        //para saber que numero de caracter es se hace lo siguiente

        char caracter1='_';
        int posicion_caracter= (int)caracter1;
        System.out.println("psosicion de caracter es:"+posicion_caracter);
        //ahora se hara con scanner y se identificara que numero tiene el caracter
        Scanner caracter_entrada= new Scanner(System.in);
        System.out.println("escriba solo 1 caracter: ");
        char caracter_seleccionado=caracter_entrada.next().charAt(0);
        int caracter_numero=(int)caracter_seleccionado;
        System.out.println("numero de caracter seleccionado es:"+ caracter_numero);


    }
}
