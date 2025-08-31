package JEEFactories;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import commonFactories.ExamFactory;

public class JEEExamFactoryTest {
    @Test
    public void testCreateMCQ() {
        ExamFactory factory = new JEEExamFactory();
        assertNotNull(factory.createMCQ());
        assertEquals("JEE MCQ Evaluation Result: MCQ Response", factory.createMCQ().evaluate("MCQ Response"));
    }
    @Test
    public void testCreateFillIn() {
        ExamFactory factory = new JEEExamFactory();
        assertNotNull(factory.createFillIn());
        assertEquals("JEE Fill-in Evaluation Result: Fill-in Response", factory.createFillIn().evaluate("Fill-in Response"));
    }
    @Test
    public void testCreateTrueFalse() {
        ExamFactory factory = new JEEExamFactory();
        assertNotNull(factory.createTrueFalse());
        assertEquals("JEE True/False Evaluation Result: True/False Response", factory.createTrueFalse().evaluate("True/False Response"));
    }
    @Test
    public void testCreateEssay() {
        ExamFactory factory = new JEEExamFactory();
        assertNotNull(factory.createEssay());
        assertEquals("JEE Essay Evaluation Result: Essay Response", factory.createEssay().evaluate("Essay Response"));
    }

    @Test
    public void testCreateMatchTheFollowing() {
        ExamFactory factory = new JEEExamFactory();
        assertNotNull(factory.createMatchTheFollowing());
        assertEquals("JEE Match The Following Evaluation Result: Match The Following Response", factory.createMatchTheFollowing().evaluate("Match The Following Response"));
    }

}
