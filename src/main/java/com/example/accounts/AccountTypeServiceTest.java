package com.example.accounts;

public class AccountTypeServiceTest {

    public String getAccountType(int balance) {
        if (balance > 10000) {
            return "PREMIUM";
        } else if (balance > 0) {
            return "STANDARD";
        } else {
            return "INACTIVE";
        }
    }
}
