import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Goki {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();    //no of ppl
	int X = s.nextInt(); //min skill
        while(N!=0){
        
        int Y = s.nextInt();              //skill of ith ppl 
        
            if(X<=Y){
                System.out.println("YES");
            }
            else{
                System.out.println("No");
            }N--;
        }
        
    }
} 
