package JEELib;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import JEELib.JEE_essay_eval;
import commonLib.Essay_eval;

class JEE_essay_evalTest {
    @Test
    void testJEEEessayEval() {
        JEE_essay_eval essayEval = new JEE_essay_eval();
        assertTrue(essayEval instanceof Essay_eval);
        assertNotNull(essayEval);
        assertEquals("JEE Essay Evaluation Result: Essay Response", essayEval.evaluate("Essay Response"));
    }
}
