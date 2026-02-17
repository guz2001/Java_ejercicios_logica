public class math_exponente_prueba {
    public static void main(String[] args){
        System.out.println("Exponente en java");
        double base=5, potencia=4;// escogemos dos valores base y exponente, el exponente actua sobre la pase osea 2**2=8
        double exponenteFinal=Math.pow(base,potencia);// pow se utiliza para poder agrear los dos paramentros
        System.out.println("exponente resultado es de: "+exponenteFinal);

        /*
            El metodo exponente con """"pow"""" permite escoger dos parametros la base y el exponente
            siempre se importa con Math.pow, para todos los metodos matematicos se utiliza en MAyuscula la Math
         */
        //Otro ejemplo de exponentes

        float numeroF,expF;
        numeroF=21312.4342f;
        expF=32.4f;
        double resultadoF=Math.pow(numeroF,expF);
        System.out.println("total float exponente: "+resultadoF);



    }
}
