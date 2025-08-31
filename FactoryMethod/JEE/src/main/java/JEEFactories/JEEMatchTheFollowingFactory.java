package JEEFactories;
import commonFactories.MatchTheFollowingFactory;

public class JEEMatchTheFollowingFactory extends MatchTheFollowingFactory {
    @Override
    public JEELib.JEE_match_the_following_eval createMatchTheFollowing() {
        return new JEELib.JEE_match_the_following_eval();
    }
}
