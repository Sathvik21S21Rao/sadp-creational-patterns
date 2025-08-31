package JEEFactories;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import commonFactories.FillinFactory;
import commonLib.Fillin_eval;

class JEEFillInFactoryTest {
    @Test
    void testCreateFillIn() {
        JEEFillInFactory factory = new JEEFillInFactory();
        assertTrue(factory instanceof FillinFactory);
        assertNotNull(factory.createFillin());
        Fillin_eval eval = (Fillin_eval) factory.createFillin();
        assertEquals("JEE Fill-in-the-Blank Evaluation Result: Fill-in Response", eval.evaluate("Fill-in Response"));
    }
}
