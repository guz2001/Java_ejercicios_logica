import java.util.Scanner;

public class Codicionales_swich {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        //condicionales swiche case
        System.out.println("creamos el scanner");

        Scanner inputEntrada= new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int numero1= inputEntrada.nextInt();
        switch (numero1){
            case 1: System.out.println("El numero es 1");
                    break;
            case 2: System.out.println("NUmero es 2");
                    break;
            case 3:
                System.out.println("Numero es 3 ");
                numero1--;
                System.out.println("valor final es "+ numero1);
                break;

            case 0:
                System.out.println("el numero ingresado es 0 por lo que se hara algo");
                numero1*=numero1;
                int suma;
                suma= numero1+20;
                System.out.println("resultado es "+ numero1+suma+" total suma: "+(numero1+suma));
                break;
            case 4:
                System.out.println("haremos una exponenciacion si  es 4");
                double expon=Math.pow(numero1,numero1);
                System.out.println("total exponente es "+ expon);
                break;
            case 6:
                System.out.println("numero es 6 "+numero1);
                numero1+=1;
                System.out.println(numero1);
                break;

        }
        /*
        La idea de switch con case es que podemos asignalre un valor de entrada y si este conicide con case (argumento)
        hara algo con esta informacion segun lo que se frabrico en case
         */

    }
}