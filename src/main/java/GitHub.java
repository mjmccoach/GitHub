import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GitHub {
    private ArrayList<Account> gitHubAccounts;

    public GitHub() {
        this.gitHubAccounts = new ArrayList<>();
    }

    public void addAccountToGitHub(Account account) {
        this.gitHubAccounts.add(account);
    }

    public int getAccounts() {
        return this.gitHubAccounts.size();
    }

    public void sortAccountsByName() {
        gitHubAccounts.sort(Comparator.comparing(Account:: getUserName));
    }
}
