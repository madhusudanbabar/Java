import java.util.*;
import java.io.*;
public class Prifile{
Public Static void main(String arg[]){
Scanner s=new Scanner(System.in);
int L=s.nextInt();
int N=s.nextInt();


for(int i=0; i<N; i++)

{
int W=s.nextInt();
int H=s.nextInt();

if(W>L && H>L)

    System.out.println("CROP IT"); 

     }

    if(W>L && H<L)

     {

System.out.println("UPLOAD ANOTHER");  

     }

     if(W<L && H>L)

     {

System.out.println("UPLOAD ANOTHER");

     }

     if(W==H)

     {

System.out.println("ACCEPTED");

     }

     if(W>L && H==L)

     {

System.out.println("CROP IT");

     }    

     if(W==L && H>L)

     {

System.out.println("CROP IT");

     }

}

}

 
