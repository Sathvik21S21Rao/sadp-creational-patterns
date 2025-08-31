package JEELib;
import commonLib.Match_the_following_eval;
public class JEE_match_the_following_eval extends Match_the_following_eval {
    public JEE_match_the_following_eval(){

    }
    public String evaluate(String response) {
        return String.format("JEE Match The Following Evaluation Result: %s", response);
    }
}
