import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepoTest {
    Repo repo1;

    @Before
    public void before(){
        repo1 = new Repo("My Cool Repo", "The Coolest of Repos");
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
}
