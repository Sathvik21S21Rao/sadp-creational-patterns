package GATEFactories;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import GATELib.GATE_fillin_eval;
import commonFactories.FillinFactory;

class GATEFillInFactoryTest {
    @Test
    void testCreateFillIn() {
        GATEFillInFactory factory = new GATEFillInFactory();
        assertTrue(factory instanceof FillinFactory);
        assertNotNull(factory.createFillin());
        assertTrue(factory.createFillin() instanceof GATE_fillin_eval);
        GATE_fillin_eval eval = (GATE_fillin_eval) factory.createFillin();
        assertEquals("GATE Fill-in-the-Blank Evaluation Result: Fill-in Response", eval.evaluate("Fill-in Response"));
    }
}
