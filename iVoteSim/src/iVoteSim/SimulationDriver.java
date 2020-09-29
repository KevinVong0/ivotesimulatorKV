/* Kevin Vong
 * CS 3560
 * 9/28/2020
 * Programming Assignment 1: Java-based Simulation tool based on live poll idea
 */
package iVoteSim;

public class SimulationDriver {

	public static void main(String[] args) {
		//single choice
		int random = (int)(Math.random() * 10 + 1); //random amount of students 1-10
		//random students + student ID of length 6
		Student[] stu = new Student[random];
		for (int i = 0; i < stu.length; i++) {
			stu[i] = new Student();
		}
		//random answer true/false
		for (int i = 0; i < stu.length; i++) {
			stu[i].setAnswer((int)(Math.random() * 2 + 1));
		}

		Question q;
		q = new SCQuestion();
		VotingService v = new VotingService(q,(int)(Math.random() * 2 + 1)); //random correct true/false
		v.tally(q, stu);
		
		//multiple choice
		int random2 = (int)(Math.random() * 5 + 1); //random amount of students 1-10
		//random students + student ID of 6 length
		Student[] stu2 = new Student[random2];
		for (int i = 0; i < stu2.length; i++) {
			stu2[i] = new Student();
		}
		//random answer A/B/C/D
		for (int i = 0; i < stu2.length; i++) {
			stu2[i].setAnswer((int)(Math.random() * 4 + 1));
		}

		Question q2;
		q2 = new MCQuestion();
		VotingService v2 = new VotingService(q2,(int)(Math.random() * 4 + 1)); //random correct answer
		v2.tally(q2, stu2);
	}
}
