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
			
			
			int[] numbers = new int[5];
			
			
			
			System.out.println("Please eneter five numbers: ");
			
			
			for (int i = 0; i< numbers.length; i++) {
				
				System.out.print("Number " + (i + 1) + ": ");
				numbers[i] = input.nextInt();
				
				
				
				
			}
			
			
			
			int product = calculateProduct(numbers, 0);
			
			
			
			
			System.out.println("\nThe product of the five numbers is: " + product);
			
			
			input.close();
		}

	}


