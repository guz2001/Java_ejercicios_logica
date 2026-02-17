public class bucles_producots_10_imparesx2 {
    public static void main(String[] args){
        /*
        Programa que muestra el producto multiplicacion los 10 primeros numeros impares.
         */
        long numIni=1;
        long producto=1;
        for (int i =1;i<=20;i+=2){

            producto*=i;
            System.out.println("cubo es "+ i);
            System.out.println("numero de multiplicacion es de: "+ producto);

        }
        System.out.println("cubo final de los impares es de "+ producto);
    }
}
