package JEEFactories;
import JEELib.JEE_fillin_eval;
import commonFactories.FillinFactory;
import commonLib.Fillin_eval;


public class JEEFillInFactory extends FillinFactory {
    @Override
    public Fillin_eval createFillin() {
        return new JEE_fillin_eval();
    }
}
