public class repaso_incremento_decremento {
    public static void main(String[] args){
        System.out.println("repaso de incrementos");
        //positivos

        long incremento,incremento2;
        incremento=1;
        incremento2=1;
        incremento++;//2
        System.out.println("incremento ++: "+incremento);
        incremento2++;//2
        System.out.println("incremento ++: "+incremento2);
        incremento2+=1;//3 por que se guarda el valor de arriba
        System.out.println("incremento ++: "+incremento2);
        incremento+=1;// 3 por que se guarda el valro de arriba
        System.out.println("incremento ++: "+incremento2);

        int decre1,decre2;
        decre1=10;
        decre2=5;
        //int total_de= ()-();//
        int resu1=(decre1--)-(--decre2);
        int resu2=(--decre1)-(decre2--);
        System.out.println("askldlkasj: "+resu1+" "+resu2);
        System.out.println("total que yo creo que es: 1");
        System.out.println("total real es: ");

        decre1--;
        System.out.println("valor final decremento:"+decre1);
        decre2--;
        System.out.println("valor final decremento: "+ decre2);
        decre1-=1;
        System.out.println("valor final decremento: "+ decre1);
        decre2-=1;
        System.out.println("valor final decremento: "+decre2);
        //operacion final
        //total= (10)-(4)-(9)-(4)

    }
}
