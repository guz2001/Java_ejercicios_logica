import java.util.Scanner;

public class bucles_empresa_part2_ejercicio18 {
    public static void main(String[] args){
        /*
        empresa ejercicio anterior per con 3 opciones:
        1-0,6$/llitro
        2-3$/litro
        3-1,25Euro/litro
         */
        double litros=0,precio=0,totalVenta=0,ventaFinal1=0,ventaFinal2=0,ventaFinal3=0,facturaTotal=0,litrosTotal=0,
                litros1=0,litros2=0,litros3=0,conteoFacturas1=0,conteoFacturas2=0,conteoFacturas3=0;
        int cant1=0,cant2=0,cant3=0;
        Scanner em= new Scanner(System.in);

        int opcion;
        for(int i=1;i<=5;i++) {


            do {
                System.out.println("escoja una opcion de 3:"+"\n 1-0,6$/litro \n 2-3$/litro \n 3-1,25$/litro ");
                opcion= em.nextInt();
                if(opcion<=0 || opcion>3){
                    System.out.println("error en el sistema digite de nuevo");
                }
            }while (opcion<0 || opcion>3);
            System.out.println("ingrese los litros que desea");
            litros= em.nextDouble();






            switch (opcion) {
                case 1:
                    totalVenta=litros*0.6;
                    ventaFinal1+=totalVenta;
                    litros1+=litros;
                    cant1++;
                    System.out.println("total costo art 1: =>"+ totalVenta+" cantidad "+cant1);
                    if(ventaFinal1>600){
                        conteoFacturas1++;

                    }
                    break;
                case 2:
                    totalVenta=litros*3;
                    ventaFinal2+=totalVenta;
                    litros2+=litros;
                    cant2++;
                    System.out.println("total costo art 2 :=>>"+ totalVenta+" cantidad "+cant2);
                    if(ventaFinal2>600){
                        conteoFacturas2++;

                    }
                    break;

                case 3:
                    totalVenta=litros*1.25;
                    ventaFinal3+=totalVenta;
                    litros3+=litros;
                    cant3++;
                    System.out.println("total costo art 3 :=>>>"+ totalVenta+" cantidad "+cant3);
                    if(ventaFinal2>600){
                        conteoFacturas3++;

                    }
                    break;

                default:
                    System.out.println("error no digito una opcion validad en el rango :");

                    break;
            }


        }




        facturaTotal=+ventaFinal1+ventaFinal2+ventaFinal3;
        litrosTotal=litros1+litros2+litros3;
        System.out.println("cantidad articulos 1 vendidos es de: "+cant1);
        System.out.println("cantidad articulos 2 vendidos es de: "+ cant2);
        System.out.println("cantidad articulos 3 vendidos es de: "+cant3);
        System.out.println("facturacion total es de : "+facturaTotal);
        System.out.println("litros totales es de: "+litrosTotal );
        System.out.println("cantidad facturas mas de 600 es de "+(conteoFacturas1+conteoFacturas2+conteoFacturas3));


    }
}
