package UPSCLib;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UPSC_truefalse_evalTest {
    @Test
    void testUPSC_TrueFalseEval() {
        UPSC_truefalse_eval eval = new UPSC_truefalse_eval();
        assertNotNull(eval);
        assertEquals("UPSC True/False Evaluation Result: True/False Response", eval.evaluate("True/False Response"));
    }
}
