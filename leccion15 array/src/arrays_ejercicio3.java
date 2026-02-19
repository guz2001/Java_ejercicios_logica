import java.util.Scanner;

public class arrays_ejercicio3 {
    public static void main(String[] args){
        /*
        sadasd
         */
        Scanner sc= new Scanner(System.in);
        float [] lista= new float[5]; float sumaLista=0,contadorCeros=0,contadorPos=0,contadorNeg=0,sumaListaNeg=0;
        float mediaPos=0,mediaNeg=0;
        for(int i=0;i<lista.length;i++){
            System.out.println("ingrese numero para el espacio:  "+ i);
            lista[i]= sc.nextFloat();

            if(lista[i]>0){
                sumaLista+=lista[i];
                contadorPos++;
                System.out.println(sumaLista+" "+lista[i]);

            } else if (lista[i]<0) {
                sumaListaNeg+=lista[i];
                contadorNeg++;
                System.out.println("numeros ingresados negativos es de "+contadorNeg+"suma"+sumaListaNeg+"valor "+lista[i]);


            }else if(lista[i]==0){

                contadorCeros++;
                System.out.println("cantidad ceros es de: "+ contadorCeros);
            }else {
                System.out.println("ningun cero o dato erroneo ");
            }
        }
        if(contadorPos==0){
            System.out.println("no hay numeros positivos");
        }else{
            mediaPos=sumaLista/contadorPos;
            System.out.println("cantidad positivos es :"+ contadorPos+" media total es de: "+(mediaPos));
        }
        if(contadorNeg==0){
            System.out.println("no hay ningun dato negativo");
        }else {
            mediaNeg=sumaListaNeg/contadorNeg;
            System.out.println("cantidad negtativos es de: "+ contadorNeg+" media total es de: "+mediaNeg);
        }
        if(contadorCeros==0){
            System.out.println("no hay ningun valor de 0");
        }else {
            System.out.println("cantidad de ceros"+contadorCeros);
        }





    }
}
