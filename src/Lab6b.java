import java.util.Scanner;
/**
 *Name: Mihailo Codilan
 *Teacher: Mr.Hardman
 *Assignment Lab 6, Program #2
 *December 13th, 2016
 */
public class Lab6b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		double[] student1 = {56.2, 65.7, 45.32, 89.213, 65, 76, 54, 98, 45, 87.2};
		
		double[] student2 = new double[10];

		double average1;
		double average2;
		
		System.out.println("Please enter ten marks to be averaged:");
		
		for(int i = 0; i < student2.length; i++){
			System.out.print("Please enter a mark: ");
			student2[i] = userInput.nextDouble();
		}
		
		average1 = calcAverage(student1);
		average2 = calcAverage(student2);
		
		if(average2 > average1){
			
			System.out.println("Your average is greater than student 1's by " + (average2 - average1) + " points.");
			
		} else if(average2 < average1){
			
			System.out.println("Your average is less than student 1's by " + (average1 - average2) + " points.");
			
		} else {
			
			System.out.println("Your average is equal to student 1's.");
			
		}
		
		userInput.close();
		

	}
	
	 /**
     * calcAverage will calculate the average of student's marks.
     *
     * @param Parameters include the marks array
     * 
     * @return it will return a double value of user marks.
     */
	public static double calcAverage( double[] marks ){
		
	
		
		double sum = 0;
		double average = 0;
		
		for(int i = 0; i < marks.length; i++){
			sum += marks[i];
		}
		
		average = sum / marks.length;
		
		sum = 0;
		
		return average;
		
	}
	
}
