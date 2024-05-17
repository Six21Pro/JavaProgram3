
public class PartTimeEmployee extends Employee
{
    private double wage;
    private int hours;

    public PartTimeEmployee(String f, String l, String ssn, int h, double w)//constructor expecting variables
    {
        super(f,l,ssn);//First three variables initialized by the super class
        wage= w;
        hours= h;

    }

    //getter method
    public double getWage(){

        return wage;
    }
    //getter method
    public int getHours(){

        return hours;
    }
    //setter method
    public void setWage(double w){

        wage=w;
    }
    //setter method
    public void setHours(int h){

        hours=h;
    }
    //overrides abstract method from abstract class
    public double earnings(){
        if (hours>40){//if hours exceed 40, time and a half is applied to the extra hours wages

            return wage= (wage*40)+((hours-40)*1.5*wage);}
        else{
            return wage*hours;}
    }
    //overrides method from abstract class
    public String toString(){
        return super.toString()+"\tEarnings: $" + earnings()+"\t"+getClass();
    }
}