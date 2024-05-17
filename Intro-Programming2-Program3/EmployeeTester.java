import java.util.*;
import java.io.*;

public class EmployeeTester
{
    public static void main() throws FileNotFoundException{
        //FOR TESTING ONLY
        /*FullTimeEmployee f= new FullTimeEmployee("jay","Anthony","0001-34",465.25);
        System.out.println(f.toString());   
        PartTimeEmployee p= new PartTimeEmployee("Alice","Cone","4444-55",10.00,10);
        System.out.println(p.toString());*/ 

        System.out.println("List of employee names, earnings, and status( Full time/Part time)");
        System.out.println(".......................................................................................");
        Employee [] Em = new Employee[10];//array to contain employee objects

        File file= new File("data.txt");
        Scanner in = new Scanner(file);

        int i=0;//used for referencing specific array elements

        while (in.hasNextLine()){

            int a=in.nextInt();//a used to check the first int read from a line
            if ( a==1) {//if a is 1
                FullTimeEmployee g= new FullTimeEmployee(in.next(),in.next(),in.next(),in.nextDouble());
                Em[i] = g;//employee object set added to the array, for position i
                System.out.println(Em[i].toString());
            }
            else if (a ==2){
                PartTimeEmployee d= new PartTimeEmployee(in.next(),in.next(),in.next(),in.nextInt(),in.nextDouble());
                Em[i] = d;//employee object set added to the array, for position i
                System.out.println(Em[i].toString());
            } 
            i++;
        }

    }
}
