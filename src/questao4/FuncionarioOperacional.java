
package questao4;

import java.time.LocalDate;

public class FuncionarioOperacional extends Funcionario{
   public FuncionarioOperacional(String nome, String cpf, double salarioBase, LocalDate dataAdmissao) {
           super(nome, cpf, salarioBase, dataAdmissao);
       }
       @Override
       public double calcularBeneficio() {
           return salarioBase * 0.05; // 5% de benefício
       }
       @Override
       public String descreverFuncao() {
           return "Realiza atividades de produção e manutenção.";
       }
   
   
}

