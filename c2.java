import java.util.*;
public class c2 {
    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        int sum = x+y;
        System.out.println("sum of "+x + " and " + y + " is "+sum);
        int prod = (x*y)/(x+y);
        System.out.println("Product is "+prod);
        //does not follow bodmass
        // {* / % ==>same priority  } >  {+ - (same priority)}
        // If same priority then execution from LEFT.
    }
    
}
