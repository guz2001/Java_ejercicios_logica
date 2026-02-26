package ClasesYObjetos;

import java.util.Scanner;

public class Operacion {
    Scanner sc = new Scanner(System.in);
    int num1 ,num2,suma,resta,multi,divi;

    public void leerNumeros(){
        System.out.println("ingrese un numero1: ");
        num1=sc.nextInt();
        System.out.println("ingrese numero2: ");
        num2=sc.nextInt();
    }
    public void sumar(){
        suma=num1+num2;
    }
    public void restar(){
        resta=num1-num2;
    }
    public void multiplicar(){
        multi=num1*num2;
    }
    public void dividir(){
        divi=num1/num2;
    }
    public void mostrarResultador(){
        System.out.println("resultado suma es: "+suma);
        System.out.println("resultado resta es: "+resta);
        System.out.println("resultado multiplicacion es: "+multi);
        System.out.println("resultado division es: "+divi);

    }
}
