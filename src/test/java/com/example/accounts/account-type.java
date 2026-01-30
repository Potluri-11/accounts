package com.example.accounts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTypeServiceTest {

    @Test
    void premiumAccount() {
        AccountTypeService service = new AccountTypeService();
        assertEquals("PREMIUM", service.getAccountType(10001));
    }

    @Test
    void standardAccount() {
        AccountTypeService service = new AccountTypeService();
        assertEquals("STANDARD", service.getAccountType(500));
    }
}
