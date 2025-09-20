package pack;

 class Example 
{
	// method overloading the following code is 
	/*
	public int add(int x,int y)
	{
		return (x+y);
	}
	public void add(int a,int b,int c)
	{
		System.out.println("The addition of a,b,c is"+(a+b+c));
	}
	public static void main(String[] args) {
		Example ex = new Example();
		
		ex.add(10,20, 30);
		System.out.println("The add is "+ex.add(10,20));
	}
*/
	//@override method 
	    int add(int a, int b) {
	        return (a + b);
	    }
	}

	class Ex extends Example {
	    @Override// it is optional but in this type of methods the return types of all the methods in super class and sub class must be same type
	    
	    int add(int a, int b) {
	        int result = super.add(a, b);
	        System.out.println("The addition of a,b is " + result);
	        return result;
	    }

	    public static void main(String[] args) {
	        Ex ex = new Ex();
	        int sum = ex.add(10, 20); // prints and returns
	        System.out.println("The add is " + sum);
	    }
	}