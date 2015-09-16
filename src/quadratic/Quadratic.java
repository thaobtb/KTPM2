/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Quadratic {

    private double a;
    private double b;
    private double c;
    public double result1;
    public double result2;
    public boolean check;
    
    public Quadratic(double a1, double b1, double c1)
    {
        a = a1;
        b = b1;
        c = c1;
        calculate();
    }
    public void calculate()
    {
        double delta = Math.pow(b,2)-(4*a*c);
        if(delta < 0)
        {
            System.out.println("No real solutions.");
            check = true;
        }
        else
        {
            result1 = (-b + Math.sqrt(delta))/(2*a);
            result2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("x1 = " + result1 + "\n" + "x2 = " + result2);
            check = false;
            
        }
    }
    public static void main(String[] args) {
        Quadratic q = new Quadratic(1, -3, 2); 
        
    }
    
}
