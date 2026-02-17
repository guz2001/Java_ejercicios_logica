import java.util.Scanner;

public class bucles_ejercicio17_empresa {
    public static void main(String[] args){
    /*empresa vendedora de desinfectantes

     */
        double codigoArticulo,litrosVendidos=0,ventaLitros=0,totalPrecioLitro=0,precioLitro=0,facturaTotal=0,cantidadLitrosVendidos=0,facturasExcedentes=0;
        double  facturaTotal2=0;
        double art1=0,art2=0;
        double totalPrecioLitro2=0;
        Scanner sc= new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.println("factura numero : "+ i);
            System.out.println("Codigo articulo: ");
            codigoArticulo= sc.nextDouble();;
            System.out.println("cantidad vendida por litro");
            litrosVendidos= sc.nextDouble();
            System.out.println("precio por litro: ");
            precioLitro=sc.nextDouble();
            totalPrecioLitro=precioLitro*litrosVendidos;
            System.out.println("factura "+ i+ " venta total es de: "+totalPrecioLitro);
            facturaTotal+=totalPrecioLitro++;


            if(codigoArticulo==1) {
                art1 += litrosVendidos;
            }else {
                art2+=litrosVendidos;
            }
            if(totalPrecioLitro>600){
                facturasExcedentes++;

            }


        }

        System.out.println("facturacion total todos codigos: "+ facturaTotal);
        System.out.println("Cantidad de litros vendidos es de: "+ (art1+art2));
        System.out.println("Cantidad litros vendidos articulo 1: "+ art1);
        System.out.println("Cantidad Facturas emitidas de mas de 600 $ "+ facturasExcedentes);

        ;


    }
}
