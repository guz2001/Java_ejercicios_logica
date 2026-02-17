import java.util.Scanner;

public class condicionales_estructura {
    public static void main(String[] args){
        //condicionales kasdklasjdklasj
        double numeroflotante=8.2*(Math.random()), numeroCodicion;
        Scanner numeroEntrada= new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO CON DECIMALES:");
        numeroCodicion=numeroEntrada.nextFloat();
        if( numeroCodicion==numeroflotante){
            System.out.println("este numero es el mismo");

        }else if(numeroCodicion<numeroflotante){
            System.out.println("numero ingresado menor al " + numeroflotante);
        }
        else if(numeroCodicion>numeroflotante) {
            System.out.println("numero ingresado mayor al " + numeroflotante);
        } else{
            System.out.println("error numero incorrecto");

        }
    }
}
