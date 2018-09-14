package bigJava.Chapter9.nine7;
//这个问题在于，答案可以只要对了一部分就算都对
import java.util.ArrayList;

public class AnyCorrectChoiceQuestion extends Question{
	
	private ArrayList<String> choices;
	private String choiceString;
	
	public AnyCorrectChoiceQuestion(String questionText) {
		super(questionText);
		choices = new ArrayList<String>();
		
	}
	
	public void addChoice(String choice, boolean answer) {
		choices.add(choice);
		
		if(answer) {
			if(choiceString == null) {
				choiceString = "" + choices.size();
			}
			else {
				choiceString += " " + choices.size();
			}
		}
		
	}
	
	public boolean checkAnswer(String response) {
		return choiceString.indexOf(response) > -1;  //检查response是不是choiceString的一部分。如果等于-1就说明不是他的一部分，正确
		
	}
	public void display() {
		super.display();
		for(int i = 0; i < choices.size(); i++) {
			System.out.println(i+1 + ": " + choices.get(i)); //取arraylist中的值，用的是.get(index)方法
		}
	}
}
