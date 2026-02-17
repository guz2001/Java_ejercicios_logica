import java.util.Scanner;

public class scanner_booloeanos {
    public static void main(String[] args){
        System.out.println("Practica de booleanos con scanner");
        boolean condicion1= true;
        System.out.println("condicion inicial es : "+condicion1);
        boolean condicion2=false;
        System.out.println("condicion final:"+ condicion2);
        // ejecutamos Scanner en el ejemplo

        Scanner condicion= new Scanner(System.in);
        System.out.println("escoga una condicion false o true");
        boolean condicion_final=condicion.nextBoolean();
        System.out.println("el valor ingresado es:"+condicion_final);


    }
}
