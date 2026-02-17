import java.util.Scanner;

public class bucles_ejercicio14_vid36 {
    public static void main(String[] args){
        /*
        1-pedir 10 sueldos:
        2-Mostrar  su suma
        3-cuantos hay mayores hay  $1000
        */
        Scanner di= new Scanner(System.in);
        int sueldos,sumaSueldo=0,sumaSuperSueldo=0,conteoSueldoBase=0,conteoSueldoSuper=0,conteoCeroSueldo=0;
        for(int i=1;i<=10;i++){
            System.out.println("ingrese el sueldo de cada trabajador:");
            sueldos=di.nextInt();
            if(sueldos<0) {
                conteoCeroSueldo++;
            }else if(sueldos<=1000){
                sumaSueldo+=sueldos;
                conteoSueldoBase++;
            } else if (sueldos>1000) {
                sumaSuperSueldo+=sueldos;
                conteoSueldoSuper++;
            }
        }


        System.out.println("cantidad de sueldos bases es de "+ conteoSueldoBase);
        System.out.println("cantidad de sueldos mayores a 1000 "+ conteoSueldoSuper);
        System.out.println("cantidad de sueldos erroneos es de "+ conteoCeroSueldo);
        System.out.println("Suma total sueldos "+ (sumaSueldo+sumaSuperSueldo));
    }



}
