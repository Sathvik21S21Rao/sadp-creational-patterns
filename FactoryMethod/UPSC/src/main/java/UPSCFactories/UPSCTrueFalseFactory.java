package UPSCFactories;
import commonFactories.TrueFalseFactory;
import UPSCLib.UPSC_truefalse_eval;

public class UPSCTrueFalseFactory extends TrueFalseFactory {
    @Override
    public UPSC_truefalse_eval createTrueFalse() {
        return new UPSC_truefalse_eval();
    }
}
