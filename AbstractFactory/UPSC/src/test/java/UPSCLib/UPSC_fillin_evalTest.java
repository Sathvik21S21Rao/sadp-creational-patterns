package UPSCLib;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UPSC_fillin_evalTest {
    @Test
    void testUPSC_FillinEval() {
        UPSC_fillin_eval eval = new UPSC_fillin_eval();
        assertNotNull(eval);
        assertEquals("UPSC Fill-in-the-Blank Evaluation Result: Fill-in Response", eval.evaluate("Fill-in Response"));
    }
}
