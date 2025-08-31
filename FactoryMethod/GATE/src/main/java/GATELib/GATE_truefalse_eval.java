package GATELib;
import commonLib.TrueFalse_eval;

public class GATE_truefalse_eval extends TrueFalse_eval {
    public GATE_truefalse_eval(){

    }
    public String evaluate(String response) {
        return String.format("GATE True/False Evaluation Result: %s", response);
    }
}
