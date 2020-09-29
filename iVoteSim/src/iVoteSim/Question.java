/* Kevin Vong
 * CS 3560
 * 9/28/2020
 * Programming Assignment 1: Java-based Simulation tool based on live poll idea
 */
package iVoteSim;

public class Question {
	public int type;
	private int answer;
	
	Question(){
		
	}
	
	Question(int a){
		this.answer = a;
	}
	//returns candidate answer
	public int getAnswer() {
		return answer;
	}
	//sets candidate answer
	public void setAnswer(int a) {
		this.answer = a;
	}
	//override in MCQuestion and SCQuestion
	public int getType() {
		return type;
	}
}
