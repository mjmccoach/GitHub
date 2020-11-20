import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {
   Commit commit1;

   @Before
   public void before() {
      commit1 = new Commit("Initial Commit", 1);
   }

   @Test
   public void canGetDescription() {
      assertEquals("Initial Commit", commit1.getDescription());
   }

   @Test
   public void canGetUniqueId() {
      assertEquals(1, commit1.getUniqueId());
   }

   @Test
   public void canSetDescription() {
      commit1.setDescription("Second Commit");
      assertEquals("Second Commit", commit1.getDescription());
   }


}
