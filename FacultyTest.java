/*
 *  (name header)
 */

public class FacultyTest
{
   public static void main( String args[] ) 
   {
       //Create an object of subclass FullTimeFaculty
       FullTimeFaculty bob = new FullTimeFaculty();
       
       bob.setSSN(123456789);
       bob.setSalary(120000.0);
       bob.print();
       
       //Create an object of subclass PartTimeFaculty
       PartTimeFaculty jane = new PartTimeFaculty();
       
       jane.setSSN(987654321);
       jane.setHourlyWage(54.0);
       jane.print();
       
       //Create an object of class Faculty
       Faculty jill = new Faculty();
       
       jill.setSSN(928374651);
   } 

} 