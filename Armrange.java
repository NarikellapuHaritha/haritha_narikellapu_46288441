package javaassignment;

public class Armrange {
	public static void main (String[] args)
	{
		int n,count = 0,a,b,c,sum=0;
		System.out.println("Armstrong numbers from 1 to 999:");
		for(int i=1;i<=999;i++)
		{
			n=i;
			while(n>0)
			{
				b=n%10;
				sum=sum+(b*b*b);
				n=n/10;
			}
			if(sum==i)
			{
				System.out.println(i+" ");
			}
			sum=0;
		}
		
	}

}
