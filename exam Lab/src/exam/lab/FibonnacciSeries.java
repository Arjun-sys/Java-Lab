
package exam.lab;
import java.util.Scanner;

public class FibonnacciSeries {

    public static void main(String[] args) {
        int a=1,b=1,c,i;
        System.out.println("The Fibonacci Series:");
        for(i=0;i<15;i++)
        {
            c=a+b;
            System.out.println(a);
            a=b;
            b=c;
            
            
        }
        // TODO code application logic here
    }
    
}
