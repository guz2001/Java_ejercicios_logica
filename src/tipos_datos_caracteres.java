public class tipos_datos_caracteres {
    public static void main (String[] args){
         //solo para uno en especifico
        char caracter= 's';
        System.out.println(caracter);

        //String o cadena de texto
        String myText = "Hello";

        System.out.println(myText);
        String word = "juandavidguzmancastro";

        System.out.println(word);
         int cantidad_caracteres= word.length();
        System.out.println("Cantidad de letras es: "+cantidad_caracteres);

        String prueba="holamundoxdxd";
        System.out.println(prueba);
        /* el siguiente se demuestra que string con comillas simple da error ya que este SOLO ES PARA CHAR
        String prueba2='esto es con comillas simples';
        System.out.println(prueba2);
        */
    }
}
