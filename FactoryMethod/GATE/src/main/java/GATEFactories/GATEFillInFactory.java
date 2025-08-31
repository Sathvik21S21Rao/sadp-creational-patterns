package GATEFactories;
import GATELib.GATE_fillin_eval;
import commonLib.Fillin_eval;
import commonFactories.FillinFactory;

public class GATEFillInFactory extends FillinFactory {
    @Override
    public Fillin_eval createFillin() {
        return new GATE_fillin_eval();
    }
}

 
