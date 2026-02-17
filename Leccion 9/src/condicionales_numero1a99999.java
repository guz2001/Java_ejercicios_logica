import java.util.Scanner;

public class condicionales_numero1a99999 {
    public static void main(String[] args){
        /*
        numero que leaa las cifras del 1 a  99999
         */
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un numero entre 1 a 99999");
        int n1= leer.nextInt();
        int digitosTotales= String.valueOf(Math.abs(n1)).length();
        /*
        Lo que se hace aca es int digitosTotales= String.valueOf(Math.abs(n1)).length();
        1- se nombra int por que el valor solicitado se almacena en un entero
        2- Math.abs(n1) -> llamamos la clase Math y invoca la accion abs que es valor absoluto que es un metodo
        3-Todo lo anterio se guarda y la clase String con el metodo valueof saca la informacion
        4-finalmente esa informacion es leida por el metodo length(); dejandonos asi los digitos exactos
        5- la cantidad de digitos exactos se alamcena en la variable de tipo int llamada digitoTotales
        6-Despues se imprime y gg naiz
         */
        System.out.println("el numero seleccionado tiene "+ digitosTotales);
    }
}
