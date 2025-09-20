package pack;

public class calc 
{
	/*
	public static void add(int x,int y)
	{
		System.out.println("The addition of the" +x+ " and " +y+ "is " +(x+y));
	}
	public static void sub(int a,int b)
	{
		System.out.println("The subtraction of the " +a+ " and " +b+ "is " +(a-b));
	}
	public static int pro(int m,int n)
	{
		//System.out.println("The multiplication of the" +m+ " and"+n+ "is"+(m*n));
		return (m*n);
	}
	public static void main(String[] args) {
		calc ca = new calc();
		ca.add(12, 20);
		ca.sub(11, 10);
		ca.pro(10, 3);
	}
*/
	//private access modifier.
	/*
	private  void add(int x,int y)
	{
		System.out.println("The addition of the" +x+ " and " +y+ "is " +(x+y));
	}
	private  void sub(int a,int b)
	{
		System.out.println("The subtraction of the " +a+ " and " +b+ "is " +(a-b));
	}
	private  int pro(int m,int n)
	{
		int res = m*n;
		System.out.println("The multiplication of the"+res );
		return res;
	}
	public static  void main(String[] args) {
		calc ca = new calc();
		ca.add(12, 20);
		ca.sub(11, 10);
		ca.pro(10, 3);
	}
	*/
	//default access modifier
	/*
	 void add(int x,int y)
	{
		System.out.println("The addition of the" +x+ " and " +y+ "is " +(x+y));
	}
	 void sub(int a,int b)
	{
		System.out.println("The subtraction of the " +a+ " and " +b+ "is " +(a-b));
	}
	 int pro(int m,int n)
	{
		int res = m*n;
		System.out.println("The multiplication of the"+res );
		return res;
	}
	public static void main(String[] args) {
		calc ca = new calc();
		ca.add(12, 20);
		ca.sub(11, 10);
		ca.pro(10, 3);
	}
	
	*/
	
	// protected access specifier.
	
	protected static void add(int x,int y)
	{
		System.out.println("The addition of the" +x+ " and " +y+ "is " +(x+y));
	}
	protected static void sub(int a,int b)
	{
		System.out.println("The subtraction of the " +a+ " and " +b+ "is " +(a-b));
	}
	protected static int pro(int m,int n)
	{
		//System.out.println("The multiplication of the" +m+ " and"+n+ "is"+(m*n));
		int res = m*n;
		System.out.println("The multiplication of the " +res );
		return res;
		
	}
	public static void main(String[] args) {
		calc ca = new calc();
		ca.add(12, 20);
		ca.sub(11, 10);
		ca.pro(10, 3);
	}
}
