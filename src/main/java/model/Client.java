// src/main/java/model/Client.java
package model;

public class Client {
    private String name;
    private String cpf;
    private String address;

    public Client(String name, String cpf, String address) {
        if (!isValidCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido: " + cpf);
        }
        this.name = name;
        this.cpf = cpf;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getAddress() {
        return address;
    }

    // Método de validação de CPF
    private boolean isValidCPF(String cpf) {

        cpf = cpf.replaceAll("[^0-9]", "");

        if (cpf.length() != 11) {
            return false;
        }

        if (cpf.chars().distinct().count() == 1) {
            return false;
        }

        int sum = 0;
        int weight = 10;
        
        for (int i = 0; i < 9; i++) {
            sum += (cpf.charAt(i) - '0') * weight--;
        }
        int firstDigit = (sum * 10) % 11;
        if (firstDigit == 10 || firstDigit == 11) {
            firstDigit = 0;
        }

        if (firstDigit != (cpf.charAt(9) - '0')) {
            return false;
        }

        sum = 0;
        weight = 11;

        for (int i = 0; i < 10; i++) {
            sum += (cpf.charAt(i) - '0') * weight--;
        }
        int secondDigit = (sum * 10) % 11;
        if (secondDigit == 10 || secondDigit == 11) {
            secondDigit = 0;
        }

        return secondDigit == (cpf.charAt(10) - '0');
    }
}
