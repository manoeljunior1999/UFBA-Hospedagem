package Sistema;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar Proprietário");
            System.out.println("2 - Cadastrar Imóvel");
            System.out.println("3 - Associar Imóvel a Site de Reserva");
            System.out.println("4 - Realizar Reserva");
            System.out.println("5 - Consultar Disponibilidade");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (escolha) {
                case 1:
                    cadastrarProprietario(plataforma, scanner);
                    break;
                case 2:
                    cadastrarImovel(plataforma, scanner);
                    break;
                case 3:
                    associarImovelASite(plataforma, scanner);
                    break;
                case 4:
                    realizarReserva(plataforma, scanner);
                    break;
                case 5:
                    consultarDisponibilidade(plataforma, scanner);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void cadastrarProprietario(Plataforma plataforma, Scanner scanner) {
        // Implementar a lógica de cadastro de proprietário
    }

    private static void cadastrarImovel(Plataforma plataforma, Scanner scanner) {
        // Implementar a lógica de cadastro de imóvel
    }

    private static void associarImovelASite(Plataforma plataforma, Scanner scanner) {
        // Implementar a lógica de associação de imóvel a site
    }

    private static void realizarReserva(Plataforma plataforma, Scanner scanner) {
        // Implementar a lógica de realização de reserva
    }

    private static void consultarDisponibilidade(Plataforma plataforma, Scanner scanner) {
        // Implementar a lógica de consulta de disponibilidade
    }
}