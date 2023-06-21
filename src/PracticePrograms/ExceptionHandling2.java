package PracticePrograms;

public class ExceptionHandling2 {
	int var1=10;
	int var2=3;
	public void printAddition()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			if(i==5)
			{
				throw new ArrayIndexOutOfBoundsException();
			}
		}
	}
	
	
	public static void main(String[] args) {
		ExceptionHandling2 e = new ExceptionHandling2();
		e.printAddition();
		
		
	}

}
