package JEEFactories;
import JEELib.JEE_essay_eval;
import commonFactories.EssayFactory;
import commonLib.Essay_eval;
//test
public class JEEEssayFactory extends EssayFactory {
    @Override
    public Essay_eval createEssay() {
        return new JEE_essay_eval();
    }
}
