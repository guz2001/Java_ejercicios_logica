import java.util.Scanner;

public class scanner_flotante_double {
    public static void main(String[] args){
        // repaso de ejercicio scanner con double
        double minimo_double=Double.MIN_VALUE;
        System.out.println("valor double minimo"+minimo_double);
        double maximo_double= Double.MAX_VALUE;
        System.out.println("valor double maximo"+maximo_double);

        Scanner double_scanner= new Scanner(System.in);
        System.out.println("ingrese un valor para double:");
        double valor_double= double_scanner.nextDouble();
        System.out.println("valor ingresado es de double: "+ valor_double);
    }
}
