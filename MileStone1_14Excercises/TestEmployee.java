/**
 * Created by pujithapabbaraju on 16/05/18.
 */
/*
Create a class called Person with a member variable name. Save it in a file called Person.java Create a class called Employee who will inherit the Person class.
The other data members of the employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.
Save this in a file called Employee.java Your class should have a reasonable number of constructors and accessor methods.
Write another class called TestEmployee, containing a main method to fully test your class definition.
 */
public class TestEmployee {

    public static void main(String args[]){
        Employee  emp1 = new Employee("Pujitha",3000.00, "2018" , "123");
        System.out.println("Employee name: "+ emp1.getName());
        System.out.println("Employee sal: "+ emp1.getSalary());
        System.out.println("Employee year: "+ emp1.getYear());
        System.out.println("Employee nationalInsuranceNumber: "+ emp1.getNationalInsuranceNumber());
        Employee emp2 = new Employee();
        emp2.setName("Mounika");
        emp2.setSalary(4000.00);
        emp2.setYear("2018");
        emp2.setNationalInsuranceNumber("456");
        System.out.println("Employee name: "+ emp2.getName());
        System.out.println("Employee sal: "+ emp2.getSalary());
        System.out.println("Employee year: "+ emp2.getYear());
        System.out.println("Employee nationalInsuranceNumber: "+ emp2.getNationalInsuranceNumber());
    }
}
