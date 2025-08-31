package UPSCFactories;
import commonFactories.MatchTheFollowingFactory;
import UPSCLib.UPSC_match_the_following_eval;

public class UPSCMatchTheFollowingFactory extends MatchTheFollowingFactory {
    @Override
    public UPSC_match_the_following_eval createMatchTheFollowing() {
        return new UPSC_match_the_following_eval();
    }
}
