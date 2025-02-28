package TheKiranAcademy5;
import java.util.Scanner;
public class armstrongnum {
	
public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);

	    
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	       
	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }

	      
	        scanner.close();
	    }

	    
	    public static boolean isArmstrong(int number) {
	        int originalNumber = number;
	        int numOfDigits = String.valueOf(number).length(); 
	        int sum = 0;

	     
	        while (number != 0) {
	            int digit = number % 10;
	            sum += Math.pow(digit, numOfDigits); 
	            number /= 10; 
	        }

	       
	        return originalNumber == sum;
	    }
	}


