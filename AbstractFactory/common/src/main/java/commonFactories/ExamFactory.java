package commonFactories;
import commonLib.*;

public abstract class ExamFactory {
    public abstract MCQ_eval createMCQ();
    public abstract Fillin_eval createFillIn();
    public abstract TrueFalse_eval createTrueFalse();
    public abstract Essay_eval createEssay();
    public abstract Match_the_following_eval createMatchTheFollowing();
}