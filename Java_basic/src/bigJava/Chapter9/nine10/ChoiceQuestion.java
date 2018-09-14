package bigJava.Chapter9.nine10;
import java.util.ArrayList;
/**
   Add a toString method to the ChoiceQuestion class.
*/
public class ChoiceQuestion extends Question
{
   private ArrayList<String> choices;

   /**
      Constructs a choice question with a given text and no choices.
      @param questionText the text of this question
   */
   public ChoiceQuestion(String questionText)
   {
      super(questionText);
      choices = new ArrayList<String>();
   }

   /**
      Adds an answer choice to this question.
      @param choice the choice to add
      @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct)
   {
      choices.add(choice);
      if (correct) 
      {
         // Convert choices.size() to string
         String choiceString = "" + choices.size();
         setAnswer(choiceString);
      }
   }
   
   public void display()
   {
      // Display the question text
      super.display();
      // Display the answer choices
      for (int i = 0; i < choices.size(); i++)
      {
         int choiceNumber = i + 1;
         System.out.println(choiceNumber + ": " + choices.get(i));     
      }
   }
   
   public String toString() {
	   String question = "";
	   //question += super.toString();
	   //for(int i = 0; i<choices.size(); i++)
		   //question += "\n" + (i+1) + ": "+ choices.get(i);
	   question = super.toString() + " choices :"  + choices ;
	   return question;
   }
}

