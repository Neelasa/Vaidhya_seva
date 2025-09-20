package datastructureday2oftraining;

public class loops {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		String st = "VASAVI";
		for(char ch = 0;ch < st.length();ch++)
		{
			for(int j=0;j<=ch;j++)
			{
				System.out.print(st.charAt(j));
			}
			System.out.println();
		}
		
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
			
		String s = "VASAVI";
		for(char ch = 0;ch < s.length();ch++)
		{
			for(int j=ch;j<s.length();j++)
			{
				System.out.print(st.charAt(j));
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				if(j>i)
				{
					System.out.print(" ");
				}
				
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=1;j--)
			{
				if(j>i)
				{
					System.out.print(" ");
				}
				
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j = 4 ; j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int j = 4 ; j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
}
