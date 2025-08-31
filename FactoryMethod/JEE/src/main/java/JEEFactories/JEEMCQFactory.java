package JEEFactories;
import JEELib.JEE_mcq_eval;
import commonFactories.MCQFactory;
import commonLib.MCQ_eval;


public class JEEMCQFactory extends MCQFactory {
    @Override
    public MCQ_eval createMCQ() {
        return new JEE_mcq_eval();
    }
}
