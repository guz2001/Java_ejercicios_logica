public class operadores_decremento {
    public static void main(String[] args){
        System.out.println("valores decrementos");
        int resta=10;
        resta-=-1;
        System.out.println("resta es: "+resta);// operador de resta

        // ejemplo practico incremento

        int a=10;
        int b=5;

        int total=(a--)+(--b);// tener cuidado DONDE SE PONE EL ++ AFECTA
        System.out.println("total deberia ser 16: "+total);
        System.out.println("valor final de a es:"+a);
        System.out.println("valor final de b es: "+b);
        // tener cuidado en donde esta ubicado el + en la variable
        // y=x-- y toma el valor de x y deja el decremento en espera aca y=5
        //y=--x y hace el incremento sobre el valor que sigue de x, aca y=4
        int xx,yy;
        xx=100;yy=10;
        int totales;
        totales= (xx--) - (--yy);//xx es 100 y yy es 9
        System.out.println("total resta es:"+ totales);//xx al final termina con valor de 99
        System.out.println("valores finales son:" + xx +yy);
        System.out.println(99-9);


    }
}
