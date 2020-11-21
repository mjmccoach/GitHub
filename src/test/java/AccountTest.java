import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    Account account1;
    Repo repo1;

    @Before
    public void before() {
        account1 = new Account("HSolo", "Han Solo", AccountType.FREE);
        repo1 = new Repo("Stealing from Jabba","Robbing from a space slug", RepoType.PUBLIC);

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
    public void canAddRepos() {
        account1.addRepo(repo1);
        assertEquals(1, account1.repoCount());
    }

    @Test
    public void canGetRepos() {
        account1.addRepo(repo1);
        assertEquals("Stealing from Jabba" + repo1, account1.getRepos());
    }

    @Test
    public void canUpgradeToPro() {
        account1.upgradeToPro(account1);
        assertEquals("Pro", account1.getAccountType());
    }

    @Test
    public void canDowngradeToFree() {
        account1.upgradeToPro(account1);
        account1.downgradeToFree((account1));
        assertEquals("Free", account1.getAccountType());
    }

    @Test
    public void canGetRepoByName() {
        account1.addRepo(repo1);
        assertEquals(repo1, account1.getRepoByName("Stealing from Jabba"));

    }
}


