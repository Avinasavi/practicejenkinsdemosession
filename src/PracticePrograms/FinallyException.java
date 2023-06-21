
package PracticePrograms;

public class FinallyException {
	int var1=10;int var2=0;
	public void calculateOps() 
	{
		System.out.println("welcome to maths world");
		System.out.println("file opened");
		try {
		System.out.println(var1/var2); 
		}
		finally {
			System.out.println("file closed");
		}
		
		System.out.println("work done");
		System.out.println(" completed the calculation");
	}
		
		
	
		  public static void main(String[] args)  
		  {
			   FinallyException eh = new FinallyException();
			   eh.calculateOps();
			   
		}
		
		
}
	


