class BankAccount{
    private String accNumber;
    private double balance;
    private String accHolder;


    BankAccount(String n, double b, String h){
        accNumber = n;
        balance = b;
        accHolder = h;
    }


    public void setAccHolder(String accHolder){
        this.accHolder = accHolder;
    }

    public void setBalance(double amount){
        
        if(balance > 0){
            balance = amount;
        }
        else{
            System.out.println("Invalid Amount");
        }
    }

    public String getAccNumber(){
        return accNumber;
    }

    public double getBalance(){
       return balance;
    }

    // public void setAccHolder(String accHolder){
    //     this.accHolder = accHolder;
    // }

    public String getAccHolder(){
        return accHolder;
    }
}

public class BankMain{
    public static void main(String[] args){

        //BankAccount b1 = new BankAccount();
        // b1.setAccHolder("Arman");
        // b1.setAccNumber("123");
        // b1.setBalance(120000);

        BankAccount b1 = new BankAccount("123", 1200000, "Arman");
        System.out.println(b1.getAccHolder());
        System.out.println(b1.getAccNumber());
        System.out.println(b1.getBalance());

    }
}