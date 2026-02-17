import java.util.Scanner;

public class scanner_flotante_float {
    public static void main(String[] args){
        // vamos a realizar el repaso con los float
        float flotante_numero=12312f;// siempre tiene que usarse una f al final
        System.out.println("flotante siempre con f,el resultado es:"+ flotante_numero);


        Scanner flotante= new Scanner(System.in);
        System.out.println("ingrese un numero, recuerde que solo es con coma =>,: ");
        float numero_flotantes= flotante.nextFloat();
        System.out.println("resultado es de:"+ numero_flotantes);


    }
}
