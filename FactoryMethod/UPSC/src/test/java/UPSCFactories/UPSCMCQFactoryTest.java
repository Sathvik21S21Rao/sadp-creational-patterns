package UPSCFactories;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import UPSCFactories.UPSCMCQFactory;
import UPSCLib.UPSC_mcq_eval;

class UPSCMCQFactoryTest {
    @Test
    void testCreateMCQ() {
        UPSCMCQFactory factory = new UPSCMCQFactory();
        UPSC_mcq_eval eval = factory.createMCQ();
        assertNotNull(eval);
        assertEquals("UPSC MCQ Evaluation Result: MCQ Response", eval.evaluate("MCQ Response"));
    }
}
