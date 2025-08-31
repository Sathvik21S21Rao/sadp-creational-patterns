package app;
import commonLib.*;
import commonFactories.*;
import java.util.Properties;
import java.io.FileInputStream;

class Client{
    private ExamFactory examFactory;

    public Client(ExamFactory examFactory) {
        this.examFactory = examFactory;
    }

    public void evaluateAll() {
        MCQ_eval mcq = examFactory.createMCQ();
        Fillin_eval fillin = examFactory.createFillIn();
        TrueFalse_eval trueFalse = examFactory.createTrueFalse();
        Essay_eval essay = examFactory.createEssay();
        Match_the_following_eval matchTheFollowing = examFactory.createMatchTheFollowing();

        System.out.println(mcq.evaluate("MCQ Response"));
        System.out.println(fillin.evaluate("Fill-in Response"));
        System.out.println(trueFalse.evaluate("True/False Response"));
        System.out.println(essay.evaluate("Essay Response"));
        System.out.println(matchTheFollowing.evaluate("Match the Following Response"));
    }
}

public class Main{
    public static void main(String[] args)  {
        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            props.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String examType=props.getProperty("examType");
        try{
            Class<?> ExamFactoryClass = Class.forName(examType+"Factories."+examType + "ExamFactory");
            ExamFactory examFactory = (ExamFactory) ExamFactoryClass.newInstance();
            Client client = new Client(examFactory);
            client.evaluateAll();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}