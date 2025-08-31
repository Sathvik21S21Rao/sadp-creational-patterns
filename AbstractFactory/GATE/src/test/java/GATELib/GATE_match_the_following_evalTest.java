package GATELib;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import commonLib.Match_the_following_eval;

class GATE_match_the_following_evalTest {
    @Test
    void testInstance() {
        GATE_match_the_following_eval eval = new GATE_match_the_following_eval();
        assertNotNull(eval);
        assertTrue(eval instanceof Match_the_following_eval);
        assertEquals("GATE Match The Following Evaluation Result: Match The Following Response", eval.evaluate("Match The Following Response"));
    }
}
