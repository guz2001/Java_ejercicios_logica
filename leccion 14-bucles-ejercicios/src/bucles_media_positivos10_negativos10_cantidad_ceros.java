import javax.swing.text.html.parser.Parser;
import java.util.Scanner;

public class bucles_media_positivos10_negativos10_cantidad_ceros {
   public static void main(String[] args){
        /*
    bucles_media_positivos10_negativos10_cantidad ceros
    1-pedir 10 numeros
    2-hacer media de los positivos
    3-hacer media negativos
    4-cantidad de ceros
     */

       Scanner media=new Scanner(System.in);
       double calcMediaPos=0,conteoPos=0,mediaIngresar;
       double calcMediaNeg=0,conteoNeg=0,conteoCero=0;
       for(int i=1;i<=10;i++) {
           System.out.println("ingrese un numero");
           mediaIngresar = media.nextDouble();
           if (mediaIngresar > 0) {
               calcMediaPos += mediaIngresar;
               conteoPos++;

           } else if (mediaIngresar == 0) {

               conteoCero++;

           } else {
               calcMediaNeg += mediaIngresar;
               conteoNeg++;
           }
       }
       media.close();
       //conteo positivos
       if (conteoPos==0){
           System.out.println("no se puede sacar media ya que no se digitaron numeros positivos");
       }else {
           System.out.println("calculo de media positiva es de "+(calcMediaPos/conteoPos));

       }
       //conteo ceros
       if (conteoCero==0) {
           System.out.println("ningun negativo digitado");
       }else {
           System.out.println("cantidad de ceros ingresados es de:  "+conteoCero);
       }
       //conteo negativos
       if(conteoNeg==0){
           System.out.println("ningun negativo digitado");
       }else {
           System.out.println("calculo de media negativa es: " + (calcMediaNeg / conteoNeg));
       }


   }
}
