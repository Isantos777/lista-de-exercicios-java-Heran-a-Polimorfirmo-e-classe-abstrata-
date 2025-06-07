
package questao4;

import java.time.LocalDate;

public class FuncionarioAdministrativo  extends Funcionario{
    public FuncionarioAdministrativo(String nome, String cpf, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, salarioBase, dataAdmissao);
    }
    @Override
    public double calcularBeneficio(){
    return salarioBase * 0.10; //10% de benefício
    }
    @Override
    public String descreverFuncao(){
    return"Executa tarefas administrativas e de apoio ao escritório.";
    
    }
}
