import java.util.*;
import java.io.*;
public class pbookhasmap {
            public static void main(String[] args) {
                
            

            Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Integer> mymap = new HashMap<String,Integer>();
        for(int i = 0;i<n;i++){
            String name = sc.next();
            int phone = sc.nextInt();
            sc.nextLine();
            mymap.put(name,phone);

        }
        while(sc.hasNext()){
            String s = sc.next();
            if(mymap.get(s)==null)
                System.out.println("Not Found");
                else{
                    System.out.println(s + "="+ mymap.get(s));
                }
            }
            sc.close();
        }
      
    }
    

