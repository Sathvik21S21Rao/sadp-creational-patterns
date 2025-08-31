package JEELib;
import commonLib.Fillin_eval;

public class JEE_fillin_eval extends Fillin_eval {
    public JEE_fillin_eval(){

    }
    public String evaluate(String response) {
        return String.format("JEE Fill-in-the-Blank Evaluation Result: %s", response);
    }
}
