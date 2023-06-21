package PracticePrograms;

public class ExceptionHandling {
	/*int var1=10;int var2=0;
	int arr[]= {34,56,3,87,46};
	String str="chennai";
	String st=null;*/
	
	public void calculateOps() throws Exception
	{
		System.out.println("welcome to maths world");
		for(int i=0;i<11;i++)
		{
			System.out.println(i);
			if(i==5)
			{
				Thread.sleep(5000);
			}
		}
		/* try {
		System.out.println(str.charAt(13));
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
			catch(Exception e)
			{
				System.out.println(e);
			} */
		System.out.println(" completed the calculation");
	
	System.out.println("thank you");
	}
   public static void main(String[] args) throws Exception {
	   ExceptionHandling eh = new ExceptionHandling();
	   eh.calculateOps();
	   
}
}
