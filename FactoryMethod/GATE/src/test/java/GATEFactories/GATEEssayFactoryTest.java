package GATEFactories;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import GATELib.GATE_essay_eval;
import commonFactories.EssayFactory;

class GATEEssayFactoryTest {
    @Test
    void testCreateEssay() {
        GATEEssayFactory factory = new GATEEssayFactory();
        assertTrue(factory instanceof EssayFactory);
        assertNotNull(factory.createEssay());
        GATE_essay_eval eval = (GATE_essay_eval) factory.createEssay();
        assertEquals("GATE Essay Evaluation Result: Essay Response", eval.evaluate("Essay Response"));
    }
}
