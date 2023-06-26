package com.mycompany.ex4;

public class rectangle extends shape {
    
    private final double h;
    private final double r;
   double a;

    rectangle(double r, double h) {
        this.r=r;
        this.h=h;
    }
    
    
   @Override
    void calculateArea()
    {
        a= 0.5*r*h;
    }
    
   @Override
    void display()
    {
        System.out.println("Area is "+a);
    }
}
