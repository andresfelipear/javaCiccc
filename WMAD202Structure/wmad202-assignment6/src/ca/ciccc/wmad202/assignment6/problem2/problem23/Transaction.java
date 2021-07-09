package ca.ciccc.wmad202.assignment6.problem2.problem23;

public class Transaction {
    private String id;
    private Double amount;
    public Transaction(String id, Double amount){
        this.id = id;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
