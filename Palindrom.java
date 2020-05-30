import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Palindrom {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        String name,ans="";
        name = s.next(); 
        for(int i=name.length()-1;i>=0;i--){
             ans=ans + name.charAt(i);   
        }
        if(name.equals(ans)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}