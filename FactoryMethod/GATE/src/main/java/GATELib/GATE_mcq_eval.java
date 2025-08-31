package GATELib;
import commonLib.MCQ_eval;
//test
public class GATE_mcq_eval extends MCQ_eval{
    public GATE_mcq_eval(){

    }
    public String evaluate(String response){
        return String.format("GATE MCQ Evaluation Result: %s", response);
    }
}
