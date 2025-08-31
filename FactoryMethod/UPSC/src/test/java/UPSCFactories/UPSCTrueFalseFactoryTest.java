package UPSCFactories;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import UPSCFactories.UPSCTrueFalseFactory;
import UPSCLib.UPSC_truefalse_eval;

class UPSCTrueFalseFactoryTest {
    @Test
    void testCreateTrueFalse() {
        UPSCTrueFalseFactory factory = new UPSCTrueFalseFactory();
        UPSC_truefalse_eval eval = factory.createTrueFalse();
        assertNotNull(eval);
        assertEquals("UPSC True/False Evaluation Result: True/False Response", eval.evaluate("True/False Response"));}
}
