package assign21;

public class Fibonacii {
	public void fibonacci()  
		{    
		 short n1=0,n2=1,n3;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		 
			 
		 while(true)//loop starts from 2 because 0 and 1 are already printed    
		 {try{    
		  n3=(short)(n1+n2);    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }   
		 catch(IllegalArgumentException e)
		 {
			 break;
		 }
		  
		}}  }
