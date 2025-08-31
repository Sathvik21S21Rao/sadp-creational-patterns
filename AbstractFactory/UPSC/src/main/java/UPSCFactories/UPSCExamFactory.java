package UPSCFactories;
import commonFactories.ExamFactory;
import UPSCLib.*;
import commonLib.*;

public class UPSCExamFactory extends ExamFactory {
	@Override
	public MCQ_eval createMCQ() {
		return new UPSC_mcq_eval();
	}

	@Override
	public Fillin_eval createFillIn() {
		return new UPSC_fillin_eval();
	}

	@Override
	public TrueFalse_eval createTrueFalse() {
		return new UPSC_truefalse_eval();
	}

	@Override
	public Essay_eval createEssay() {
		return new UPSC_essay_eval();
	}
    @Override
    public UPSC_match_the_following_eval createMatchTheFollowing() {
        return new UPSC_match_the_following_eval();
    }
}
