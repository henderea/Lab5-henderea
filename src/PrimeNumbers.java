import java.util.ArrayList;


public class PrimeNumbers {

	public static ArrayList<Integer> generatePrimes(int n)
	{
		ArrayList<Integer> rval = new ArrayList<Integer>();
		for (int factor = 2; n > 1; factor++)
		{
			for(; n % factor == 0; n /= factor)
			{
				rval.add(factor);
			}
		}
		return rval;
	}
	
	public static ArrayList<Integer> listPrimes(int n)
	{
		
		return new ArrayList<Integer>();
	}
}
