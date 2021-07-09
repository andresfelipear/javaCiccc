package ca.ciccc.wmad202.assignment6.problem2.problem23;

public class TestClass23 {
    public void test(){
        System.out.println();
        System.out.println("Problem 2.3.");
        Transaction t1 = new Transaction("1",100.0);
        Transaction t2 = new Transaction("2",100.0);
        Transaction t3 = new Transaction("3",100.0);
        Transaction t4 = new Transaction("4",100.0);
        Transaction t5 = new Transaction("5",-400.0);
        BankStatement bank = new BankStatement();
        bank.addTransaction(t1);
        bank.addTransaction(t2);
        bank.addTransaction(t3);
        bank.addTransaction(t4);
        bank.addTransaction(t5);
        bank.printTotalBalance();

    }
}
