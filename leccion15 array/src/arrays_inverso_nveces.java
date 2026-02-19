import java.util.Scanner;

public class arrays_inverso_nveces {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("cuantos numeros quiere:");
        int nVeces=sc.nextInt();
        double [] lista= new double[nVeces];
        for(int i=0;i<nVeces;i++){
            System.out.println("digite el numero parcero:");
            lista[i]= sc.nextDouble();
            System.out.println("numero de "+( i+1)+" tiene a el numero "+ lista[i]);


        }
        for (int i=nVeces;i>0;i--){
            System.out.println("Se invirte el numero y es: "+lista[i-1]);

        }
        System.out.println("conclusion ya entendi esta puta mierda gg izi");
    }
}
