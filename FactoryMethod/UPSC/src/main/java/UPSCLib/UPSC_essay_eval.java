package UPSCLib;
import commonLib.Essay_eval;

public class UPSC_essay_eval extends Essay_eval {
    public String evaluate(String response) {
        return String.format("UPSC Essay Evaluation Result: %s", response);
    }
}
