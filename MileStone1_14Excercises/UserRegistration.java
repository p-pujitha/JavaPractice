/**
 * Created by pujithapabbaraju on 16/05/18.
 */
/*
A student portal provides user to register their profile. During registration the system needs to validate the user should be located in India. If not the system should throw an exception.
Step 1: Create a user defined exception class named “InvalidCountryException”.
Step 2: Overload the respective constructors.
Step 3: Create a main class “UserRegistration”, add the following method,
registerUser– The parameter are String username,String userCountry and add the following logic,
• if userCountry is not equal to “India” throw a InvalidCountryException with the message “User Outside India cannot be registered”
• if userCountry is equal to “India”, print the message “User registration done successfully”
Invoke the method registerUser from the main method with the data specified and see how the program behaves,
Name Country Expected Output
Mickey US InvalidCountryException should be thrown.
The message should be “User Outside India cannot be registered” Mini India The message should be “User registration done successfully” Sample Input and Output
 */
public class UserRegistration {
    String userName;
    String userCountry;
    void registerUser(String userName, String userCountry){
        this.userCountry = userCountry;
        this.userName = userName;
        try{
            if(userCountry == "India"){
                System.out.println(this.userName + " : User registration done successfully");
            }
            else{
                throw new InvalidCountryException(this.userName + " : User Outside India cannot be registered");
            }
        }catch(InvalidCountryException e){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        UserRegistration u1 = new UserRegistration();
        u1.registerUser("Pujitha","India");
        UserRegistration u2 = new UserRegistration();
        u2.registerUser("Mounika","USA");
    }
}
