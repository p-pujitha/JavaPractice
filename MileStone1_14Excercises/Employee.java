/**
 * Created by pujithapabbaraju on 16/05/18.
 */
/*
Create a class called Person with a member variable name. Save it in a file called Person.java Create a class called Employee who will inherit the Person class.
The other data members of the employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.
Save this in a file called Employee.java Your class should have a reasonable number of constructors and accessor methods.
Write another class called TestEmployee, containing a main method to fully test your class definition.
 */
public class Employee extends Person {
    double salary;
    String year;
    String nationalInsuranceNumber;

    public Employee(String name, double salary, String year, String nationalInsuranceNumber) {
        this.name = name;
        this.salary = salary;
        this.year = year;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public Employee() {

    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

}




