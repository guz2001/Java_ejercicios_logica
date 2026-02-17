import java.util.Scanner;

public class Ejercicio4_video15 {
    public static void main(String[] args){

        /*
            programa que calcula el salario total de un ejemplado que vende carros
            1-salario solo=1000 al mes
            2-bonificacion=150$ por cada venta+ 5% del costo del carro vendido
         */
        double salarioBaseMensual,salarioBonificacionTotal,ventaCarrosMes,costoTotalVentasCarros,total;

        //creamos un scanner por si los salarios iniciales varian
        Scanner salarioContador= new Scanner(System.in);
        System.out.println("ingrese el salario del trabajador inicial: ");
        salarioBaseMensual=salarioContador.nextDouble();
        System.out.println("salario base del trabajador es: "+salarioBaseMensual);
        System.out.println("ingrese el numero de carros vendido al mes: ");
        ventaCarrosMes=(salarioContador.nextDouble())*150;
        System.out.println("ingrese el total de las ventas del los carros del mes: ");
        costoTotalVentasCarros=(salarioContador.nextDouble())* 0.05;
        salarioBonificacionTotal=ventaCarrosMes+costoTotalVentasCarros;
        System.out.println("Total Salario mensual es de:"+(salarioBonificacionTotal+salarioBaseMensual));
        System.out.println("revision"+salarioBaseMensual+" "+salarioBonificacionTotal+" "+ventaCarrosMes+" "+costoTotalVentasCarros);




    }
}
