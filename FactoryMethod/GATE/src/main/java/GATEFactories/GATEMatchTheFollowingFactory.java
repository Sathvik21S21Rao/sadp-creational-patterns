package GATEFactories;
import commonFactories.MatchTheFollowingFactory;
import GATELib.GATE_match_the_following_eval;

public class GATEMatchTheFollowingFactory extends MatchTheFollowingFactory {
    @Override
    public GATELib.GATE_match_the_following_eval createMatchTheFollowing() {
        return new GATE_match_the_following_eval();
    }
}
