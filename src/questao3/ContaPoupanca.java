
package questao3;


public class ContaPoupanca extends ContaBancaria {
    
    
    public ContaPoupanca(double saldoInicial){
    super(saldoInicial);
    }
    
    @Override
    public void sacar(double valor){
    if(valor <= saldo){
    saldo -=valor;
        System.out.println(" saque de R$:" + valor + "realizado na conta Poupança");
    
    }else{
        System.out.println("saldo insuficiente na conta poupança");
    
    }
    
    }
    @Override
    public void depositar(double valor){
    saldo += valor;
        System.out.println(" deposito de R$:" + valor + "realizado na conta poupança.");
    
    }
}
