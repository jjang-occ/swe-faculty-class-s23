/*
 * Subclass PartTimeFaculty inherits from superclass Faculty
 */

public class PartTimeFaculty extends Faculty
{
    private double hourlyWage;
    
    public PartTimeFaculty()
    {
        super();                 // call constructor of the superclass
        hourlyWage = 0.0;
    }
    
    public PartTimeFaculty(int newSSN, double newHourlyWage)
    {
        super(newSSN);            // call overloaded constructor of the superclass
        hourlyWage = newHourlyWage;
    }
    
    public double getHourlyWage()
    {
        return hourlyWage;
    }
    
    public void setHourlyWage(double newHourlyWage)
    {
        hourlyWage = newHourlyWage;
    }
    
    // Method print is redefined
    public void print()
    {
        super.print();
        System.out.printf("Hourly wage: $%.2f", hourlyWage);
        System.out.println("\n");
    }
}
