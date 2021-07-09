package ca.ciccc.wmad202.assignment6.problem2.problem23;

import java.util.ArrayList;

public class BankStatement {
    private ArrayList<Transaction> listTransactions;
    private double totalBalance;
    public BankStatement(){
        this.listTransactions =  new ArrayList<>();
    }
    public void calcTotalBalance(){
        for(int i=0;i<listTransactions.size();i++){
            totalBalance += listTransactions.get(i).getAmount();
        }
    }

    public void addTransaction(Transaction trans){
        listTransactions.add(trans);
    }
    public void printTotalBalance(){
        calcTotalBalance();
        System.out.println("Total balance of the account is: $" + totalBalance);
    }
}
