import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class array_ejercicio6 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int [] numA=new int[12];
        int [] numB = new int[12];
        int [] numC=new int [24];
        for(int i=0;i<12;i++){
            System.out.println(" a  ");
            numA [i]=scan.nextInt();
            System.out.println(" b ");
            numB[i]=scan.nextInt();
        }
        int it=0;
        for(int i=0;i<24;i++){
            numC[it]=numA[i];
            it++;
            numC[it]=numB[i];
            it++;
            numC[it+1]=numA[i];
            it++;
            numC[it+1]=numB[i];
            it++;
            numC[it+2]=numA[i];
            it++;
            numC[it+2]=numA[i];
            System.out.println(numC[it]);

        }
        for(int i=0;i<24;i++){
            System.out.println("menor: "+numC[it]+" mayor ");
        }
    }
}
