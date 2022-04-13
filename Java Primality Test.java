import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger no = new BigInteger(n);
        boolean ans;
        ans = no.isProbablePrime(1);
        if(ans == true)
          System.out.println("prime");
        else
          System.out.println("not prime");
        bufferedReader.close();
    }
}
