package JEELib;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import JEELib.JEE_truefalse_eval;
import commonLib.TrueFalse_eval;

class JEE_truefalse_evalTest {
    @Test
    void testJEETrueFalseEval() {
        JEE_truefalse_eval tfEval = new JEE_truefalse_eval();
        assertTrue(tfEval instanceof TrueFalse_eval);
        assertNotNull(tfEval);
        assertEquals("JEE True/False Evaluation Result: True/False Response", tfEval.evaluate("True/False Response"));
    }
}
