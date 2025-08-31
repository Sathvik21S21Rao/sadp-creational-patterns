package GATEFactories;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import GATELib.GATE_match_the_following_eval;
class GATEMatchTheFollowingFactoryTest {
    @Test
    void testCreateMatchTheFollowing() {
        GATEMatchTheFollowingFactory factory = new GATEMatchTheFollowingFactory();
        assertNotNull(factory.createMatchTheFollowing());
        GATE_match_the_following_eval eval = (GATE_match_the_following_eval) factory.createMatchTheFollowing();
        assertEquals("GATE Match The Following Evaluation Result: Match The Following Response", eval.evaluate("Match The Following Response"));
    }
}
