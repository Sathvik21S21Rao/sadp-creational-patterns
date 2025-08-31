package GATEFactories;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import GATELib.GATE_truefalse_eval;
import commonFactories.TrueFalseFactory;
class GATETrueFalseFactoryTest {
    @Test
    void testCreateTrueFalse() {
        GATETrueFalseFactory factory = new GATETrueFalseFactory();
        assertNotNull(factory.createTrueFalse());
        assertTrue(factory instanceof TrueFalseFactory);
        GATE_truefalse_eval eval = (GATE_truefalse_eval) factory.createTrueFalse();
        assertEquals("GATE True/False Evaluation Result: True/False Response", eval.evaluate("True/False Response"));
    }
}
