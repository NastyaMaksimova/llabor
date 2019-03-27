
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
 
public class ReshenieUravnenia
{
    static float a, b, c;
    static float d;
    static double x1, x2;
 
    public static void main(String args []) throws IOException
    {
    try{
        System.out.println("Quadratic equation solution");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value a -> ");
        a = s.nextFloat();
        System.out.print("Enter value b -> ");
        b = s.nextFloat();
        System.out.print("Enter value c -> ");
        c = s.nextFloat();
        System.out.println("a = " + a + " b = " + b + " c = " + c);
 
        d = (b * b) - (4 * a * c);
 
        System.out.println("Discriminant = " + d);
 
        if(d < 0)
         System.out.print("Equation has no solution!!!");
        else
        if(d == 0)
          {
            x1 = (-b) / (2 * a);
             System.out.println ("x = " + x1);
           }
           else
           {
              x1 = (-b + Math.sqrt(d)) / (2 * a);
              x2 = (-b - Math.sqrt(d)) / (2 * a);
               if (x1 == x2)
                System.out.println ("x1 = x2 " + x1);
                 else
                  System.out.println ("x1 =  " + x1 + "  x2 = " + x2);
            }
        }catch(InputMismatchException e){System.out.println("Input enter");}
      }
}