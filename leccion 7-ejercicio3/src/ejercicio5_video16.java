import java.util.Scanner;

public class ejercicio5_video16 {
    public static void main(String[] args){
        /*
            Ejercicio que da el resultado final de la sumatoria de 4 notas
            1- nota de participacion 10%
            2-nota primer parcial 25%
            3-nota tercer parcial 25%
            4- nota cuarto parcial 40%

         */
        float notaParticipacion,notaPrimerParcial,notaSegundoParcial,notaParcialFinal;// declaramos las variables
        Scanner ingresarNota= new Scanner(System.in);//creamos el que recibelos datos del usuario
        System.out.println("ingrese la nota  de participacion : ");
        notaParticipacion= ingresarNota.nextFloat();
        System.out.println("ingrese la nota de su primer parcial : ");
        notaPrimerParcial=ingresarNota.nextFloat();
        System.out.println("ingrese la nota de su segundo parcial :");
        notaSegundoParcial= ingresarNota.nextFloat();
        System.out.println("ingrese la nota de su parcial final: ");
        notaParcialFinal= ingresarNota.nextFloat();
        System.out.println("total nota final es de: "+ "\n"+
                ((notaParticipacion*0.10)+(notaPrimerParcial*0.25)+(notaSegundoParcial*0.25)+(notaParcialFinal*0.40)));


    }
}
