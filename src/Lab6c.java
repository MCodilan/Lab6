import java.util.Scanner;
/**
 *Name: Mihailo Codilan
 *Teacher: Mr.Hardman
 *Assignment Lab 6, Program #3
 *December 15th, 2016
 */
public class Lab6c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		int userNumber;
		boolean prime;
		
		System.out.println("Please enter a number. I will dictate wether the number is a prime or not.");
		userNumber = userInput.nextInt();
		prime = isPrime(userNumber);
	
		
		if(prime == false){
			System.out.println("Your Number is not Prime");
		} else {
			System.out.println("Your number is Prime");
		}
		userInput.close();
	}

	/**
	 * @isPrime will indicate whether or not, the numerical value is a prime
	 * 
	 * @param Parameters include userNumber
	 * 
	 * @return Returns the integer value of 'isPrime'
	 */
	public static boolean isPrime(int userNumber)	{
		boolean prime = true;
		
		for(int i = 2; prime && i <= Math.sqrt(userNumber); i++){
		
			if(userNumber % i == 0){
				
				prime = false;
				
			}
			
			else{
				
				prime = true;
				
			}
			
		}

		return (prime);
		
	}
	
}
