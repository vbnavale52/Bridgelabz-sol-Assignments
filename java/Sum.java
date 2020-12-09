package assignment;

public class Sum 
 {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no:");
		int range=sc.nextInt();
		for (int i = 0; i < range; i++) {
			
		}

	}
	void prime(int num)
	{
	int count=0;
	for( int j=1;j<=num;j++)
	{
		if(num%j==0)
		{
			count++;
		}
		
	}
	if(count==2)
		System.out.println(num);
		}
	int sum (int sum,int num)
	{
		return sum+num;
	}
	void evenOdd(int num)
	{

	if(num%2==0)
	{
		count++;
	}
	
	}
}
