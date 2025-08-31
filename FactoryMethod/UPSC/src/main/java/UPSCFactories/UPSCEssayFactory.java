package UPSCFactories;
import commonFactories.EssayFactory;
import UPSCLib.UPSC_essay_eval;

public class UPSCEssayFactory extends EssayFactory {
    @Override
    public UPSC_essay_eval createEssay() {
        return new UPSC_essay_eval();
    }
}
