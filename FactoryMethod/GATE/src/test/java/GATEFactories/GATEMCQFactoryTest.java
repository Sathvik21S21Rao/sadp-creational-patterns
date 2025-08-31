package GATEFactories;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import GATELib.GATE_mcq_eval;
import commonFactories.MCQFactory;
class GATEMCQFactoryTest {
    @Test
    void testCreateMCQ() {
        GATEMCQFactory factory = new GATEMCQFactory();
        assertTrue(factory instanceof MCQFactory);
        assertNotNull(factory.createMCQ());
        GATE_mcq_eval eval = (GATE_mcq_eval) factory.createMCQ();
        assertEquals("GATE MCQ Evaluation Result: MCQ Response", eval.evaluate("MCQ Response"));
    }
}
