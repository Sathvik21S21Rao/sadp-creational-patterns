package JEEFactories;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import commonFactories.EssayFactory;
import commonLib.Essay_eval;

class JEEEssayFactoryTest {
    @Test
    void testCreateEssay() {
        JEEEssayFactory factory = new JEEEssayFactory();
        assertNotNull(factory.createEssay());
        assertTrue(factory instanceof EssayFactory);
        Essay_eval eval = (Essay_eval) factory.createEssay();
        assertEquals("JEE Essay Evaluation Result: Essay Response", eval.evaluate("Essay Response"));
    }
}
