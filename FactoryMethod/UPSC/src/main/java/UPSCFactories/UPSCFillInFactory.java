package UPSCFactories;
import commonFactories.FillinFactory;
import UPSCLib.UPSC_fillin_eval;

public class UPSCFillInFactory extends FillinFactory {
    @Override
    public UPSC_fillin_eval createFillin() {
        return new UPSC_fillin_eval();
    }
}
