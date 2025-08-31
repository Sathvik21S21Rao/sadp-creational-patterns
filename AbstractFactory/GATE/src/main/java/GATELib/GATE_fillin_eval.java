package GATELib;
import commonLib.Fillin_eval;

public class GATE_fillin_eval extends Fillin_eval{
    public GATE_fillin_eval(){

    }
    public String evaluate(String response){
        return String.format("GATE Fill-in Evaluation Result: %s", response);
    }
}