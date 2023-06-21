package PracticePrograms;
public class AscendingOrder 
{
	public static void main(String[]args)
	{
		
	
	int arr[]=new int[] {34,93,20,61,10};
	int temp=0;
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
			arr[i]=temp;
			arr[j]=arr[i];
			temp=arr[j];
			
			}
		}
	}
	System.out.println("ascending order");
	for(int i=0;i<arr.length;i++) 
	System.out.println(arr[i] + "");
	
	
	
	
	}
	}
	
	
