/**
 * DescribeProgramHere
 *
 * @author Mike Pratt -- A00320459
 * @version 1.0
 */

import java.util.Scanner;

public class Test  {

    public static void main(String[] args)    {
        
    Scanner kbd = new Scanner (System.in);
    
        int num1, num2;
        num1 = kbd.nextInt();
        num2 = kbd.nextInt();
        
        System.out.println("num1 % num2: " + num1 % num2);
        System.out.println("num1 / num2: " + num1 / num2);

    }
}

