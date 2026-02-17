import java.util.Scanner;

public class scanner_entero_int {
    public static void main(String[] args){
        System.out.println("Repaso de int con metodó de scanner");
        //tiene un maximo de 32 bites rango de -2,147,483,648 a 2,147,483,647
        System.out.println("minimo numero  negativo en int");
        int numero_minimo= -2147483648;
        System.out.println("numero minimo es de :"+ numero_minimo);

        int numero_maximo= 2147483647;
        System.out.println("numero maximo en int es de:"+ numero_maximo);
        Scanner int_numero= new Scanner(System.in);
        int numero_int=int_numero.nextInt();
        System.out.println("numero esocgido entero int es de:"+ numero_int);






    }
}
