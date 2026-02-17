import java.util.Scanner;

public class math_raiz_cuadrada {
    public static void main(String[] args){
        // sacar raiza cuadrada de cualquier numero
        double raizCuadrada=Math.sqrt(60);
        System.out.println("raiz es de : "+raizCuadrada);
        // ahora con scanner

        Scanner raiz= new Scanner(System.in);
        System.out.println("ingrese una raiz: ");
        double raizInput=raiz.nextDouble();
        double result=Math.sqrt(raizInput);
        System.out.println("su raiz es: "+result);
    }
}
