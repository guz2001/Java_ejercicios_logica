import java.util.Scanner;

public class ejercicio6_video16 {
    public static void main(String[] args){
    /*
        Ejercicio para sacar el cuadrado de una suma
        formula= (a+2)**2=a**2+2ab+b**2

     */
        System.out.println("PROGRAMA PARA CALCULAR LA SUMA DEL CUADRADO DE DOS NUMEROS");
        Scanner cuadradosIngresar=new Scanner(System.in);//creamos el receptor de datos
        double a,b,totalCuadrado;
        System.out.println("ingrese numero a: ");
        a=cuadradosIngresar.nextDouble();
        System.out.println("ingrese numero b: ");
        b=cuadradosIngresar.nextDouble();
        double cuadradoA=Math.pow(a,2);
        double cuadradoB=Math.pow(b,2);
        totalCuadrado=cuadradoA+(2*(a*b))+cuadradoB;
        System.out.println("total suma de cuadrados es: "+totalCuadrado);
        System.out.println("total 2 veces el primero x segundo: "+(2*(a*b)));
        System.out.println("valor a:"+a);
        System.out.println("valor b: "+ b);
        System.out.println("valor cuadrado a: "+cuadradoA);
        System.out.println("valor cuadrado b: "+cuadradoB);

    }
}
