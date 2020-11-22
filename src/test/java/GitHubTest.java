import org.junit.Before;

public class GitHubTest {
    Account account1;
    Account account2;
    Account account3;

    @Before
    public void before() {
        account1 = new Account("LCombs", "Luke Combs", AccountType.PRO);
        account2 = new Account("MilleniumFalcon4Lyfe", "Han Solo", AccountType.FREE);
        account3 = new Account("HairyAndScary", "Chewbacca", AccountType.FREE);
    }
}
