/**
   Describes any class whose objects can be measured.
   
   Can measure objects, whether they are a BankAccount, a Country, 
     or any other measuarable object.
*/
public interface Measurable
{
   /**
      Computes the measure of the object.
      @return the measure
   */
   double getMeasure();
}
