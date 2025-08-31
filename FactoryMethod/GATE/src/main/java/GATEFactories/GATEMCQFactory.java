package GATEFactories;
import GATELib.GATE_mcq_eval;
import commonFactories.MCQFactory;
import commonLib.MCQ_eval;

public class GATEMCQFactory extends MCQFactory {
    @Override
    public MCQ_eval createMCQ() {
        return new GATE_mcq_eval();
    }
}
