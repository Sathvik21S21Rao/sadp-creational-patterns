package JEEFactories;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import JEELib.JEE_match_the_following_eval;

class JEEMatchTheFollowingFactoryTest {
    @Test
    void testCreateMatchTheFollowing() {
        JEEMatchTheFollowingFactory factory = new JEEMatchTheFollowingFactory();
        assertNotNull(factory.createMatchTheFollowing());
        JEE_match_the_following_eval eval = (JEE_match_the_following_eval) factory.createMatchTheFollowing();
        assertEquals("JEE Match The Following Evaluation Result: Match The Following Response", eval.evaluate("Match The Following Response"));
    }
}
