package UPSCFactories;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import commonFactories.ExamFactory;

public class UPSCExamFactoryTest {
    @Test
    public void testCreateMCQ() {
        ExamFactory factory = new UPSCExamFactory();
        assertNotNull(factory.createMCQ());
        assertEquals("UPSC MCQ Evaluation Result: MCQ Response", factory.createMCQ().evaluate("MCQ Response"));
    }
    @Test
    public void testCreateFillIn() {
        ExamFactory factory = new UPSCExamFactory();
        assertNotNull(factory.createFillIn());
        assertEquals("UPSC Fill-in Evaluation Result: Fill-in Response", factory.createFillIn().evaluate("Fill-in Response"));
    }
    @Test
    public void testCreateTrueFalse() {
        ExamFactory factory = new UPSCExamFactory();
        assertNotNull(factory.createTrueFalse());
        assertEquals("UPSC True/False Evaluation Result: True/False Response", factory.createTrueFalse().evaluate("True/False Response"));
    }
    @Test
    public void testCreateEssay() {
        ExamFactory factory = new UPSCExamFactory();
        assertNotNull(factory.createEssay());
        assertEquals("UPSC Essay Evaluation Result: Essay Response", factory.createEssay().evaluate("Essay Response"));
    }
    @Test
    public void testCreateMatchTheFollowing() {
        ExamFactory factory = new UPSCExamFactory();
        assertNotNull(factory.createMatchTheFollowing());
        assertEquals("UPSC Match the Following Evaluation Result: Match the Following Response", factory.createMatchTheFollowing().evaluate("Match the Following Response"));
    }
}
