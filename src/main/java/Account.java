import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Account {
    private String userName;
    private String name;
    private HashMap<String, Repo> repos;
    private AccountType accountType;
    private Commit commit;

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

    public String setUserName(String string) {
        return this.userName = string;

    }

    public String getName() {
        return this.name;
    }

    public int repoCount() {
        return this.repos.size();
    }

    public HashMap<String, Repo> getRepos() {
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
//
//    public Repo getRepoWithMostCommits(HashMap<String, Repo> repos) {
//        Repo mostCommitsRepo = new Repo("Most Commits", "Repo", RepoType.PUBLIC);
////        HashMap<String, Repo> = repos.entrySet();
////        for(repo : repos.keySet()) {
////            if (repo.getCommits() > mostCommitsRepo.getCommits()) {
////                mostCommitsRepo = repo;
////            }
////        }
//        repos.forEach((String, Repo)) {
//            if(repo.getCommits())
//        };
//        return mostCommitsRepo;
//    }


//                if(Map.Entry<String, Repo>entry.getCommits() > mostCommitsRepo.getCommits());
//                { mostCommitsRepo = Map.Entry<String, Repo>};
//                return mostCommitsRepo;


}


