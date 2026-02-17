import java.util.Scanner;

public class condicional_caracter {
    /*
    Programa que lee un caracter y determina si es mayuscula o minuscula
     */
    public static void  main(String[] args){
        System.out.println("Ingrese un caracter ");
        Scanner caracterG= new Scanner(System.in);
        char caracterEntrada= caracterG.next().charAt(0);// se almacena el primer carcater y se determina que solo el primer caracter se tomara
        char caracterTipoMay= Character.toUpperCase(caracterEntrada);//aca se ve si la letra es de tipo mayuscula
        char caracterTipoMin= Character.toLowerCase(caracterEntrada);
        if(caracterTipoMay==caracterEntrada){
            System.out.println("es mayuscula la palabra"+ caracterEntrada);
        }else if(caracterTipoMin==caracterEntrada){
            System.out.println("es minuscula "+ caracterTipoMin);
        }
    }
}
