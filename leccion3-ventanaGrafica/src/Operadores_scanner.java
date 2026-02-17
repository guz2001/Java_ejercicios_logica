import javax.swing.*;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Operadores_scanner {
    public static void main(String[] args){
        Scanner input_datos= new Scanner(System.in);
        // vamos hacer con double primero para la suma pero csin interfaz grafica

        System.out.println("Ingrese un numero con decimales:");
        double suma1=input_datos.nextDouble();
        System.out.println("Ingrese otro numero con decimales:");
        double suma2=input_datos.nextDouble();
        double total_suma_double=suma1+suma2;
        System.out.println("total suma decimales es de:"+total_suma_double);
        /*
            Flotante float operaciones matematicas
         */
        float exponente1,exponente2,total_exp;// declaramos las varibales
        //creamos el scanner para float

        Scanner exponente= new Scanner(System.in);
        System.out.println("ingrese un numero float: ");
        exponente1=exponente.nextFloat();
        System.out.println("ingrese un numero float: ");

        exponente2=exponente.nextFloat();
        //sumaremos primero
        System.out.println("suma total sin creear variable total es de: "+ (exponente1+exponente2));
        total_exp= exponente1*exponente2;
        System.out.println("multiplicacion es de:"+ total_exp);



        //creamos un scanner exclusivo para enteros
        Scanner enteros= new Scanner(System.in);
        // sumas con enteros
        int entero1,entero2,sumaTotal;//asignamos el tipo de dato
        System.out.println("ingrese un numero entero: ");
        entero1= enteros.nextInt();
        System.out.println("ingrese otro numero entero: ");
        entero2= enteros.nextInt();

        sumaTotal= entero1+entero2;
        System.out.println("suma total enteros es de:"+ sumaTotal);

        //ahora haremos uno con booleanos

        Scanner opcion= new Scanner(System.in);
        System.out.println("ingrese un estado: ");
        // nombramos la varibale
        boolean valorBooleano;
        valorBooleano= opcion.nextBoolean();
        System.out.println("el valor es: "+valorBooleano);
        /*
            Strings usando scanner y haciendo algo con eso
         */
        //creamos el scanner para string
        Scanner string_entrada=new Scanner(System.in);
        String cadena1,cadena2;
        //primer string que finaliza hasta el primer espacio
        System.out.println("ingrese una palabra sin espacios: ");
        cadena1=string_entrada.next();
        string_entrada.nextLine();// ponemos este por si el caracter tiene espacios
        System.out.println("ingrese una palabra larga con espacios: ");
        cadena2=string_entrada.nextLine();// se pone nextLine para toma todos los datos
        System.out.println("Juntas las palabras forman: "+cadena1+" "+cadena2);


    }
}
