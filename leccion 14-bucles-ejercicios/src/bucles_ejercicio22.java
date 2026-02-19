import java.util.Scanner;

public class bucles_ejercicio22 {
    public static void main(String[] args){
        /*
        pedir 5 calificaciones de almunos y decir al final si hay alguno suspenso
         */
        Scanner note=new Scanner(System.in);
        float alumnosNota;
        int notaExcel=0,notaMedia=0,notaReprobatoria=0;
        for (int i=1;i<=5;i++){
            do {
                System.out.println("Nota del estudiante numero " + i + "\n notas de 4 a 5 son excelentes"
                        + "\n notas de 3 a 3,9 regulares" + " notas de 0 a 2,9 reprobatorias ");
                alumnosNota=note.nextFloat();
            }while (alumnosNota<0 || alumnosNota>6);

            if (alumnosNota>3.9){
                notaExcel++;
                System.out.println(" la nota del estudiante= "+ i + " = es excelente" );
            }else if (alumnosNota<3){
                notaReprobatoria++;
                System.out.println(" la nota del estudiante= "+ i + "= mala perdio" );
            }else {
                notaMedia++;
                System.out.println(" la nota del estudiante= "+ i + "= es regular pero aprobo" );
            }
        }
        System.out.println("cantidad de alumnos reprobados es de  "+ notaReprobatoria);
        System.out.println("cantidad de alumnos medios aprobados es de  "+ notaMedia);
        System.out.println("cantidad de alumnos aprobados excelentes es de  "+ notaExcel);
    }
}
