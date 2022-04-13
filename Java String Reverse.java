import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        /*
        StringBuilder A1 = new StringBuilder();
        StringBuilder A2 = new StringBuilder();
        StringBuilder A3 = new StringBuilder();
        A2.append(A);
        A1.append(A);
        A3.append(A1.reverse());      
        if(A2 == A3)
        System.out.println("Yes");
        else
        System.out.println("No");
        */
        
        /* Enter your code here. Print output to STDOUT. */ 
        boolean flag = false;
            for(int i = 0 ; i <= A.length()/2 ; i++)
            {
               if(A.charAt(0+i)== A.charAt(A.length()-1-i))
               {
                   flag = true;
                   break;
               }
               else
               {
                   flag = false;
                   break;
               }
            }
            
             if(flag == true)
             System.out.println("Yes");
             else
             System.out.println("No");
        
          
    }
}



