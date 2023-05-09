/*
 * Subclass FullTimeFaculty inherits from superclass Faculty
 */

public class FullTimeFaculty extends Faculty
{
    private double salary;
    
    public FullTimeFaculty()
    {
        super();          // call constructor of the superclass
        salary = 0.0;
    }
    
    public FullTimeFaculty(int newSSN, double newSalary)
    {
        super(newSSN);     // call overloaded constructor of the superclass
        salary = newSalary;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void setSalary(double newSalary)
    {
        salary = newSalary;
    }
    
    // Method print is redefined
    public void print()
    {
        System.out.println("SSN: " + getSSN());
        System.out.printf("Salary: $%.2f", salary);
        System.out.println("\n");
    }
}
