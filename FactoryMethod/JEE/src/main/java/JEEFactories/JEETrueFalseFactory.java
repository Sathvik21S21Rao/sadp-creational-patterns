package JEEFactories;
import JEELib.JEE_truefalse_eval;
import commonFactories.TrueFalseFactory;
import commonLib.TrueFalse_eval;

public class JEETrueFalseFactory extends TrueFalseFactory {
    @Override
    public TrueFalse_eval createTrueFalse() {
        return new JEE_truefalse_eval();
    }
}
