package JEEFactories;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import commonFactories.MCQFactory;
import commonLib.MCQ_eval;

class JEEMCQFactoryTest {
    @Test
    void testCreateMCQ() {
        JEEMCQFactory factory = new JEEMCQFactory();
        assertTrue(factory instanceof MCQFactory);
        assertNotNull(factory.createMCQ());
        MCQ_eval eval = (MCQ_eval) factory.createMCQ();
        assertEquals("JEE MCQ Evaluation Result: MCQ Response", eval.evaluate("MCQ Response"));
    }

}