import java.util.Scanner;

public class Ejercicio2_salario {
    public static void main(String[] args){
        double salarioHoras,horasTrabajadas,salarioSemanal;//creamos las variables para hacer el promedio
        //creamos un scanner para que el usuario ingrese sus datos
        Scanner salarioCalculador= new Scanner(System.in);
        //asignamos los valores a las variables
        System.out.println("Cuanto es su salario por hora? ");
        salarioHoras=salarioCalculador.nextDouble();
        System.out.println("Cuantas horas trabajo esta semana? ");
        horasTrabajadas=salarioCalculador.nextDouble();
        salarioSemanal=salarioHoras*horasTrabajadas;
        System.out.println("su salario semanal es de: $"+ salarioSemanal);

    }
}
