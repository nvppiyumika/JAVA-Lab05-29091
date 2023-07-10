package com.mycompany.practical7q1;
import java.util.Scanner;
public class Practical7Q1 {

    public static void main(String[] args) {
        int n1,n2,ans;
        Scanner sc=new Scanner(System.in);
        
        try
        {
            System.out.println("Enter First Number: ");
            n1=sc.nextInt();
            
            System.out.println("Enter Second Number: ");
            n2=sc.nextInt();
            
            ans=n1/n2;
            
            System.out.println("Answer is: "+ans);
        }
        
        catch(Exception e)
        {
            System.out.println("Number devide by zero error ");
        }
    }
}
