package UPSCLib;
import commonLib.Match_the_following_eval;

public class UPSC_match_the_following_eval extends Match_the_following_eval {
    public UPSC_match_the_following_eval(){

    }
    public String evaluate(String response) {
        return String.format("UPSC Match The Following Evaluation Result: %s", response);
    }
}
