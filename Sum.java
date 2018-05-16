/**
 * Created by pujithapabbaraju on 15/05/18.
 */

/*
Write a Program to accept two integers through the command line argument and print the sum of the two numbers
Example:
C:\>java Sample 10 20
O/P Expected : The sum of 10 and 20 is 30
*/

public class Sum {

    public static void main (String args[]){
        if(args.length == 0){
            System.out.println("Please enter arguments to proceed.");
        }
        else if(args.length ==1 ){
            System.out.println("Please enter another argument to add 2 numbers");
        }
        else if(args.length == 2){
            int a1 = Integer.parseInt(args[0]);
            int a2 =Integer.parseInt(args[1]);
            System.out.println(a1 + a2);
        }
    }

}
