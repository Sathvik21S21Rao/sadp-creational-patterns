package GATELib;
import commonLib.Essay_eval;

public class GATE_essay_eval extends Essay_eval {
    public GATE_essay_eval(){

    }
    public String evaluate(String response) {
        return String.format("GATE Essay Evaluation Result: %s", response);
    }
}
