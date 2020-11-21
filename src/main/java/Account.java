import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Account {
    private String userName;
    private String name;
    private HashMap<String, Repo> repos;
    private AccountType accountType;

    public Account(String userName, String name, AccountType accountType) {
        this.userName = userName;
        this.name = name;
        this.repos = new HashMap<>();
        this.accountType = accountType;
    }

    public String getAccountType() {
        return this.accountType.getAccountType();
    }

    public String getUserName() {
        return this.userName;
    }

    public String getName() {
        return this.name;
    }

    public int repoCount() {
        return this.repos.size();
    }

    public HashMap<String,Repo> getRepos() {
        return this.repos;
    }

    public void addRepo(Repo repo1) {
        this.repos.put(repo1.getName(), repo1);
    }
    public void upgradeToPro(Account account) {
        account.accountType = AccountType.PRO;
    }

    public void downgradeToFree(Account account) {
        account.accountType = AccountType.FREE;
    }

    public Repo getRepoByName(String name) {
        return this.repos.get(name);
    }
}
