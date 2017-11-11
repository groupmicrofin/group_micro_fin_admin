package com.groupmicrofin.admin.model;

public class Dashboard {

    private int totalCashBalance;// (On hand balance)
    private int totalShareAmount;
    private int totalPendingShareAmount;
    private int totalInterestIncome;
    private int totalLoanDisbursements;
    private int totalRunningLoanBalances;
    private int totalFeeIncome;
    private int totalExpense;

    public int getTotalCashBalance() {
        return totalCashBalance;
    }

    public void setTotalCashBalance(int totalCashBalance) {
        this.totalCashBalance = totalCashBalance;
    }

    public int getTotalShareAmount() {
        return totalShareAmount;
    }

    public void setTotalShareAmount(int totalShareAmount) {
        this.totalShareAmount = totalShareAmount;
    }

    public int getTotalPendingShareAmount() {
        return totalPendingShareAmount;
    }

    public void setTotalPendingShareAmount(int totalPendingShareAmount) {
        this.totalPendingShareAmount = totalPendingShareAmount;
    }

    public int getTotalInterestIncome() {
        return totalInterestIncome;
    }

    public void setTotalInterestIncome(int totalInterestIncome) {
        this.totalInterestIncome = totalInterestIncome;
    }

    public int getTotalLoanDisbursements() {
        return totalLoanDisbursements;
    }

    public void setTotalLoanDisbursements(int totalLoanDisbursements) {
        this.totalLoanDisbursements = totalLoanDisbursements;
    }

    public int getTotalRunningLoanBalances() {
        return totalRunningLoanBalances;
    }

    public void setTotalRunningLoanBalances(int totalRunningLoanBalances) {
        this.totalRunningLoanBalances = totalRunningLoanBalances;
    }

    public int getTotalFeeIncome() {
        return totalFeeIncome;
    }

    public void setTotalFeeIncome(int totalFeeIncome) {
        this.totalFeeIncome = totalFeeIncome;
    }

    public int getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(int totalExpense) {
        this.totalExpense = totalExpense;
    }
}
