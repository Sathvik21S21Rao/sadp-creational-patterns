package UPSCFactories;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import UPSCLib.UPSC_match_the_following_eval;
class UPSCMatchTheFollowingFactoryTest {
    @Test
    void testCreateMatchTheFollowing() {
        UPSCMatchTheFollowingFactory factory = new UPSCMatchTheFollowingFactory();
        assertNotNull(factory.createMatchTheFollowing());
        UPSC_match_the_following_eval eval = (UPSC_match_the_following_eval) factory.createMatchTheFollowing();
        assertEquals("UPSC Match The Following Evaluation Result: Match The Following Response", eval.evaluate("Match The Following Response"));
    }
}
