import java.util.Scanner;

public class Ejercicio3_video15 {
    public  static void main (String[] args){
        /*
        Guillormo tiene dinero n
        juan tiene la mitad de dinero de guillermo
        luis tiene la mitad de la suma de dinero de guillermo y juan
        total_dinero 3= (n+(n/2))+(n+(n/2))
         */
        System.out.println("Ejercicio dinero juan guillero luis \n");
        float guillermoDolares,juanDolares,luisDolares;
        Scanner dolaresN= new Scanner(System.in);// enntrada de dinero de lo que tiene guillermo
        System.out.println("Cuanto dinero tiene guillermo? ");
        guillermoDolares=dolaresN.nextFloat();
        System.out.println("guillermo tiene $"+ guillermoDolares);
        luisDolares=guillermoDolares/2;
        System.out.println("Luis tiene la mitad  de dinero de guillermo que es ------- $"+luisDolares);
        juanDolares=(luisDolares+guillermoDolares)/2;
        System.out.println("Juan tiene la mitad de la suma de dinero de luis y guillermo juntos que es $"+juanDolares);
        System.out.println("por lo que guillermo tiene: $"+ guillermoDolares);
        System.out.println("Juan tiene: $"+juanDolares);
        System.out.println("Luis tiene: $"+luisDolares);
        System.out.println("Cantidad total de dinero entre los tres es de: $"+(guillermoDolares+luisDolares+juanDolares));




    }
}
