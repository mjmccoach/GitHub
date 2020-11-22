import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

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

    @Test
    public void canSortAccounts() {
        GitHub gitHub2 = new GitHub();

        gitHub2.addAccountToGitHub(account1);
        gitHub2.addAccountToGitHub(account2);
        gitHub2.addAccountToGitHub(account3);

        gitHub2.sortAccountsByName();

        gitHub.addAccountToGitHub(account1);
        gitHub.addAccountToGitHub(account2);
        gitHub.addAccountToGitHub(account3);
        assertNotSame("These are not the same", gitHub.getAccounts(), gitHub2.getAccounts());
    }
}
