package GATELib;
import commonLib.Match_the_following_eval;

public class GATE_match_the_following_eval extends Match_the_following_eval {
    public GATE_match_the_following_eval(){

    }
    public String evaluate(String response) {
        return String.format("GATE Match The Following Evaluation Result: %s", response);
    }
}
