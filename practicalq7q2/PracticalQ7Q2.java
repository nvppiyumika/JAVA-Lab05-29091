package com.mycompany.practicalq7q2;
public class PracticalQ7Q2 {

    public static void main(String[] args) {
        
        int arr[]=new int[5];
        
        try
        {
            arr[5]=25;
            System.out.println("5th value is "+arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Array index error ");
                }
    }
}
