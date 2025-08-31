package app;
import commonFactories.*;
import commonLib.*;
import java.util.Properties;
import java.io.FileInputStream;


class Client{
    private MCQFactory mcqFactory;
    private FillinFactory fillinFactory;
    private TrueFalseFactory trueFalseFactory;
    private EssayFactory essayFactory;
    private MatchTheFollowingFactory matchTheFollowingFactory;

    public Client(MCQFactory mcqFactory, FillinFactory fillinFactory, TrueFalseFactory trueFalseFactory, EssayFactory essayFactory, MatchTheFollowingFactory matchTheFollowingFactory) {
        this.mcqFactory = mcqFactory;
        this.fillinFactory = fillinFactory;
        this.trueFalseFactory = trueFalseFactory;
        this.essayFactory = essayFactory;
        this.matchTheFollowingFactory = matchTheFollowingFactory;
    }

    public void evaluateAll() {
        MCQ_eval mcq = mcqFactory.createMCQ();
        Fillin_eval fillin = fillinFactory.createFillin();
        TrueFalse_eval trueFalse = trueFalseFactory.createTrueFalse();
        Essay_eval essay = essayFactory.createEssay();
        Match_the_following_eval matchTheFollowing = matchTheFollowingFactory.createMatchTheFollowing();
        
        System.out.println(mcq.evaluate("MCQ Response"));
        System.out.println(fillin.evaluate("Fill-in Response"));
        System.out.println(trueFalse.evaluate("True/False Response"));
        System.out.println(essay.evaluate("Essay Response"));
        System.out.println(matchTheFollowing.evaluate("Match The Following Response"));
    }

}

public class Main {
    public static void main(String[] args) {
       Properties props = new Properties();

        try (FileInputStream fis = new FileInputStream("config.properties")) {
            props.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        String examType = props.getProperty("examType");
        Class<?> MCQFactoryClass;
        Class<?> fillinFactoryClass;
        Class<?> trueFalseFactoryClass;
        Class<?> essayFactoryClass;
        Class<?> matchTheFollowingFactoryClass;

        try{
            MCQFactoryClass = Class.forName(examType+"Factories."+examType + "MCQFactory");
            fillinFactoryClass = Class.forName(examType+"Factories."+examType + "FillInFactory");
            trueFalseFactoryClass = Class.forName(examType+"Factories."+examType + "TrueFalseFactory");
            essayFactoryClass = Class.forName(examType+"Factories."+examType + "EssayFactory");
            matchTheFollowingFactoryClass = Class.forName(examType+"Factories."+examType + "MatchTheFollowingFactory");

            MCQFactory mcqFactory = (MCQFactory) MCQFactoryClass.newInstance();
            FillinFactory fillinFactory = (FillinFactory) fillinFactoryClass.newInstance();
            TrueFalseFactory trueFalseFactory = (TrueFalseFactory) trueFalseFactoryClass.newInstance();
            EssayFactory essayFactory = (EssayFactory) essayFactoryClass.newInstance();
            MatchTheFollowingFactory matchTheFollowingFactory = (MatchTheFollowingFactory) matchTheFollowingFactoryClass.newInstance();

            Client client = new Client(mcqFactory, fillinFactory, trueFalseFactory, essayFactory, matchTheFollowingFactory);
            client.evaluateAll();
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
         
       

    }
}