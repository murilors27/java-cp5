// src/main/java/Main.java
import model.Client;
import model.Insurance;
import service.ClientManager;
import service.InsuranceManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClientManager clientManager = ClientManager.getInstance();
        InsuranceManager insuranceManager = InsuranceManager.getInstance();

        // Menu para interações
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Cadastrar Seguro");
            System.out.println("4. Listar Seguros");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (option) {
                case 1:
                    // Cadastrar Cliente
                    try {
                        System.out.print("Nome: ");
                        String name = scanner.nextLine();
                        System.out.print("CPF: ");
                        String cpf = scanner.nextLine();
                        System.out.print("Endereço: ");
                        String address = scanner.nextLine();

                        Client client = new Client(name, cpf, address);
                        clientManager.addClient(client);
                        System.out.println("Cliente cadastrado com sucesso!");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    // Listar Clientes
                    System.out.println("Clientes cadastrados:");
                    clientManager.getAllClients().forEach(c -> System.out.println(c.getName()));
                    break;

                case 3:
                    // Cadastrar Seguro
                    System.out.print("Tipo de Seguro: ");
                    String type = scanner.nextLine();
                    System.out.print("Valor: ");
                    double value = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a nova linha

                    Insurance insurance = new Insurance(type, value);
                    insuranceManager.addInsurance(insurance);
                    System.out.println("Seguro cadastrado com sucesso!");
                    break;

                case 4:
                    // Listar Seguros
                    System.out.println("Seguros cadastrados:");
                    insuranceManager.getAllInsurances().forEach(s -> System.out.println(s.getType()));
                    break;

                case 5:
                    // Sair
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
