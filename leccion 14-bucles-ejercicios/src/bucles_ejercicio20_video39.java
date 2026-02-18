import java.util.Scanner;

public class bucles_ejercicio20_video39 {
    public static void main(String[] args){
        /*
        EJERCICIO20
         */
        Scanner n= new Scanner(System.in);
        System.out.println("numeros de sueldos a ingresar: ");
        int nVeces=n.nextInt(), nSueldos=0,sueldoActual=0,sueldoMaximo=0;
        for(int i=1;i<=nVeces;i++){
            sueldoActual+=nSueldos;
            do {
                System.out.println("ingrese sueldos");
                nSueldos=n.nextInt();
            }while (nSueldos<0 || nSueldos>999999999);

            if (sueldoActual<nSueldos){
                System.out.println("sueldo maximo ingresado es de:"+ nSueldos);
                sueldoMaximo=nSueldos;

            } else if (sueldoActual==nSueldos) {
                System.out.println("el sueldo es igual al anterior");

            }else {
                System.out.println("sueldo anterior es menor al ingresado");
            }

        }
        System.out.println("sueldo maximo es de :"+ sueldoMaximo);
    }
}
