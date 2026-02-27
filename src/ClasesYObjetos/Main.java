package ClasesYObjetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        Operacion operar= new Operacion();
        operar.leerNumeros();
        operar.multiplicar();
        operar.dividir();
        operar.restar();
        operar.sumar();
        operar.mostrarResultador();
         */
        //enviar valores al metodo
        Scanner escan=new Scanner(System.in);
        int numero1,numero2;
        numero1=escan.nextInt();
        numero2=escan.nextInt();
        Operaciones_declaradas_parametros oper= new Operaciones_declaradas_parametros();
        oper.sumarEs(numero1,numero2);
        oper.dividirEs(numero1,numero2);
        oper.restarEs(numero1,numero2);
        oper.multiplicarEs(numero1,numero2);
        oper.resultadosMostrar();

        //creamos objeto de la clase Suma
        Scanner sc= new Scanner(System.in);
        int numer1=sc.nextInt();
        int numer2=sc.nextInt();
        Suma sumar= new Suma();
        System.out.println("ingrese numeros1: ");
        sumar.Sumar(numer1,numer2);

        sumar.mostrarResultados();

    }
}
