
package questao4;
import java.time.LocalDate;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salarioBase;
    protected LocalDate dataAdmissao;
    
    
    public Funcionario(String nome,String cpf, double salarioBase, LocalDate dataAdmissao ){
    
    this.nome = nome;
    this.cpf = cpf;
    this.salarioBase = salarioBase;
    this.dataAdmissao = dataAdmissao;
    
    
    
    }
    
    public abstract double calcularBeneficio();
    
    public abstract String descreverFuncao();
    
    
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário base: R$" + salarioBase);
        System.out.println("Data de admissão: " + dataAdmissao);
        System.out.println("Função: " + descreverFuncao());
        System.out.println("Benefício: R$" + calcularBeneficio());
        System.out.println();
    }
    
}
