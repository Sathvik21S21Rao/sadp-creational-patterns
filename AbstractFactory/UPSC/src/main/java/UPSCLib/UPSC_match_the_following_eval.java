package UPSCLib;
import commonLib.Match_the_following_eval;

public class UPSC_match_the_following_eval extends Match_the_following_eval {
    public String evaluate(String response) {
        // Fix capitalization here
        return String.format("UPSC Match the Following Evaluation Result: %s", response);
    }
}