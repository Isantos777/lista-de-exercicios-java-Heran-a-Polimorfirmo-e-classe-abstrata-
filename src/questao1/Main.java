
package questao1;


public class Main {

    
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 4);
        Moto moto = new Moto("Honda", "CB500", 500);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 20000);

        System.out.println(carro.descrever());
        System.out.println(moto.descrever());
        System.out.println(caminhao.descrever());
    }
    
}
