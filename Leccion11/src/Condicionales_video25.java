import java.util.Scanner;

public class Condicionales_video25 {
    public static void  main(String[] args){
        System.out.println("Programa calendario pero con dias de 28 a 31 dias");
        /*
        Este programa es un calendario con dias 28  30 y 31

         */
        Scanner calendario= new Scanner(System.in);
        System.out.println("Ingrese el dia del año");
        int diasCalendario= calendario.nextInt();
        System.out.println("Ingrese el mes del calendario: ");
        int mesesCalendario= calendario.nextInt();
        System.out.println("Ingrese el maño del calendario: ");
        int aniosCalendario=calendario.nextInt();

        String nombres="";
        int diasMax=0;



        //String fechaFinal= String.valueOf(diasCalendario) + String.valueOf(mesesCalendario) + String.valueOf(aniosCalendario);
        switch(mesesCalendario){

            case 4 :  case 6: case 9: case 11:
                diasMax=30;
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasMax=31;
                break;
            case 2:
                diasMax=28;
                break;

            default:
                System.out.println("error dia mes o año mal digitado vuelva a intentarlo");
                break;

        }
        switch (mesesCalendario){
            case 1: nombres="enero";break;
            case 2:nombres="febrero";break;
            case 3:nombres="marzo";break;
            case 4:nombres="abril";break;
            case 5:nombres="mayo";break;
            case 6:nombres="junio";break;
            case 7:nombres="julio";break;
            case 8:nombres="agosto";break;
            case 9:nombres="septiembre";break;
            case 10:nombres="octubre";break;
            case 11:nombres="noviembre";break;
            case 12:nombres="diciembre";break;


        }if (diasCalendario>=1 && diasCalendario<=31){
            System.out.println("La fecha es: \n"
                            +diasCalendario+ " del mes "+ nombres + " "+aniosCalendario );
        }else{
            System.out.println("error en numeracion ");
        }
    }
}
