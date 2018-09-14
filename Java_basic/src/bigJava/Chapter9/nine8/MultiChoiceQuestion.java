package bigJava.Chapter9.nine8;
//这个答案必须全对才可以，中间用" "分开
public class MultiChoiceQuestion extends ChoiceQuestion{
	
	private String choiceResponse;
	private int numberOfChoices;
	public MultiChoiceQuestion() {
		super();
		choiceResponse = "";
		numberOfChoices = 0;
	}
	
	public void addChoice(String choice, boolean correct) {
		super.addChoice(choice, correct);
		numberOfChoices++;
		if(correct) {
			if (choiceResponse.length() == 0) {
				choiceResponse =""+ numberOfChoices;
			}
			else
				choiceResponse  = choiceResponse + " " + numberOfChoices;
		}
		setAnswer(choiceResponse);
	}
	
	
	

}