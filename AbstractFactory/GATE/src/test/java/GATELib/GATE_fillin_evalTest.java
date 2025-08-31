package GATELib;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import GATELib.GATE_fillin_eval;
import commonLib.Fillin_eval;

class GATE_fillin_evalTest {
    @Test
    void testGATEFillinEval() {
        GATE_fillin_eval fillinEval = new GATE_fillin_eval();
        assertTrue(fillinEval instanceof Fillin_eval);
        assertNotNull(fillinEval);
        assertEquals("GATE Fill-in-the-Blank Evaluation Result: Fill-in Response", fillinEval.evaluate("Fill-in Response"));
    }
}
