package JEEFactories;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import commonFactories.TrueFalseFactory;
import commonLib.TrueFalse_eval;

class JEETrueFalseFactoryTest {
    @Test
    void testCreateTrueFalse() {
        JEETrueFalseFactory factory = new JEETrueFalseFactory();
        assertTrue(factory instanceof TrueFalseFactory);
        assertNotNull(factory.createTrueFalse());
        TrueFalse_eval eval = (TrueFalse_eval) factory.createTrueFalse();
        assertEquals("JEE True/False Evaluation Result: True/False Response", eval.evaluate("True/False Response"));
    }
}
