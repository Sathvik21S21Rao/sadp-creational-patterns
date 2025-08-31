package UPSCLib;
import commonLib.Fillin_eval;

public class UPSC_fillin_eval extends Fillin_eval {
    public String evaluate(String response) {
        return String.format("UPSC Fill-in-the-Blank Evaluation Result: %s", response);
    }
}
