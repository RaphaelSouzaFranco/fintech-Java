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


        usuario.exibirDados();
        System.out.print("\nConfirme sua senha: ");
        String senhaConfirmacao = scanner.nextLine();
        if (usuario.validarSenha(senhaConfirmacao)) {
            System.out.println("Senha correta! Acesso autorizado.");
        } else {
            System.out.println("Senha incorreta! Acesso negado.");
        }

        scanner.close();
    }
}
