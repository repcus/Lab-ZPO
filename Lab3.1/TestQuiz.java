import org.junit.Test;
import static org.junit.Assert.*;


public class TestQuiz {

    @Test
    public void fullPointTest(){
        String[] defaultAnswers = new String[3];

        String fullPointAnswer1 = "butchery";
        String fullPointAnswer2 = "MaSsAcRe";
        String fullPointAnswer3 = "caRNAGE";

        defaultAnswers[0] = "massacre";
        defaultAnswers[1] = "carnage";
        defaultAnswers[2] = "butchery";

        assertEquals(1, Quiz.assessPoints(defaultAnswers, fullPointAnswer1), 0.1);
        assertEquals(1, Quiz.assessPoints(defaultAnswers, fullPointAnswer2), 0.1);
        assertEquals(1, Quiz.assessPoints(defaultAnswers, fullPointAnswer3), 0.1);

    }

    @Test
    public void halfPointTest(){
        String[] defaultAnswers = new String[3];

        String halfPointAnswer1 = "BUrchery";
        String halfPointAnswer2 = "MaSssAcRe";
        String halfPointAnswer3 = "CAENAGE";

        defaultAnswers[0] = "massacre";
        defaultAnswers[1] = "carnage";
        defaultAnswers[2] = "butchery";

        assertEquals(0.5, Quiz.assessPoints(defaultAnswers, halfPointAnswer1), 0.1);
        assertEquals(0.5, Quiz.assessPoints(defaultAnswers, halfPointAnswer2), 0.1);
        assertEquals(0.5, Quiz.assessPoints(defaultAnswers, halfPointAnswer3), 0.1);

    }

    @Test
    public void noPointTest(){
        String[] defaultAnswers = new String[3];

        String noPointAnswer1 = "bubu";
        String noPointAnswer2 = "death";
        String noPointAnswer3 = "olej kokosowy";

        defaultAnswers[0] = "massacre";
        defaultAnswers[1] = "carnage";
        defaultAnswers[2] = "butchery";

        assertEquals(0, Quiz.assessPoints(defaultAnswers, noPointAnswer1), 0.1);
        assertEquals(0, Quiz.assessPoints(defaultAnswers, noPointAnswer2), 0.1);
        assertEquals(0, Quiz.assessPoints(defaultAnswers, noPointAnswer3), 0.1);

    }

}
