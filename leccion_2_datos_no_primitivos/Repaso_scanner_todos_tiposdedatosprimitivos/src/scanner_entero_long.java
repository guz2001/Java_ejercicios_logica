import java.util.*;
public class scanner_entero_long {
    public static void main(String[] args){
        //repaso de numeros long con scanner y limite de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.
        long numero_entero_long_minimo=Long.MIN_VALUE;
        long numero_long_maximo=Long.MAX_VALUE;
        long numero_leer=String.valueOf(numero_long_maximo).length();
        System.out.println( "numero minimo long"+numero_entero_long_minimo+" "+"maximo long es:"+numero_long_maximo);
        System.out.println("cantidad de numeros leidos es de:"+ numero_leer);


        Scanner scanner_long= new Scanner(System.in);
        System.out.println("scanner usabilidad aca:");
        long scanner_input=scanner_long.nextLong();
        System.out.println("numero ingresado es de :"+scanner_input);
        long leer_numero_input_long= String.valueOf(scanner_input).length();
        System.out.println("cantidad de numeros digitados es de: "+ leer_numero_input_long);

    }
}
