
package Models;


public class currentAccModel {
  private String owner;
  private String accountNumber;
  private double balance;
  private String takeLoan;
  private double sendMoney;

    public String getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getTakeLoan() {
        return takeLoan;
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

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTakeLoan(String takeLoan) {
        this.takeLoan = takeLoan;
    }

    public void setSendMoney(double sendMoney) {
        this.sendMoney = sendMoney;
    }
  
  
}
