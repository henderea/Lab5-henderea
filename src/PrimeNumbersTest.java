import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class PrimeNumbersTest
{
	@Test
	public void testOne()
	{
		assertEquals(new ArrayList<Integer>(), PrimeNumbers.generatePrimes(1));
	}
	
	public ArrayList<Integer> list(int... ints)
	{
		ArrayList<Integer> items = new ArrayList<Integer>();
		for(int i : ints)
		{
			items.add(i);
		}
		return items;
	}
}