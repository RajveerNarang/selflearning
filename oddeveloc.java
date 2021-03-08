import java.util.*;
public class oddeveloc {
    public static void main(String[] args) {
        int a;
        String s;
        Scanner sc =new Scanner(System.in);
        a = sc.nextInt();
        sc.next();


        for(int i= 0; i<a;i++){
            s= sc.nextLine();
            sc.next();
           
            for(int j=0;j<s.length();j++)
            {
                if(j%2==0)
                {
                    System.out.print(s.charAt(j));
                }
                System.out.print("");
                if(j%2==1)
                {
                    System.out.print(s.charAt(j));
                }
            }
           
        }
        sc.close();

        System.out.println();
        

        
    }
    
}
