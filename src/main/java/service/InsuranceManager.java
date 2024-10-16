package service;

import dao.InsuranceRepository;
import model.Insurance;

import java.util.List;

public class InsuranceManager {
    private static InsuranceManager instance;
    private InsuranceRepository insuranceRepository;

    private InsuranceManager() {
        this.insuranceRepository = new InsuranceRepository();
    }

    public static InsuranceManager getInstance() {
        if (instance == null) {
            instance = new InsuranceManager();
        }
        return instance;
    }

    public void addInsurance(Insurance insurance) {
        insuranceRepository.add(insurance);
    }

    public List<Insurance> getAllInsurances() {
        return insuranceRepository.getAll();
    }
}
