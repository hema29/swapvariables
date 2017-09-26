import java.io.*;
import java.util.*;
 
class SwapVariables
{
    public static void main(String args[])
    {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        num1 = sc.nextInt();
        System.out.println("\nEnter the First Number:");
        num2 = sc.nextInt();
        System.out.println("\nBefore Swapping Variables\n");
        System.out.println("A = " + num1 + "\nB = " + num2);
        
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
 
        System.out.println("\nAfter Swapping Variables\n");
        System.out.println("A = " + num1 + "\nB = " + num2 + "\n");
    }
}
