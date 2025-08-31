package JEELib;
import commonLib.MCQ_eval;

public class JEE_mcq_eval extends MCQ_eval {
    public JEE_mcq_eval(){

    }
    public String evaluate(String response) {
        return String.format("JEE MCQ Evaluation Result: %s", response);
    }
}
