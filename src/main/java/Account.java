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

    public void addRepo(Repo repo1) {
        this.repos.put(repo1.getName(), repo1);
    }
}
