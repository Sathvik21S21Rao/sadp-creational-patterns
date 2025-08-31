package UPSCFactories;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import UPSCFactories.UPSCEssayFactory;
import UPSCLib.UPSC_essay_eval;

class UPSCEssayFactoryTest {
    @Test
    void testCreateEssay() {
        UPSCEssayFactory factory = new UPSCEssayFactory();
        UPSC_essay_eval eval = factory.createEssay();
        assertNotNull(eval);
        assertEquals("UPSC Essay Evaluation Result: Essay Response", eval.evaluate("Essay Response"));
    }
}
