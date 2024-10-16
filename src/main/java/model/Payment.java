package model;

import java.util.Date;

public class Payment {
    private double amount;
    private Date paymentDate;

    public Payment(double amount, Date paymentDate) {
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }
}
