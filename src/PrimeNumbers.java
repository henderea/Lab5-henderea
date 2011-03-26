import java.util.ArrayList;


public class PrimeNumbers {

	public static ArrayList<Integer> generatePrimes(int n)
	{
		ArrayList<Integer> rval = new ArrayList<Integer>();
		if(n > 1)
		{
			rval.add(2);
		}
		return rval;
	}
}
