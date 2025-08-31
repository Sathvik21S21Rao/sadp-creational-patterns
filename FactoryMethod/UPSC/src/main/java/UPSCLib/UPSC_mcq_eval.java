package UPSCLib;
import commonLib.MCQ_eval;

public class UPSC_mcq_eval extends MCQ_eval {
    public String evaluate(String response) {
        return String.format("UPSC MCQ Evaluation Result: %s", response);
    }
}
