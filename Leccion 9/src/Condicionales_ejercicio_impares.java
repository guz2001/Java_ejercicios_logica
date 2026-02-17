import java.util.Scanner;

public class Condicionales_ejercicio_impares {
    public static void main(String[] args){
        System.out.println("Ejercicio numeros pares o impares");

        Scanner numer1= new Scanner(System.in);

        double numerPrimero,numeroSegundo;
        System.out.println("ingrese un numero rey: ");
        numerPrimero= numer1.nextDouble();
        System.out.println("ingrese un numero 2  rey: ");
        numeroSegundo=numer1.nextDouble();
        if(numerPrimero%2==0 && numeroSegundo%2==0 ){

            System.out.println("los numeros ingresado son pares sius ------------");
        }else if(numerPrimero%2==0 && numeroSegundo%2!=0 ){

            System.out.println("los numeros ingresados "+numerPrimero +" es par  "+ numeroSegundo +" es impar ");
        }else if(numerPrimero%2!=0 && numeroSegundo%2==0 ){

            System.out.println("los numeros ingresados "+numerPrimero +" es impar  "+ numeroSegundo +" es par ");
        }else{
            System.out.println("no son pares rey");
        }



    }
}
