import javax.swing.*;

public class Operadores_JOPTION {
    public static void main(String[] args){
        /*
            ahora haremos las mismas suma de sacanner pero con interfaz grafica
         */
        double dato_double1= Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero con decimales: "));
        double dato_double2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero con decimales: "));
        double suma_double_grafica=dato_double1+dato_double2;

        JOptionPane.showMessageDialog(null,"suma total es de:"+suma_double_grafica);

        /*
            suma de numeros enteros con interfaz grafica
         */

        int entero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero: "));
        int entero2=Integer.parseInt(JOptionPane.showInputDialog("ingresar numero entero 2: "));
        int total= entero1+entero2;// se hace esta funcion para que se sume
        //imprimimos el resultado almacenado en la variable
        JOptionPane.showMessageDialog(null,"Suma total en la variable es de: "+total);
        //suma total pero con la ecuacion impresa
        JOptionPane.showMessageDialog(null,"Suma total de los enteros es de : "+(entero1+entero2));
        //resultado final de la suma

        /*
            Booleano con interfaz grafica
         */

        boolean estado=Boolean.parseBoolean(JOptionPane.showInputDialog("ingrese un valor true o false: "));
        JOptionPane.showMessageDialog(null,"el estado escogido es de : "+estado);
        /*
            String en ventana emergente
        */

        String cadenas=JOptionPane.showInputDialog("ingrese una cadena de texto:");
        JOptionPane.showMessageDialog(null,"el mensaje emergente es : "+cadenas);
    }
}
