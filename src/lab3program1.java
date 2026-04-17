import java.util.Scanner;

public class lab3program1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	    // user input
	    System.out.print("Attention! The full marks for each assessment is 100.\n\n");
	    System.out.print("Matric: ");
	    String matric = input.next();

	    System.out.print("Enter marks for Assessment 1: ");
	    double asessment1 = input.nextDouble();
	    System.out.print("Enter marks for Assessment 2: ");
	    double aasessment2 = input.nextDouble();
	    System.out.print("Enter marks for Lab Assignment: ");
	    double lab = input.nextDouble();
	    System.out.print("Enter marks for Final Exam: ");
	    double finalexam = input.nextDouble();

	    // score
	    double asessment1score = asessment1 * 0.15;
	    double asessment2score = aasessment2 * 0.20;
	    double labscore = lab * 0.35;
	    double finalexamscore = finalexam * 0.30;
	    double totalscore = asessment1score + asessment2score + labscore + finalexamscore;

	    //print
	    System.out.printf("\nYour overall marks for CCS3100 (%.2f+%.2f+%.2f+%.2f) is %.2f", 
	    		asessment1score, asessment2score, labscore, finalexamscore, totalscore);
	}

}
