import java.security.spec.RSAOtherPrimeInfo;

public class operadores_incremento {
    public static void main(String[] args){

        System.out.println("Operadores incremetos");
        int numeros=5;
        int total=10;
        total+=numeros+1;//la funcion de += es hacer total=total+numeros+1; nos ahorramo volver a poner total
        System.out.println("total numero sumados: "+ total);
    /*
    TENER CUIDADO DONDE VA EL MAS EJEMPLO X++ VS ++XX
    X++ SI SE ASIGNA A UNA VARIBALE NO SE SUMA 1
    ++X ACA SI PRIMERO HACE EL INCREMENTO SOBRE EL VALOR DE X
     */
        //operador incremento
        int decre=20;
        decre++;//esta funcion lo que hace es decre=decre+1; aumenta en 1 el valor
        System.out.println("total es:"+ decre);//

        // EJERCICIOS DE INCREMENTOS

        long incremento1,incremento2;

        incremento1=234;
        incremento2=99;

        incremento1++;
        incremento2++;
        System.out.println("incrementos finales:"+ (incremento1+incremento2));

        // ULTIMO EJERCICIO PARA CLARIDAD

        int z,n,total_incremento; z=98; n=88; // asignamos las variables
        z++;n++;total_incremento= (z)+(n);
        System.out.println("total incrementos:"+ total_incremento);
        System.out.println("valores :"+z+" "+n);




    }
}
