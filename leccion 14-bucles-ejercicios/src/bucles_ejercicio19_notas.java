import java.util.Scanner;

public class bucles_ejercicio19_notas {
    public static void main(String[] args){
        /*
        nota estudiantes

        1-dar 6 notas
        2-cantidad de alumnos
        3-aprobados
        4-condicionados=4
        5-suspensos
         */
        Scanner al=new Scanner(System.in);
        float alumnosNotas,alumnosAprobados=0,alumnosReprobados=0,alumnosCondicionados=0;

        for(int i=1; i<=6;i++){
            do {

                System.out.println("digite la nota del estudiante del o al 10: " );
                alumnosNotas = al.nextFloat();

            }while (alumnosNotas<0 || alumnosNotas>10);// se repite mientras sea verdadero, y no avanza

             if(alumnosNotas>4){
                 System.out.println("El estudiante aprobo");
                 alumnosAprobados++;


             } else if (alumnosNotas==4) {
                 System.out.println("el estudiante tiene riesgo de reprobar la nota es mediocre");
                 alumnosCondicionados++;
             }else{
                 System.out.println("el estudiante reprobo");
                 alumnosReprobados++;
             }

        }
        System.out.println("cantidad de alumnos aprobados es de "+alumnosAprobados);
        System.out.println("cantidad de alumnos reprobados es de "+alumnosReprobados);
        System.out.println("cantidad de alumnos mediocres es de "+alumnosCondicionados);
    }
}
