import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MagicEightballTest {

    private MagicEightball eightBall;

    @Before
    public void before(){
        eightBall = new MagicEightball();
    }

    @Test
    public void canGetRandomAnswer(){
        String answer = eightBall.shake();
        System.out.println(answer);
    }

    @Test
    public void canAddAnswer(){
        eightBall.addAnswer("Hello World!");
        int lastIndex = eightBall.getNumberOfAnswers() -1;
        assertEquals("Hello World!", eightBall.getAnswerAtIndex(lastIndex));
    }

    @Test
    public void canRemoveAnswerAtIndex(){
        eightBall.removeAnswer(0);
        assertNotEquals("You got this!", eightBall.getAnswerAtIndex(0));
    }
}
