package Day5OfJavaProgramming;//this is user defined exception do the super class of any exception is exception

public class InvalidWithDrawException extends Exception
{
	private double wd;
	
	InvalidWithDrawException(double wd)
	{
		this.wd = wd;
	}
	@Override
	public String toString() {
		return "InvalidWithDrawException [wd=" + wd + "]";
	}
}
