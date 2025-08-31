package JEELib;
import commonLib.TrueFalse_eval;
public class JEE_truefalse_eval extends TrueFalse_eval {
    public JEE_truefalse_eval(){

    }
    public String evaluate(String response) {
        return String.format("JEE True/False Evaluation Result: %s", response);
    }

}
