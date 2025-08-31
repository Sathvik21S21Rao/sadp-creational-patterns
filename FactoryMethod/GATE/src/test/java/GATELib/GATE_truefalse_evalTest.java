package GATELib;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import GATELib.GATE_truefalse_eval;
import commonLib.TrueFalse_eval;

class GATE_truefalse_evalTest {
    @Test
    void testGATETrueFalseEval() {
        GATE_truefalse_eval tfEval = new GATE_truefalse_eval();
        assertTrue(tfEval instanceof TrueFalse_eval);
        assertNotNull(tfEval);
        assertEquals("GATE True/False Evaluation Result: True/False Response", tfEval.evaluate("True/False Response"));
    }
}
