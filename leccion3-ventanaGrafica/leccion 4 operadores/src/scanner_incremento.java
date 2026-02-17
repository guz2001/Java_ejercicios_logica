import java.util.Scanner;

public class scanner_incremento {
    public static void main(String[] args){
        //Utilizaremos un scanner para tomar los datos numericos e incrementarlos

        Scanner scannerIncremento= new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        //con enteros
        int entero=scannerIncremento.nextInt();
        //incrementamos

        entero++;
        System.out.println("incrementado es: "+entero);
        System.out.println("otro entero: ");
        int entero2=scannerIncremento.nextInt();
        entero2++;
        System.out.println("entero incrementado en:"+entero2);
        //suma de los dos incrementos

        System.out.println("suma total es de: "+(entero+entero2));
        // otro incremento
        System.out.println("ingrese un entero: ");
        long sumaEntero1=scannerIncremento.nextLong();
        System.out.println("ingrese otro entero: ");
        long sumaEntero2=scannerIncremento.nextLong();
        long sumaTotal= sumaEntero1+sumaEntero2;
        System.out.println("suma total es de: "+sumaTotal);
        long sumaTotalIncrementada = sumaTotal + 1;
        System.out.println("suma total incrementada es de: "+sumaTotalIncrementada);

        // un bucle pequeño
        int bucle=10;

        while(bucle>=1){
            System.out.println("iteracion numero:"+bucle);
            bucle--;



        }
        long bucle2=1;
        while(bucle2<=10){
            System.out.println("interacion:"+bucle2);
            bucle2++;

        }

        // ahora con for
        int contador=60;
        double i;
        for(i=1; i<=contador; i++ ){
            System.out.println("cuenta regresiva en:"+i);


        }

        int conteo=1;
        while(conteo<=60){
            System.out.println("cuenta regresiva es:"+ conteo);
            conteo++;
        }

        int regresiva=60;
        while(regresiva>=1){
            System.out.println("a la inversa es:"+ regresiva);
            regresiva--;
        }
    }
}
