
package questao3;


public class ContaCorrente extends ContaBancaria {
    
    
public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado na Conta Corrente.");
        } else {
            System.out.println("Saldo insuficiente na Conta Corrente.");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado na Conta Corrente.");
    }
}
