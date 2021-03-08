import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i  = sc.nextInt();
        for(int j= 2;j<i;j++)
        {
            if(i%j==0){
                System.out.println("Not prime");
            }
            else if(i%j!=0)
            {
                System.out.println("prime");
            }
        }
    }
}
