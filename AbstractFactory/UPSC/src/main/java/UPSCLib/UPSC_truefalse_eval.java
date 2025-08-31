package UPSCLib;
import commonLib.TrueFalse_eval;

public class UPSC_truefalse_eval extends TrueFalse_eval {
    public String evaluate(String response) {
        return String.format("UPSC True/False Evaluation Result: %s", response);
    }
}
