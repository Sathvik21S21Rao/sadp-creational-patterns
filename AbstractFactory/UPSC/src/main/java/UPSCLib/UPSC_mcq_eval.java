package UPSCLib;
import commonLib.MCQ_eval;

public class UPSC_mcq_eval extends MCQ_eval {
    public String evaluate(String response) {
        System.out.println(String.format("Evaluated %s as per UPSC MCQ Question", response));
        return String.format("UPSC MCQ Evaluation Result: %s", response);
    }
}
