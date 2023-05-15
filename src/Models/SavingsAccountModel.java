
package Models;

public class SavingsAccountModel {
  private String owner;
  private String accountNumber;
  private String withdrawLimit;
  private String transactionLimit;
  private double dipositMoney;
  private String interest;
  private double sendMoney;

    public String getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getWithdrawLimit() {
        return withdrawLimit;
    }

    public String getTransactionLimit() {
        return transactionLimit;
    }

    public double getDipositMoney() {
        return dipositMoney;
    }

    public String getInterest() {
        return interest;
    }
     public double getSendMoney() {
        return sendMoney;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setWithdrawLimit(String withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void setTransactionLimit(String transactionLimit) {
        this.transactionLimit = transactionLimit;
    }

    public void setDipositMoney(double dipositMoney) {
        this.dipositMoney = dipositMoney;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public void setSendMoney(double sendMoney) {
        this.sendMoney = sendMoney;
    }

   

  
    
    
    
}
