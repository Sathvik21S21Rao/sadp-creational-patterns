package GATELib;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import GATELib.GATE_mcq_eval;
import commonLib.MCQ_eval;

class GATE_mcq_evalTest {
    @Test
    void testGATEMCQEval() {
        GATE_mcq_eval mcqEval = new GATE_mcq_eval();
        assertTrue(mcqEval instanceof MCQ_eval);
        assertNotNull(mcqEval);
        assertEquals("GATE MCQ Evaluation Result: MCQ Response", mcqEval.evaluate("MCQ Response"));
    }
}
