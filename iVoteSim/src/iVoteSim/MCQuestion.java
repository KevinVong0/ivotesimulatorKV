/* Kevin Vong
 * CS 3560
 * 9/28/2020
 * Programming Assignment 1: Java-based Simulation tool based on live poll idea
 */
package iVoteSim;

public class MCQuestion extends Question{

	public MCQuestion() {
		super();
	}
	
	public int getType() { //return 2 if MC
		return 2;
	}
}
