import java.util.Scanner;

public class bucle_while_numeros_media {
    public static void main(String[] args){
        //con while
        Scanner mediaW= new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        double dato=mediaW.nextDouble();
        double intentos=0,sumaPromedio=0;
        while(dato>=0){
            sumaPromedio+=dato;
            intentos++;
            System.out.println("Ingrese un numero: ");
            dato=mediaW.nextDouble();
        }
        if (sumaPromedio==0){
            System.out.println("error no se puede cero a la primera: ");
        }else{
            System.out.println("suma total es de: "+ sumaPromedio
            +"\n Numero intentos: "+ intentos+" \n Promedio total es :"+(sumaPromedio/intentos));
        }
    }
}
