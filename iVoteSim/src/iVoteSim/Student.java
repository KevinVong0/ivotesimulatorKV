/* Kevin Vong
 * CS 3560
 * 9/28/2020
 * Programming Assignment 1: Java-based Simulation tool based on live poll idea
 */
package iVoteSim;

import java.util.*;

public class Student {

	private String ID;
	private int answer;

	Student(String id) {
		this.ID = id;

	}
	//random student id
	Student() {
		String numbers = "1234567890";
		StringBuilder sb = new StringBuilder();
		Random r = new Random();
		while (sb.length() < 6) { // length of the random string.
			int index = (int) (r.nextFloat() * numbers.length());
			sb.append(numbers.charAt(index));
			}
			String randomID = sb.toString();
			ID = randomID;
	}
	//use getID to compare student string in order to change answer
	public String getID() {
		return ID;
	}
	//sets student's id
	public void setID(String id) {
		this.ID = id;
	}
	//sets student's answer
	public void setAnswer(int a) {
		this.answer = a;
	}
	//returns student's answer
	public int getAnswer() {
		return answer;
	}
}
