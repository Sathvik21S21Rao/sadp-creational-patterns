package JEELib;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import JEELib.JEE_mcq_eval;
import commonLib.MCQ_eval;

class JEE_mcq_evalTest {
    @Test
    void testJEEMCQEval() {
        JEE_mcq_eval mcqEval = new JEE_mcq_eval();
        assertTrue(mcqEval instanceof MCQ_eval);
        assertNotNull(mcqEval);
        assertEquals("JEE MCQ Evaluation Result: MCQ Response", mcqEval.evaluate("MCQ Response"));
    }
}
