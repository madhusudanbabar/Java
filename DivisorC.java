import java.io.*;
import java.util.*;


class DivisorC {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
int l=s.nextInt();
        int k=s.nextInt();
        int r=s.nextInt();
        if(n>0){
        
        for(int i=l;i<=r;i++){
            if(i%k==0){
                count++;
            }
            
        }
        System.out.println(count);
        }
        }
	
    }
