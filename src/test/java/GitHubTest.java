import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubTest {
    GitHub gitHub;
    Account account1;
    Account account2;
    Account account3;

    @Before
    public void before() {
        gitHub = new GitHub();
        account1 = new Account("LCombs", "Luke Combs", AccountType.PRO);
        account2 = new Account("MilleniumFalcon4Lyfe", "Han Solo", AccountType.FREE);
        account3 = new Account("HairyAndScary", "Chewbacca", AccountType.FREE);

    }

    @Test
    public void canAddAccount() {
        gitHub.addAccountToGitHub(account1);
        assertEquals(1, gitHub.getAccounts());
    }
}
