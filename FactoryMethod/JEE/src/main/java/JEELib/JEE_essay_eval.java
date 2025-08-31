package JEELib;
import commonLib.Essay_eval;
//test
public class JEE_essay_eval extends Essay_eval {
    public JEE_essay_eval(){

    }
    public String evaluate(String response) {
        return String.format("JEE Essay Evaluation Result: %s", response);
    }
}
