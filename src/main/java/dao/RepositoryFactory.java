package dao;

public class RepositoryFactory {
    public static ClientRepository createClientRepository() {
        return new ClientRepository();
    }

    public static InsuranceRepository createInsuranceRepository() {
        return new InsuranceRepository();
    }
}

