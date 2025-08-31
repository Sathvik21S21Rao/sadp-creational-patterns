package UPSCLib;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UPSC_mcq_evalTest {
    @Test
    void testUPSC_MCQEval() {
        UPSC_mcq_eval eval = new UPSC_mcq_eval();
        assertNotNull(eval);
        assertEquals("UPSC MCQ Evaluation Result: MCQ Response", eval.evaluate("MCQ Response"));
    }
}
