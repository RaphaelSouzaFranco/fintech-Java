import com.fiap.projetofintech.model.*;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        do {
            System.out.print("Digite seu nome: ");
            nome = scanner.nextLine();
            if (!Usuario.validarNome(nome)) {
                System.out.println("Nome inválido! Deve ter pelo menos 3 caracteres.");
            }
        } while (!Usuario.validarNome(nome));

        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        Usuario usuario = new Usuario(nome, email, senha);

        System.out.println("\nUsuário cadastrado com sucesso!\n");

        System.out.println("------------------");

        System.out.println("Bem-vindo ao sistema de gerenciamento de despesas!");

        // Solicitar informações da despesa
        System.out.println("Digite a descrição da despesa: ");
        String descricaoDespesa = scanner.nextLine();

        System.out.println("Informe o valor da despesa: ");
        double valorDespesa = scanner.nextDouble();
        scanner.nextLine();

        String categoria;
        while (true) {
            System.out.println("Digite a categoria da despesa (ALIMENTACAO, TRANSPORTE, LAZER, EDUCACAO, INVESTIMENTO, etc.): ");
            categoria = scanner.nextLine().toUpperCase();
            if (categoria.equals("ALIMENTACAO") || categoria.equals("TRANSPORTE") || categoria.equals("LAZER") || categoria.equals("EDUCACAO") || categoria.equals("INVESTIMENTO")) {
                break;
            } else {
                System.out.println("Categoria inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
