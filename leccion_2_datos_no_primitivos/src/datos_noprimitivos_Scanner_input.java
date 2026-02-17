
import java.util.Scanner;

public class datos_noprimitivos_Scanner_input {
    public static void main(String[] args){
        // suma utilizando Scanner con enteros
        Scanner input1= new Scanner(System.in);
        Scanner input2= new Scanner(System.in);
        int suma1;
        int suma2;
        System.out.println("escriba un numero: ");
        suma1= input1.nextInt();
        System.out.println("Escriba otro numero: ");
        suma2=input2.nextInt();
        int total= suma1+suma2;
        System.out.println("total suma de entrada es: "+total);
        //suma con decimales usando float y double
        Scanner dato1= new Scanner(System.in);
        Scanner dato2= new Scanner(System.in);
        System.out.println("ingrese un numero decimal: ");//solicitamos el primero datos decimal
        float decimal_float1=dato1.nextFloat();
        System.out.println("ingrese un segundo numero decimal");
        float decimal_float2=dato2.nextFloat();//nos aseguramos que siempre tenga la f al final ya que es un float
        float suma_float= decimal_float1+decimal_float2;//suma de floats
        System.out.println("suma total de flotantes es de: "+ suma_float);
        /*
            Ahora utilizaremos Scanner con double que es un flotante mas largo de 8 bytes o 64 bites
         */
        // siempre para los numeros con decimales se pone en , para evitar errores
        Scanner dato_double1= new Scanner(System.in);
        Scanner dato_double2= new Scanner(System.in);
        System.out.println("ingrese un numero decimal grande");
        double numero_double1= dato_double1.nextDouble();
        System.out.println("ingrese un segundo numero decimal grande");
        double numero_double2=dato_double2.nextDouble();

        double suma_grande= numero_double1+numero_double2;
        System.out.println("total suma numeros grandes decimales es de: "+ suma_grande);
    /*
        Input con cadenas de texto
    */
    // esta vez usaremos el Scaner ya creado de arriba primero para no creear mas por que es inecesarrio
    //se armo un problema entonces crearemos otro Scanner
        Scanner string_entrada1=new Scanner(System.in);

        System.out.println("Escriba su nombre: ");
        String nombre_usuario=string_entrada1.next();// si dejamos solo next() imprime texto hasta que encuentre un espacio
        string_entrada1.nextLine();
        System.out.println("su nombre incompleto es: "+ nombre_usuario);
        String nombre_usuario_completo= string_entrada1.nextLine();//nextLine permite copiar toda la cadena con espacios
        System.out.println("nombre completo de usuario es :"+ nombre_usuario_completo);
    /*
        ahora realizaremos la entrada de datos pero con char o un caracter
     */
        Scanner caracter= new Scanner(System.in);

        System.out.println("Digite una sola letra: ");
                                             //espacio de letra indica charAt(aca va el espacio donde esta);
        char caracter1= caracter.next().charAt(0);// charAt sirve para indicar especificamente que letra guardar en el caso de que se pongan mas 0 es la primera y de arriba son la siguientes

        System.out.println("su letra es:"+ caracter1);

        //ultimos ejemplos sacenner con todos los datos

        Scanner scaner1= new Scanner(System.in);
        // con valores enteros




    }
}
