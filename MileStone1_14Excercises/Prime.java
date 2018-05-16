import java.util.Scanner;

/**
 * Created by pujithapabbaraju on 15/05/18.
 */

/*
Write a Program that prints prime numbers from 1 to n
 */
public class Prime {
    public static  void main(String args[]){
        System.out.println("Enter some number to print prime numbers between 1 to n");
        String primeNumbers = "";
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<n;i++){
            int counter=0;
            for(int num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                primeNumbers = primeNumbers + i +",";
            }
        }

        System.out.println("Prime Numbers from 1 to " + n + "are :");
        System.out.println(primeNumbers);
    }
}





