package JEELib;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JEE_match_the_following_evalTest {
    @Test
    void testInstance() {
        JEE_match_the_following_eval eval = new JEE_match_the_following_eval();
        assertNotNull(eval);
        assertTrue(eval instanceof JEE_match_the_following_eval);
        assertEquals("JEE Match The Following Evaluation Result: Match The Following Response", eval.evaluate("Match The Following Response"));
    }
}
