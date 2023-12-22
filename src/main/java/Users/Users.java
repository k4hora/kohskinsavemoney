package Users;

import Bank.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class Users {
    String name;
    String surname;
    String password;
    String doxod;
    String rasxod;
    public static List<BankAccount> bankAccountslist = new ArrayList<>();

    public Users() {

    }
    public Users(String name, String surname, String password, List<BankAccount> bankAccountslist) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        Users.bankAccountslist = bankAccountslist;

    }

    public Users(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;

    }
}
