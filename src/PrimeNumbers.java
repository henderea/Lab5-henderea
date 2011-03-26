import java.util.ArrayList;


public class PrimeNumbers {

	public static ArrayList<Integer> generatePrimes(int n)
	{
		ArrayList<Integer> rval = new ArrayList<Integer>();
		if(n % 2 == 0)
		{
			rval.add(2);
			n /= 2;
		}
		if(n > 1)
		{
			rval.add(n);
		}
		return rval;
	}
}
