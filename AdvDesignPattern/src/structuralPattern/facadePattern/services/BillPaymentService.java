package structuralPattern.facadePattern.services;

public class BillPaymentService {

    public void payBill(String accountId, String billId, double amount) {
        System.out.println("Paying bill " + billId + " from account " + accountId + " with amount " + amount);
    }
}