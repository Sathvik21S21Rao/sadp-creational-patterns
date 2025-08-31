package JEELib;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import JEELib.JEE_fillin_eval;
import commonLib.Fillin_eval;

class JEE_fillin_evalTest {
    @Test
    void testJEEFillinEval() {
        JEE_fillin_eval fillinEval = new JEE_fillin_eval();
        assertTrue(fillinEval instanceof Fillin_eval);
        assertNotNull(fillinEval);
        assertEquals("JEE Fill-in-the-Blank Evaluation Result: Fill-in Response", fillinEval.evaluate("Fill-in Response"));
    }
}
