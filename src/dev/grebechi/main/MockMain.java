
package dev.grebechi.main;

import dev.grebechi.model.Endereco;
import dev.grebechi.model.Funcionario;
import dev.grebechi.model.Pessoa;
import dev.grebechi.model.Professor;
import java.util.Arrays;
import java.util.Comparator;

public class MockMain {
    public static void main(String[] args) {
        // Criando endereços
        Endereco e1 = new Endereco("Rua A", "Bairro 1", "Osório", "RS");
        Endereco e2 = new Endereco("Rua B", "Bairro 2", "Porto Alegre", "RS");
        Endereco e3 = new Endereco("Rua C", "Bairro 3", "Osório", "RS");
        Endereco e4 = new Endereco("Rua D", "Bairro 4", "Canoas", "RS");
        Endereco e5 = new Endereco("Rua E", "Bairro 5", "Osório", "RS");

        // Criando funcionários e professores
        Funcionario[] funcionarios = new Funcionario[5];

        funcionarios[0] = new Funcionario("Carlos", "Silva", e1, 1001, 3200.00);
        funcionarios[1] = new Professor("GABRIEL", "rEbEcHi", e2, 1002, 5000.00);
        funcionarios[2] = new Funcionario("Bruno", "Oliveira", e3, 1003, 2800.00);
        funcionarios[3] = new Professor("Antônio", "Ferreira", e4, 1004, 4500.00);
        funcionarios[4] = new Funcionario("Eduardo", "Matos", e5, 1005, 3500.00);

        // -------------------------------
        System.out.println("=== Funcionários ordenados por nome ===");
        Arrays.sort(funcionarios, Comparator.comparing(Pessoa::getNomeCompleto));
        for (Funcionario f : funcionarios) {
            System.out.println(f.getNomeCompleto());
        }

        // -------------------------------
        System.out.println("\n=== Funcionários ordenados pelo salário ===");
        Arrays.sort(funcionarios, Comparator.comparingDouble(Funcionario::getSalario));
        for (Funcionario f : funcionarios) {
            System.out.printf("%s - Salário: %.2f%n", f.getNomeCompleto(), f.getSalario());
        }

        // -------------------------------
        System.out.println("\n=== Funcionários que moram na cidade de Osório ===");
        for (Funcionario f : funcionarios) {
            if (f.getEndereco().getCidade().equalsIgnoreCase("Osório")) {
                System.out.printf("%s - Cidade: %s%n", f.getNomeCompleto(), f.getEndereco().getCidade());
            }
        }
    }
}
