package recursiveproduct;



import java.util.Scanner;

public class RecursiveProduct {

	
	public static int calculateProduct(int[] numbers, int index) {
		
		
		if (index == numbers.length - 1) {
			
			return numbers [index];
			
		}
		
		
		
		return numbers[index] * calculateProduct(numbers, index + 1);
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			
			
		}

	}


