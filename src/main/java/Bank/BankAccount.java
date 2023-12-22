package Bank;

import Users.Users;

import java.util.List;

public class BankAccount {
    private String numberAccount;
    private String Balance;


    public BankAccount(){

    }
    public BankAccount(String balance , String numberAccount) {
        this.Balance = balance;
        this.numberAccount = numberAccount;
    }


    public String getNumberAccount() {
        return numberAccount;
    }

    public String getBalance() {
        return Balance;
    }
}

