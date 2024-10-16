package dao;

import model.Insurance;

import java.util.ArrayList;
import java.util.List;

public class InsuranceRepository {
    private List<Insurance> insurances = new ArrayList<>();

    public void add(Insurance insurance) {
        insurances.add(insurance);
        System.out.println("Insurance saved: " + insurance.getType());
    }

    public List<Insurance> getAll() {
        return insurances;
    }
}
