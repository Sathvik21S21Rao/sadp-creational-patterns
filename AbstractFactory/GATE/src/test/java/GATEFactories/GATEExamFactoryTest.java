package GATEFactories;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import GATELib.*;
import commonLib.*;

public class GATEExamFactoryTest {

    @Test
    public void testCreateMCQEvaluator() {
        GATEExamFactory factory = new GATEExamFactory();
        MCQ_eval evaluator = factory.createMCQ();
        assertNotNull(evaluator);
        assertEquals("GATE MCQ Evaluation Result: MCQ Response", evaluator.evaluate("MCQ Response"));

    }

    @Test
    public void testCreateTrueFalseEvaluator() {
        GATEExamFactory factory = new GATEExamFactory();
        TrueFalse_eval evaluator = factory.createTrueFalse();
        assertNotNull(evaluator);
        assertEquals("GATE True/False Evaluation Result: True/False Response", evaluator.evaluate("True/False Response"));
    }

    @Test
    public void testCreateFillinEvaluator() {
        GATEExamFactory factory = new GATEExamFactory();
        Fillin_eval evaluator = factory.createFillIn();
        assertNotNull(evaluator);
        assertEquals("GATE Fill-in Evaluation Result: Fill-in Response", evaluator.evaluate("Fill-in Response"));
    }

    @Test
    public void testCreateEssayEvaluator() {
        GATEExamFactory factory = new GATEExamFactory();
        Essay_eval evaluator = factory.createEssay();
        assertNotNull(evaluator);
        assertEquals("GATE Essay Evaluation Result: Essay Response", evaluator.evaluate("Essay Response"));
    }

    @Test
    public void testCreateMatchTheFollowingEvaluator() {
        GATEExamFactory factory = new GATEExamFactory();
        Match_the_following_eval evaluator = factory.createMatchTheFollowing();
        assertNotNull(evaluator);
        assertEquals("GATE Match The Following Evaluation Result: Match The Following Response", evaluator.evaluate("Match The Following Response"));
    }
}