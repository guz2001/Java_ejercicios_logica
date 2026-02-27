package ClasesYObjetos;

public class Operaciones_declaradas_parametros {
    int suma,resta,multiplicacion,division;
    public void sumarEs(int num1,int num2){
        suma=num1+num2;
    }
    public void restarEs(int num1,int num2){
        resta=num1-num2;
    }
    public void multiplicarEs(int num1,int num2){
        multiplicacion=num1*num2;
    }
    public void dividirEs(int num1,int num2){
        division=num1/num2;
    }
    public void  resultadosMostrar(){
        System.out.println("suma es:"+suma);
        System.out.println("dividir es: "+ division);
        System.out.println("multiplicar es: "+ multiplicacion);
        System.out.println("restarn es: "+resta);
    }
}
