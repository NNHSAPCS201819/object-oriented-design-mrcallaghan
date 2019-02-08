
import java.util.Scanner;

/**
 * A FillInQuestion is constructed with a string that contains the
 *      answer surrounded by '_'. For example, "The inventor of
 *      Java was _James Gosling_." The question should be displayed
 *      as: The inventor of Java was _____.
 *
 * @author mcallaghan
 * @version 7 February 2019
 */

/*
 * The FillInQuestion class extends (i.e., is a subclass of) the
 *      Question class.
 */
public class FillInQuestion extends Question
{
    /*
     * Do not declare instance variables for text and answer! The
     *      text and answer instance variables are inherited from
     *      the Question class!
     */
    
    /**
     * This method overrides the setText method in the Question class.
     * 
     * Sets the question text and the answer.
     * 
     * @param   questionText    the text of this question including
     *                          the answer
     */
    /*
     * Use the @Override annotation when overriding a method to
     *      help the compiler verify that you are overriding and
     *      not overloading
     */
    @Override
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");  // separates tokens in the string by "_"
        String question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        
        /*
         * The inherited instance variables are private; they cannot
         *      be directly accessed. We must use the mutator and
         *      accessor methods.
         */
        //this.text = question;
        //this.answer = answer;
        
        /*
         * Use the "super" reserved word to call the setText method
         *      as defined in the superclass (i.e., Question)
         */
        super.setText(question);
        
        /*
         * Should use the "this" reserved word to call the setAnswer method.
         *      If the subclass doesn't override the method, the superclass's
         *      version of the method will be called. We don't want to use
         *      "super" in this case because if we later override setAnswer,
         *      the overriden method will not be called.
         */
        this.setAnswer(answer);
    }
    
    
    
}
