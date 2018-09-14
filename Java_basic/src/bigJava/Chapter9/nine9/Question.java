package bigJava.Chapter9.nine9;
/**
   A question with a text and an answer.
   Add a method addText to the Question superclass.
*/
public class Question
{
   private String text;
   private String answer;

   /**
      Constructs a question with a given text and an empty answer.
      @param questionText the text of this question
   */
   public Question(String questionText)
   {
      text = questionText;
      answer = "";
   }

   /**
      Sets the answer for this question.
      @param correctResponse the answer
   */
   public void setAnswer(String correctResponse)
   {
      answer = correctResponse;
   }

   /**
      Checks a given response for correctness.
      @param response the response to check
      @return true if the response was correct, false otherwise
   */
   public boolean checkAnswer(String response)
   {
      return response.equals(answer);
   }

   /**
      Add a line of text to the question text.
      @param line the line of text to add.
   */
   public void addText(String line)
   {
      text = text + '\n' + line ;
   }

   /**
      Displays this question.
   */
   public void display()
   {
      System.out.println(text);
   }
}
