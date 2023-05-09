/*
 * Superclass Faculty (Parent class)
 */

public class Faculty
{
    // data fields
    private int ssn;

    // default constructor
    public Faculty()
    {
        ssn = 0;
    }

    // overloaded constructor
    public Faculty(int newSSN)
    {
        ssn = newSSN;
    }
    
    // accessor method
    public int getSSN()
    {
        return ssn;
    }
    
    // mutator method
    public void setSSN(int newSSN)
    {
        ssn = newSSN;
    }
    
    // print method
    public void print()
    {
        System.out.println("Social Security Number: " + ssn);
    }
}
