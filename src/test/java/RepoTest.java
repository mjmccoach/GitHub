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
}
