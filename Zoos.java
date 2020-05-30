import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
         Scanner s=new Scanner(System.in);
        String str=s.next();
        int k=0;
        int j=0;
        
        char x='z';
        char y='0';
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            //String c=Character.toString(a);
            if(a==x){
                k++;
            }
            else if(a==y){
                j++;
            }

        }
System.out.println(j);
        if(j==2*k){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }

    }
}