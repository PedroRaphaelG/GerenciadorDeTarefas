import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        while (true) {
            System.out.println("\n Gerenciador de tarefas: ");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Listar Tarefas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                int opcao = Integer.parseInt(scanner.nextLine());
                switch (opcao) {
                    case 1:
                        System.out.print("Descrição da tarefa: ");
                        String descricao = scanner.nextLine();
                        gerenciador.adicionarTarefa(descricao);
                        break;
                    case 2:
                        System.out.print("Índice da tarefa a remover: ");
                        int indiceRemover = Integer.parseInt(scanner.nextLine());
                        gerenciador.removerTarefa(indiceRemover);
                        break;
                    case 3:
                        System.out.print("Índice da tarefa a concluir: ");
                        int indiceConcluir = Integer.parseInt(scanner.nextLine());
                        gerenciador.marcarComoConcluida(indiceConcluir);
                        break;
                    case 4:
                        gerenciador.listarTarefas();
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Digite um número.");
            }
        }
    }
}