package Test;
	
import java.util.ArrayList;
	
public class Test_res {
	
	// Разложение числа на простые множители
	public ArrayList<Integer> Decomposition( int y ) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		int x = y;
		double sqrt = Math.sqrt(x);
		int currentValue = x;
		int multiplier = 2;
		
		while (currentValue > 1 && multiplier <= sqrt)
			{
				if (currentValue % multiplier == 0)
					{
					// System.out.print(multiplier + " ");
					array.add(multiplier);
					currentValue /= multiplier;
					}
					
						else if (multiplier == 2)
						{
						multiplier++;
						}
						
					else
					{
					multiplier += 2;
					}
			}
			
				if (currentValue != 1)
				{
				//System.out.print(currentValue);
				array.add(currentValue);
				}
			
			if (currentValue == 1)
			{
			// System.out.print(currentValue);
			array.add(currentValue);
			}
			
			return array;
		}
}
