import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		
		for(int c = 0; c < cases; c++){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    
		    for(int i = a; i <= b; i++){
		        if(i == 1){
		            continue;
		        }
		        
		        boolean broke = false;
		        for(int j = 2; j <= (int)Math.sqrt(i); j++){
		            if(i%j == 0){
		                broke = true;
		                break;
		            }
		        }
		        if(!broke){
		            System.out.println(i);
		        }
		    }
		    System.out.println("");
		}

	}
}
