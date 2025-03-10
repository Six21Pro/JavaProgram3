// Employee abstract superclass

public abstract class Employee 
{
   private String firstName;
   private String lastName;
   private String SSN;

   // three-argument constructor
   public Employee( String first, String last, String ssn )
   {
      firstName = first;
      lastName = last;
      SSN = ssn;
   } // end three-argument Employee constructor

   // set first name
   public void setFirstName( String first )
   {
      firstName = first; // should validate
   } // end method setFirstName

   // return first name
   public String getFirstName()
   {
      return firstName;
   } // end method getFirstName

   // set last name
   public void setLastName( String last )
   {
      lastName = last; // should validate
   } // end method setLastName

   // return last name
   public String getLastName()
   {
      return lastName;
   } // end method getLastName

   // set social security number
   public void setSSN( String ssn )
   {
      this.SSN = ssn; // should validate
   } // end method setSocialSecurityNumber

   // return social security number
   public String getSSN()
   {
      return SSN;
   } // end method getSocialSecurityNumber

   // return String representation of Employee object
   @Override
   public String toString()
   {
      return String.format( "%-12s%-12s%-12s", 
         getFirstName(), getLastName(), getSSN() );
   } // end method toString

   // abstract method overridden by concrete subclasses
   public abstract double earnings(); // no implementation here
} // end abstract class Employee
