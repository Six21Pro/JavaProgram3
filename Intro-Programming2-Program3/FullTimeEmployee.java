
public class FullTimeEmployee extends Employee
{
    private double weeklySal;//instance variable

    public FullTimeEmployee(String f, String l, String ssn, double s)//constructor expecting variables
    {
        super(f,l,ssn);//First three variables initialized by the super class
        weeklySal= s;

    }

    //getter method
    public double getSal(){

        return weeklySal;
    }
    //setter method
    public void setSal(double s){

        weeklySal=s;
    }
    //overrides abstract method from abstract class
    public double earnings(){

        return weeklySal;
    }
    //overrides method from abstract class
    public String toString(){
        return super.toString()+"\tEarnings: $" + earnings()+"\t"+getClass();
    }
}
