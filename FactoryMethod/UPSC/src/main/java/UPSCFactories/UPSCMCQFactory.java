package UPSCFactories;
import commonFactories.MCQFactory;
import UPSCLib.UPSC_mcq_eval;

public class UPSCMCQFactory extends MCQFactory {
    @Override
    public UPSC_mcq_eval createMCQ() {
        return new UPSC_mcq_eval();
    }
}
