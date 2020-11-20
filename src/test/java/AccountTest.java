import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    Account account1;

    @Before
    public void before() {
        account1 = new Account("HSolo", "Han Solo", AccountType.FREE);

    }

    @Test
    public void canGetAccountType() {
        assertEquals("Free", account1.getAccountType());
    }

    @Test
    public void canGetUserName() {
        assertEquals("HSolo", account1.getUserName());
    }

    @Test
    public void canGetName() {
        assertEquals("Han Solo", account1.getName());
    }

    @Test
    public void canCountRepos() {
        assertEquals(0, account1.repoCount());
    }

    @Test
    public void canAddRepos
}


