import java.util.Scanner;

public class ejercicio7repeticion_video17 {
    //Programa para identificar exactamente las horas en dias semanas horas restantes
    public static void main(String[] args){
        int horas,dias,semanas,horasEntrada,meses;
        System.out.println("Primero ingresar las horas: ");
        Scanner horasIngresadas= new Scanner(System.in);
        horasEntrada=horasIngresadas.nextInt();

        horas=(horasEntrada%24);//dividimos las horasingresadas entre 24 y lo que sobre son las horas restantes
        dias=(horasEntrada%168)/24;// dividimos las horas ingresadas entre 168 hora que es 1 semana y se divide \n
        //todo eso en 24h para tener exactamente los dias restante despues de sacar la semanas exactas
        semanas=horasEntrada/168;// 168 es una semana solo se divide las horas entre 168 h y listo
        // agregamos meses
        meses=(horasEntrada/168)/4;
        System.out.println("conversion es de: \n"+" semanas "+semanas+" \n dias  "+dias+" \n horas "+horas+"\n meses "+meses);



    }
}
