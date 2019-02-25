/**
      A utility class that computes the average of the measures of the 
      given objects.
      (it knows nothing about BankAccount or Country objects!)
*/
public class Data
{
   /**
      computes the average of the measures of the given objects.      
      @param objects an array of Measurable objects
      @return the average of the measures
   */
   public static double average(Measurable[] objects)
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      if (objects.length > 0) { return sum / objects.length; }
      else { return 0; }
   }
}
