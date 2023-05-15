
package Models;

public class sendMoneyModel {
    private String sender;
    private String reciver;
    private String amount;
    private String message;
    private String date;

    public String getSender() {
        return sender;
    }

    public String getReciver() {
        return reciver;
    }

    public String getAmount() {
        return amount;
    }

    public String getMessage() {
        return message;
    }

    public String getDate() {
        return date;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReciver(String reciver) {
        this.reciver = reciver;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
