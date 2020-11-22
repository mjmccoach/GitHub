import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepoTest {
    Repo repo1;
    Repo repo2;
    Repo repo3;
    Commit commit1;
    Account account1;

    @Before
    public void before(){
        account1 = new Account("RepomanSucks", "Repo Man", AccountType.FREE);
        repo1 = new Repo("My Cool Repo", "The Coolest of Repos", RepoType.PUBLIC);
        repo2 = new Repo("Repoman","Falls through walls", RepoType.PUBLIC);
        repo3 = new Repo("Repoman Returns", "Still a terrible wrestler", RepoType.PUBLIC);
        commit1 = new Commit("Initial Commit", 1);

    }

    @Test
    public void canGetName() {
        assertEquals("My Cool Repo", repo1.getName());
    }

    @Test
    public void canGetDescription() {
        assertEquals("The Coolest of Repos", repo1.getDescription());
    }

    @Test
    public void canSetName() {
        repo1.setName("Harrison stole my repo");
        assertEquals("Harrison stole my repo", repo1.getName());
    }

    @Test
    public void canSetDescription() {
        repo1.setDescription("Gotcha repo, nerd");
        assertEquals("Gotcha repo, nerd", repo1.getDescription());
    }

    @Test
    public void canAddCommit() {
        repo1.addCommit(commit1);
        assertEquals(1, repo1.getCommits());
    }

    @Test
    public void canGetRepoType() {
        assertEquals("Public", repo1.getRepoType());
    }

    @Test
    public void canMakeRepoPrivate() {
        repo1.setToPrivate(repo1);
        assertEquals("Private", repo1.getRepoType());
    }

    @Test
    public void canMakeRepoPublic() {
        repo1.setToPrivate(repo1);
        repo1.setToPublic(repo1);
        assertEquals("Public", repo1.getRepoType());
    }

    @Test
    public void mostCommitsRepo() {
        account1.addRepo(repo1);
        account1.addRepo(repo2);
        account1.addRepo(repo3);
        repo1.addCommit(commit1);
        assertEquals(repo1, account1.getRepoWithMostCommits(account1.getRepos()));
    }

    @Test
    public void canRollBackCommits() {
        Commit commit2 = new Commit("Test commit", 2);
        Commit commit3 = new Commit("Another test commit", 3);
        repo1.addCommit(commit1);
        repo1.addCommit(commit2);
        repo1.addCommit(commit3);
        repo1.revertCommit();
        assertEquals(2, repo1.getCommits());
    }
}
