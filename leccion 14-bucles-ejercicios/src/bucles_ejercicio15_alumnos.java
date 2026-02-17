import java.util.Scanner;

public class bucles_ejercicio15_alumnos {
    public static void main(String[] args){
        /* Dada las edades  y alturas  de 5 alumnos , mostrar  la edad  y estatura media, la cantidad de alumnos mayores
        a 18 años y la cantidad de alumnos que miden mas de 1.75 metros
         */
        Scanner e= new Scanner(System.in);
        double alumnos,edadAlumnos=0,estaturaAlumnos=0,alturaPromedio=0,alturaPromedio2=0,edadPromedio1=0,edadPromedio2=0,
                alturaPromedio3=0,alturaPromedio4=0,edadPromedio3=0,edadPromedio4=0;
        int contador1=0,contador2=0,contador3=0,contador4=0;
        for(int v=1;v<=5;v++){
            System.out.println("ingrese edad");
            edadAlumnos=e.nextDouble();
            System.out.println("ingrese estatura");
            estaturaAlumnos=e.nextDouble();
            if (edadAlumnos<18 && estaturaAlumnos<1.75 ){
                edadPromedio1+=edadAlumnos;
                alturaPromedio+=estaturaAlumnos;
                contador1++;



            } else if (edadAlumnos>=18 && estaturaAlumnos>=1.75) {
                edadPromedio2+=edadAlumnos;
                alturaPromedio+=estaturaAlumnos;
                contador2++;

            } else if (edadAlumnos>=18 && estaturaAlumnos<1.75) {
                edadPromedio3+=edadAlumnos;
                alturaPromedio3+=estaturaAlumnos;
                contador3++;

            }else if (edadAlumnos<18 && estaturaAlumnos>=1.75){
                edadPromedio4+=edadAlumnos;
                alturaPromedio4+=estaturaAlumnos;
                contador4++;
            }
            else {
                System.out.println("ERROR");
            }
        }
        System.out.println("Cantidad alumnos menores a 18 y menores a 1.75 m "+contador1 );
        System.out.println("Cantidad alumnos mayores a 18 y mayores a 1.75 m "+contador2 );
        System.out.println("Cantidad alumnos mayores a 18 y menores a 1.75 m "+contador3 );
        System.out.println("Cantidad alumnos menores a 18 y mayores a 1.75 m "+contador4 );
        System.out.println("promedio final clase edad "+ ((edadPromedio1+edadPromedio2+edadPromedio3+edadPromedio4)/(contador1+contador2+contador3+contador4)));
        System.out.println("promedio final clase edad "+ ((alturaPromedio+alturaPromedio2+alturaPromedio3+alturaPromedio4)/(contador1+contador2+contador3+contador4)));
    }
}
