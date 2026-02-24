package ClasesYObjetos;

public class Carro {
    String color;
    String modelo;
    int kmTotal;
    public static void main(String []args){
        System.out.println("prueba");
        Carro carro1= new Carro();
        carro1.color= "black";
        carro1.modelo="BMW";
        carro1.kmTotal=20;
        System.out.println("color es: "+carro1.color);
        System.out.println("Modelo es: "+ carro1.modelo);
        System.out.println("Kilometraje es de: "+carro1.kmTotal);
        Carro carro2= new Carro();
        carro1.color="blanco";
        carro2.modelo="Audi";
        carro2.kmTotal=0;
        System.out.println("color carro 2 es: "+ carro2.color);
        System.out.println("modelo carro 2 es: "+carro2.modelo);
        System.out.println("kilometraje  carro 2 es: "+ carro2.kmTotal);

    }

}
