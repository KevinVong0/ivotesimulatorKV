/* Kevin Vong
 * CS 3560
 * 9/28/2020
 * Programming Assignment 1: Java-based Simulation tool based on live poll idea
 */
package iVoteSim;

public class VotingService {
	
	private int[] studentAnswers;
	private int correctAnswer;
	private int qType;
	//initialize with question and candidate answer
	public VotingService(Question q, int a) {
		this.qType = q.getType();
		this.correctAnswer = a;
	}
	//pass student array and uses getAnswer() and puts into an array then tallys it
	public void tally(Question q, Student[] students) {
		studentAnswers = new int[students.length];
		for (int i = 0; i < students.length;i++) {
			studentAnswers[i] = students[i].getAnswer();
		}
		if (qType == 1) { //check if single choice
			int t = 0; //true
			int f = 0; //false
			for (int i = 0; i < studentAnswers.length;i++) {
				if (studentAnswers[i] == 1) {
					t++;
				}
				else {
					f++;
				}
			}
			if (correctAnswer == 1) 
				System.out.println("Correct Answer: True");
			else
				System.out.println("Correct Answer: False");
			System.out.println("True: " + t);
			System.out.println("False: " + f);
			System.out.println("Total Participants: " + students.length);
		}
		if (qType == 2) { //check if multiple choice
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			for (int i = 0; i < studentAnswers.length;i++) {
				if (studentAnswers[i] == 1) {
					a++;
				}
				if (studentAnswers[i] == 2) {
					b++;
				}
				if (studentAnswers[i] == 3) {
					c++;
				}
				if (studentAnswers[i] == 4) {
					d++;
				}
			}
			if (correctAnswer == 1) 
				System.out.println("Correct Answer: A");
			if (correctAnswer == 2) 
				System.out.println("Correct Answer: B");
			if (correctAnswer == 3) 
				System.out.println("Correct Answer: C");
			if (correctAnswer == 4) 
				System.out.println("Correct Answer: D");
			System.out.println("A: " + a);
			System.out.println("B: " + b);
			System.out.println("C: " + c);
			System.out.println("D: " + d);
			System.out.println("Total Participants: " + students.length);
		}
	}
}
