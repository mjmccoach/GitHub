import java.util.ArrayList;

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
}
