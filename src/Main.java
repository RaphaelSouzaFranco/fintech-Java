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

        String formaPagamento;
        while (true) {
            System.out.println("Digite a forma de pagamento (DEBITO, CREDITO, PIX): ");
            formaPagamento = scanner.nextLine().toUpperCase();
            if (formaPagamento.equals("DEBITO") || formaPagamento.equals("CREDITO") || formaPagamento.equals("PIX")) {
                break;
            } else {
                System.out.println("Forma de pagamento inválida. Tente novamente.");
            }
        }

        System.out.println("A despesa foi paga? (true/false): ");
        boolean pago = scanner.nextBoolean();
        scanner.nextLine();

        // objetos despesas
        DespesasFintech despesa = new DespesasFintech("14-03-2025", descricaoDespesa, valorDespesa, categoria, formaPagamento, pago);

        // exibir informações da despesa
        despesa.exibirGastos();

        // marcar despesa como paga
        despesa.pagarDespesa();

        System.out.println("------------------");

        System.out.println("Bem-vindo ao sistema de gerenciamento de metas!");

        System.out.print("Digite o nome da sua meta (ex: 'Comprar um carro'): ");
        String nomeMeta = scanner.nextLine();

        System.out.print("Digite o valor necessário para a meta: R$");
        double valor = scanner.nextDouble();

        System.out.print("Digite o prazo para atingir essa meta (em meses): ");
        int prazo = scanner.nextInt();
        scanner.nextLine();

        MetaCliente minhaMeta = new MetaCliente(nomeMeta, valor, prazo);

        System.out.println("\nMeta cadastrada com sucesso!");
        minhaMeta.exibirMeta();

        System.out.println("------------------");

        System.out.println("Escolha o tipo de investimento:");
        System.out.println("1 - Renda Fixa");
        System.out.println("2 - Renda Variável");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        String tipoInvestimento = (opcao == 1) ? "Renda Fixa" : "Renda Variável";

        System.out.print("Descrição do investimento: ");
        String descricao = scanner.nextLine();

        System.out.print("Valor investido (R$): ");
        double valorInvestido = scanner.nextDouble();

        System.out.print("Rendimento anual (%): ");
        double rendimento = scanner.nextDouble();

        scanner.nextLine(); // Consumir quebra de linha pendente
        System.out.print("Data de vencimento (ex: 12/2026 ou Indeterminado): ");
        String vencimento = scanner.nextLine();

        // Criando o objeto Investimento com os dados inseridos pelo usuário
        LocalDateTime dataAtual = LocalDateTime.now();
        Investimento investimento = new Investimento(tipoInvestimento, descricao, dataAtual, valorInvestido, vencimento, rendimento);

        // Exibir informações do investimento criado
        investimento.exibirInformacao();


        System.out.println("\n------------------");
        PgAjuda pgAjuda = new PgAjuda();

        pgAjuda.setEsqueciSenha("Acesse as configurações da sua conta e clique em 'Recuperar Senha'. Siga as instruções enviadas para seu e-mail.");
        pgAjuda.setAttCartao("Vá até 'Meus Pagamentos', selecione o cartão cadastrado e clique em 'Atualizar informações'.");
        pgAjuda.setConfigurarInvestimento("Entre na aba 'Investimentos', clique em 'Minhas Metas' e defina um novo objetivo.");
        pgAjuda.setProblemaPagamentos("Verifique se seu método de pagamento está atualizado ou entre em contato com o suporte.");
        pgAjuda.setSuporte("Envie seu problema, seu nome, número de CPF ao email: suporte@gmail.com e descreva o problema. O tempo de resposta é de aproximadamente 3 dias úteis.");

        System.out.println("Esqueci a senha: " + pgAjuda.getEsqueciSenha());
        System.out.println("Atualizar cartão: " + pgAjuda.getAttCartao());
        System.out.println("Configurar investimentos: " + pgAjuda.getConfigurarInvestimento());
        System.out.println("Problemas com pagamentos: " + pgAjuda.getProblemaPagamentos());
        System.out.println("Suporte: " + pgAjuda.getSuporte());

        scanner.close();
    }
}
