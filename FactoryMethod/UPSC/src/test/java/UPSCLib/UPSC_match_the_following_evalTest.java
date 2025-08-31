package UPSCLib;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UPSC_match_the_following_evalTest {
    @Test
    void testInstance() {
        UPSC_match_the_following_eval eval = new UPSC_match_the_following_eval();
        assertNotNull(eval);
        assertEquals("UPSC Match The Following Evaluation Result: Match The Following Response", eval.evaluate("Match The Following Response"));
    }
}
