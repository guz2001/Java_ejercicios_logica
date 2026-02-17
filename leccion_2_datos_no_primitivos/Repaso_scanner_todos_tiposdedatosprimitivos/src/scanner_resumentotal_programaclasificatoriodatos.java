import java.util.Scanner;

public class scanner_resumentotal_programaclasificatoriodatos {
    public static void main(String[] args){
        // pedimos el tipo de dato
        Scanner tipo_dato=new Scanner(System.in);
        // dependiendo del valor ingresado se imprimira
        System.out.print("ingrese un valor:");
/*
    UTILIZAREMOS CONDICIONALES POR QUE ME DA LA PUTA GANA Y ES MAS COMPLEJO GG
 */
        if (tipo_dato.hasNextInt()) {
            int numero_entero= tipo_dato.nextInt();// guardamos el valor y lo imprimimos
            System.out.println("el numero ingresado es:"+ numero_entero);
            //hacemo una funcion de suma
             int suma= numero_entero+numero_entero;
            System.out.println("suma total si es entero es: "+ suma);
        } else if (tipo_dato.hasNextDouble()) {
            double numero_decimal=tipo_dato.nextDouble();

            System.out.println("dato ingresado es de:"+ numero_decimal);//imprimimos el valor ingresado
            // funcion suma dato decimal
            double suma_decimales= numero_decimal + numero_decimal;
            System.out.println("suma total con decimales es de: "+ suma_decimales);

        } else if (tipo_dato.hasNextBoolean()) {
            boolean dato_booleano= tipo_dato.nextBoolean();
            System.out.println("el dato ingresado es:"+ dato_booleano);
            //hacemos algo con ese dato
            // si es true se imprimira tru si no pues false
            if(dato_booleano){
                System.out.println("su dato es:"+ dato_booleano);
            }



        } else if (tipo_dato.hasNext()) {
            //imprimimos el valor de char si es un caracter

            String caracteres =tipo_dato.nextLine();// se agrega line debido a que quiero que tome los espacios si no
            //tomara los datos hasta el espacio y dara error
            int contar=String.valueOf(caracteres).length();

            if(contar==1) {
                char caracter=caracteres.charAt(0);
                System.out.println("el valor es un caracter de:" + caracter);



            } else if(contar>1) {
                String cadena=caracteres;

                System.out.println("esta es una cadena:"+ cadena);
                System.out.println("total digitos es de:"+ contar);


            }
        }
    }
}
