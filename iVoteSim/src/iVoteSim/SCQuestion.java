/* Kevin Vong
 * CS 3560
 * 9/28/2020
 * Programming Assignment 1: Java-based Simulation tool based on live poll idea
 */
package iVoteSim;

public class SCQuestion extends Question {
	
	public SCQuestion() {
		super();
	}
	
	public int getType() { //return 1 if SC
		return 1;
	}
}
