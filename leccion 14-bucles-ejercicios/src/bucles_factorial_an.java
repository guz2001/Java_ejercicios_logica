import java.util.Scanner;

public class bucles_factorial_an {
    public static void main(String[] args){
        /*
        hacer la siguiente ecuacion !N= 1*2*3*4..*N

         */
        Scanner n=new Scanner(System.in);
        System.out.println("ingrese un numero n para multiplicar factorial:");
        int facto=n.nextInt();
        int mul=1;
        for(int i=facto;i>0;i--){

            mul*=facto;

            System.out.println("factoria iteracion  "+ i + "numero disminuye a "+ facto+"  y se multilica el anterior  "+ mul  );
            facto--;



        }
        System.out.println("factorial final es = "+mul );
    }

}
