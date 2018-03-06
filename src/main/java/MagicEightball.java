import java.util.ArrayList;
import java.util.Collections;

public class MagicEightball {

    private ArrayList<String> answers;

    public MagicEightball(){
        this.answers = new ArrayList<>();
        answers.add("You got this!");
        answers.add("Way to go!...looser!");
        answers.add("You're worthless!");
        answers.add("You're amazing!");
        answers.add("What is the sound of one hand clapping");
    }

    public String shake(){
        Collections.shuffle(this.answers);
        return this.answers.get(0);
    }

    public String getAnswerAtIndex(int index){
        return answers.get(index);
    }

    public void addAnswer(String newAnswer){
        this.answers.add(newAnswer);
    }

    public void removeAnswer(int index){
        this.answers.remove(index);
    }

    public int getNumberOfAnswers() {
        return this.answers.size();
    }
}
