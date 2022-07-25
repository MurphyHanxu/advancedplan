package hwday6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountManagerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void openAccountTest() {
        Account account = AccountManager.openAccount("张三","123456","123456");
        assertNotNull(account);
        assertNotNull(account.accountId);
        Account account1 = AccountManager.openAccount("李四","1234561","1234561");
        assertNotNull(account1);
    }

    @Test
    void loginAccountTest(){
        Account account = AccountManager.openAccount("张三","123456","123456");
        assertTrue(AccountManager.loginAccount(account.accountId, "123456"));
        assertFalse(AccountManager.loginAccount(account.accountId, "12345"));
        assertFalse(AccountManager.loginAccount(null,"123456"));
    }


    @Test
    void deposit() {
        Account account = AccountManager.openAccount("张三","123456","123456");
        assertNotNull(AccountManager.deposit(-10.0));
        assertNotNull("张三");
        assertNotNull(AccountManager.deposit(10.0));
    }

}