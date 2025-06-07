
package questao3;


public abstract class ContaBancaria {
    protected double saldo;
    
    public ContaBancaria(double saldoInicial){
    this.saldo = saldoInicial;
    
    
    }
    
    public abstract void sacar(double valor);
    
    public abstract void depositar(double valor);
    
    public void mostrarSaldo(){
        System.out.println(" saldo atual: R$ " + saldo);
}
    
    
}
