import java.util.ArrayList;


public class PrimeNumbers {

	public static ArrayList<Integer> generatePrimes(int n)
	{
		ArrayList<Integer> rval = new ArrayList<Integer>();
		for (int factor = 2; n > 1; factor++)
		{
			while (n % factor == 0)
			{
				rval.add(factor);
				n /= factor;
			}
		}
		
		if(n > 1)
		{
			rval.add(n);
		}
		return rval;
	}
}
