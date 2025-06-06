
package questao1;


public class Carro extends Veiculo {
    private int portas;

    public Carro(String modelo, String marca, int portas) {
        super(modelo, marca);
        this.portas = portas;
    }

    @Override
    public String descrever() {
        return "Carro " + marca + " " + modelo + ", com " + portas + " portas.";
    }

}
