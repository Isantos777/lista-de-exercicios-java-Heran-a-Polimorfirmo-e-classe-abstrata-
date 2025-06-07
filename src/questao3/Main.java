
package questao3;


public class Main {

    
    public static void main(String[] args) {
       ContaBancaria cc = new ContaCorrente(500);
       ContaBancaria cp = new ContaPoupanca(1000);
       
       cc.depositar(200);
       cc.sacar(100);
       cc.mostrarSaldo();
       
        System.out.println();
        
       cp.depositar(300);
       cp.sacar(200);
       cp.mostrarSaldo();
    }
    
}
