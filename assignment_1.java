package ineuron;

public class Assignment_1 {

	public static void main(String[] args) 
	{
		
		int n=11;
		for(int i=0;i<n;i++)
		{// To print I from the word INEURON
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==(n-1)/2)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			
			// To print N from the word INEURON
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==j)
				{
					System.out.print(" *");
				}
				else
					System.out.print("  ");
			}
			// To print E from the word INEURON
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==(n-1)/2||i==n-1)
				{
					System.out.print(" *");
				}
				else
					System.out.print("  ");
			}
			// To print U from the word INEURON
			for(int j=0;j<n;j++)
			{
				if(j==0&&i<n-1||j==n-1&&i<n-1||i==n-1&&j>0&&j<n-1)
				{
					System.out.print(" *");
				}
				else
					System.out.print("  ");
			}
			// To print R from the word INEURON
			for(int j=0;j<n;j++)
			{
				if(j==0&&i>0||i==0&&j>0&&j<(3*n)/4||j==(3*n)/4&&i>0&&i<(n-1)/2||i==(n-1)/2&&j>0&&j<(3*n)/4||i==j&&j>(n-1)/2&&i<=n-1)
				{
					System.out.print(" *");
				}
				else
					System.out.print("  ");
			}
			// To print O from the word INEURON
			for(int j=0;j<n;j++)
			{
				if(i==0&&j>0&&j<n-1||j==0&&i>0&&i<n-1||i==n-1&&j>0&&j<n-1||j==n-1&&i>0&&i<n-1)
				{
					System.out.print(" *");
				}
				else
					System.out.print("  ");
			}
			// To print N from the word INEURON
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==j)
				{
					System.out.print(" *");
				}
				else
					System.out.print("  ");
			}
		     System.out.println();
		}
		

	}

}
