package com.example.demo2;

import Users.Users;

import java.util.ArrayList;
import java.util.List;

public class Login {

    public static List<Users> users = new ArrayList<>();

   static  {
       Statistics statistics = new Statistics();
    Users userOne = new Users("Artem","Artemov","1234", Users.bankAccountslist );
    users.add(userOne);
    }
    public static List<Users> getUsers() {
        return users;
    }
}
