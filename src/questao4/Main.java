
package questao4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new FuncionarioAdministrativo("Ana", "111.111.111-11", 3000, LocalDate.of(2020, 3, 15)));
        funcionarios.add(new FuncionarioOperacional("Carlos", "222.222.222-22", 2500, LocalDate.of(2021, 6, 10)));
        funcionarios.add(new FuncionarioGerencial("Mariana", "333.333.333-33", 8000, LocalDate.of(2019, 1, 5)));

        for (Funcionario f : funcionarios) {
            f.mostrarDados();
        }
    }
       
    }
 
