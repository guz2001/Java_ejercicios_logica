import java.util.Scanner;

public class ejercicio8_video17_formulaCuadratica {
    public static void main(String[] args){
        // formula cuadratica aplicada
        Scanner mateCuadrado= new Scanner(System.in);
        double a,b,c,x1,x2,raiz1,bac;
        System.out.println("ingrese valores: a");
        a=mateCuadrado.nextDouble();
        System.out.println("ingrese valores: b");
        b=mateCuadrado.nextDouble();
        System.out.println("ingrese valores: c");
        c=mateCuadrado.nextDouble();
        bac=(Math.pow(b,2))-(4*(a*c));
        raiz1 = (Math.sqrt(Math.abs(bac)));

        x1=(-b+raiz1)/(2*a);
        x2=(-b-raiz1)/(2*a);
        System.out.println("total numeros x1= "+ x1+"\n total x2: "+x2);
    }
}
