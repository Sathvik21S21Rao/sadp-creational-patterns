package UPSCFactories;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import UPSCFactories.UPSCFillInFactory;
import UPSCLib.UPSC_fillin_eval;

class UPSCFillInFactoryTest {
    @Test
    void testCreateFillin() {
        UPSCFillInFactory factory = new UPSCFillInFactory();
        UPSC_fillin_eval eval = factory.createFillin();
        assertNotNull(eval);
        assertEquals("UPSC Fill-in-the-Blank Evaluation Result: Fill-in Response", eval.evaluate("Fill-in Response"));
    }
}
