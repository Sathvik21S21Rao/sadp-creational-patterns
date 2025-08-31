package GATEFactories;
import GATELib.GATE_truefalse_eval;
import commonFactories.TrueFalseFactory;
import commonLib.TrueFalse_eval;

public class GATETrueFalseFactory extends TrueFalseFactory {
    @Override
    public TrueFalse_eval createTrueFalse() {
        return new GATE_truefalse_eval();
    }
}
