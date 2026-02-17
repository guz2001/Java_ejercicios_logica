import java.util.Scanner;

public class Condicionales_switch_banco3opciones {
    public static void main(String[] args) {

        /*
        Programa banco con 3 opciones:
        1-agregar dinero
        2-retirar dinero
        3-salir
         */
        double  dineroIngresar, retirarDinero,saldoTotal;
        final double saldoInicial=1000;
        int opciones;
        Scanner input=new Scanner(System.in);

        System.out.println("Bienvenido a bancomierda elija 3 opciones \n "
        + "1: agregar dinero \n "+ "2: retirar dinero  \n"+ " 3: salir ");
        opciones= input.nextInt();




        switch (opciones){

            case 1:
                System.out.println("cuanto dinero desea ingresar: ");
                dineroIngresar= input.nextDouble();
                saldoTotal=dineroIngresar+saldoInicial;
                System.out.println(" su dinero ha sido ingresado y el valor es de: "+ saldoTotal);
                break;

            case 2:
                System.out.println("cuanto dinero desea retirar? ");
                retirarDinero=input.nextDouble();
                saldoTotal=saldoInicial;
                if (retirarDinero<saldoTotal){
                    System.out.println("Lo sentimos no tiene fondos suficientes ");
                    break;

                }else {
                    System.out.println("retiro exitoso de "+ retirarDinero);
                    System.out.println("Su saldo ahora es de: "+ (saldoTotal-retirarDinero));
                }
            case 3:
                System.out.println("A oprimido la opcion de salir 3 \n Saliendo de Bancomierda");

            default:
                System.out.println("Error de digitacion, digite un numero ya sea 1 ,2 o 3");
        }



    }
}