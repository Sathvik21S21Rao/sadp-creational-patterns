package JEEFactories;
import commonFactories.ExamFactory;
import JEELib.*;
import commonLib.*;

public class JEEExamFactory extends ExamFactory {

    @Override
    public MCQ_eval createMCQ() {
        return new JEE_mcq_eval();
    }

    @Override
    public Fillin_eval createFillIn() {
        return new JEE_fillin_eval();
    }

    @Override
    public TrueFalse_eval createTrueFalse() {
        return new JEE_truefalse_eval();
    }

    @Override
    public Essay_eval createEssay() {
        return new JEE_essay_eval();
    }
    @Override
    public JEE_match_the_following_eval createMatchTheFollowing() {
        return new JEE_match_the_following_eval();
    }

}
