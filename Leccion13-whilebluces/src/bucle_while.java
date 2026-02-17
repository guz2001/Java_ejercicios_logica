import java.util.Scanner;

public class bucle_while {
    public static void main(String[] args){
        //ejemplo while
        /*
        int numero=0;
        while(numero<10){
            numero++;
            System.out.println(numero);
        }
        int num2=100;
        while(num2>1){
            num2--;
            System.out.println("iteracion: "+ num2);
        }
        */
        // bucle con el limite que desee p1 ascendente
        Scanner bucle= new Scanner(System.in);
        System.out.println("ingrese numero de iteracion que desea: ");
        int limite=bucle.nextInt();
        int inicio=1;
        while(inicio<=limite ){
            System.out.println("inicio "+ inicio);
            inicio++;

        }
        System.out.println("ingrese numero de iteracion que desea disminuir: ");
        limite=bucle.nextInt();
        inicio=1;
        while (limite>=inicio  ) {
                limite--;
                System.out.println("decreciendo " + limite);


        }


    }
}
