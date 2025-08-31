package GATEFactories;
import commonFactories.ExamFactory;
import GATELib.*;
import commonLib.*;

public class GATEExamFactory extends ExamFactory {

    @Override
    public MCQ_eval createMCQ() {
        return new GATE_mcq_eval();
    }

    @Override
    public Fillin_eval createFillIn() {
        return new GATE_fillin_eval();
    }

    @Override
    public TrueFalse_eval createTrueFalse() {
        return new GATE_truefalse_eval();
    }

    @Override
    public Essay_eval createEssay() {
        return new GATE_essay_eval();
    }

    @Override
    public Match_the_following_eval createMatchTheFollowing() {
        return new GATE_match_the_following_eval();
    }

}