import java.util.Scanner;

public class bucles_numeros_media {
    public static void main(String[] args){
        /*
        Pedir numeros hasta que  se introduzca  uno negativo y  calcular media
         */
        Scanner num= new Scanner(System.in);//inicializamos la tomas de datos

        double numerosMedia;
        double sumaTotal=0;
        double veces=0;
        double iteraciones=0;
        do {
            System.out.println("ingrese un numero hasta el negativo");
            numerosMedia=num.nextDouble();
            if (numerosMedia>=0){
                sumaTotal+=numerosMedia;
                veces++;

            }else{
                System.out.println("se ha introducido un numero negativo");
            }
            iteraciones++;

        }while(numerosMedia>=0);
        System.out.println(
        "la cantidad de itentos fueron: "+veces+"\n  suma total es de:   "+ sumaTotal
        +"\n Promedio total de los datos adjuntos "+ (sumaTotal/veces)+ " '\n  Cantidad de intentos reales es de " + iteraciones);



    }
}
