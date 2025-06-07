
package questao4;

import java.time.LocalDate;

public class FuncionarioGerencial extends Funcionario {
     public FuncionarioGerencial(String nome, String cpf, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, salarioBase, dataAdmissao);
    }
     
     
     @Override
    public double calcularBeneficio() {
        return salarioBase * 0.20; // 20% de benefício
    }

    @Override
    public String descreverFuncao() {
        return "Coordena equipes e toma decisões estratégicas.";
    }
}
