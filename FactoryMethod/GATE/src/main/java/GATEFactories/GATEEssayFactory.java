package GATEFactories;
import GATELib.GATE_essay_eval;
import commonFactories.EssayFactory;
import commonLib.Essay_eval;

public class GATEEssayFactory extends EssayFactory {
    @Override
    public Essay_eval createEssay() {
        return new GATE_essay_eval();
    }
}
