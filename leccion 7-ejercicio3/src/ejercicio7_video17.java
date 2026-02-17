import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ejercicio7_video17 {
    public static void main(String[] args){
    /*
        convertidor de horas a  semanas dias horas

     */

    // Cremamos el metodo para tomar los datos
        Scanner convertidor= new Scanner(System.in);
        int horasConvertir,dias,semanas,horas;
        System.out.println("horas ingrese: ");
        horasConvertir=convertidor.nextInt();
        System.out.println("aqui horas vale:"+horasConvertir);
        semanas=horasConvertir/168;
        System.out.println("aqui horas vale:"+horasConvertir);
        dias= (horasConvertir%168)/24;// se utiliza el modulo para tomar lo que sobro de la division, eso se divide en los dias
        System.out.println("aqui horas vale:"+horasConvertir);
        horas=horasConvertir%24;// utilizamdos modulo para que lo que sobre en horasConcertir divido 24 horas quede en horas
        System.out.println("aqui horas vale:"+horasConvertir);
        System.out.println(" semas=> "+semanas+" dias=> "+ dias +" horas=>" + horas);
    }
}
