import java.util.Scanner;

public class Ejercicios_operadores {
    public static void main(String[] args){
        System.out.println("Ejercicio suma de 3 calificaciones");
        double parcial1,parcial2,parcial3;
        Scanner calificarNotas= new Scanner(System.in);
        System.out.println("ingrese calificaciones: ");
        parcial1=calificarNotas.nextDouble();
        parcial2=calificarNotas.nextDouble();
        parcial3=calificarNotas.nextDouble();
        System.out.println("las notas digitadas fueron: "+ parcial1+ " "+parcial2+" "+parcial3);
        double sumaFinal=parcial1+parcial2+parcial3;
        System.out.println("la suma de ambas fueron: "+ sumaFinal);
        // le agregamos un promedio final
        double proFinal=sumaFinal/3;
        System.out.println("promedio final es de: "+proFinal);
    }
}
