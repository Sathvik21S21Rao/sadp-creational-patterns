package GATELib;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import GATELib.GATE_essay_eval;
import commonLib.Essay_eval;

class GATE_essay_evalTest {
    @Test
    void testGATEEssayEval() {
        GATE_essay_eval essayEval = new GATE_essay_eval();
        assertTrue(essayEval instanceof Essay_eval);
        assertNotNull(essayEval);
        assertEquals("GATE Essay Evaluation Result: Essay Response", essayEval.evaluate("Essay Response"));
    }
}
