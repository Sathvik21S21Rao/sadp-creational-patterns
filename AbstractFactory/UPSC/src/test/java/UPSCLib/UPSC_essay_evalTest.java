package UPSCLib;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UPSC_essay_evalTest {
    @Test
    void testUPSC_EssayEval() {
        UPSC_essay_eval eval = new UPSC_essay_eval();
        assertNotNull(eval);
        assertEquals("UPSC Essay Evaluation Result: Essay Response", eval.evaluate("Essay Response"));
    }
}
