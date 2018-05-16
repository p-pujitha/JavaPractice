import java.util.Scanner;

/**
 * Created by pujithapabbaraju on 15/05/18.
 */
/*
Write a program to print the sum of the elements of the array with the given below condition. If the array has 6 and 7 in succeeding orders, ignore 6 and 7 and the numbers between them for the calculation of sum.
Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22
[i.e 10+3+9]
Eg2) Array Elements - 7,1,2,3,6 O/P:19
Eg3) Array Elements - 1,6,4,7,9 O/P:10
 */
public class SuccedingArraySum {

    public static void main(String args[]){
        System.out.println("Enter no.of elements for input to the array to calculate sum of non succeeding elements");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Enter " + n + " integer elements ");
        Integer a[] = new Integer[n];
        for(int i=0; i<n; i++){
            a[i] = s.nextInt();
        }
        int count =0;
        int sum=0;

        for(int i=0; i<n; i++){
            if(a[i]==6 && count==0){
                count=1;
                i++;
                while(a[i]!=7){
                    i++;
                }
            }
            if(a[i]==7 && count ==0){
                sum=sum+a[i];
                count=1;
            }
            if(a[i]==6 && count == 1){
                sum=sum+a[i];
            }
            if(a[i]!=6 && a[i]!=7){
                sum=sum+a[i];
            }

        }

        System.out.println("Sum = " + sum);

    }
}
