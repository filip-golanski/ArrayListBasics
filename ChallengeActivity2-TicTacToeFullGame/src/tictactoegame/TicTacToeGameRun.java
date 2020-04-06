/** Challenge Activity 2 - complete the Tic-Tac-Toe game!
 * 
 * It's time to complete the tic tac toe game. Here's what you must do:
 * 
 *  In Board.java:
 *  - Implement the Full() method to detect when the board has no more empty spaces.
 * 
 *  Main()
 *  - Write main game loop. Here's the logic:
 * 
 *  while true:
 *      draw board
 *      get row and column as input for current player
 *      place a marker of the curren player at input row and col
 *      check for winner
 *      if winner or board full exit loop
 *      switch current player 
 * 
 *      After loop:
 *      draw board one more time
 *      display status (winner or tie)
 * 
 * 
 *  SAMPLE RUN:
 *  The best way to see a sample run it to open the solution file and execute it.
 *  (no peeking at the code!!!! vbg)
 * 
 */
package tictactoegame;

import java.util.Scanner;
import tictactoe.*;

public class TicTacToeGameRun {

	public static void main(String[] args) {
		Board b = new Board(); 
		int row, col;
		boolean winner = false;
		Scanner input = new Scanner(System.in);
		Marker currentPlayer = Marker.X;
		System.out.printf("Let's Play Tic-Tac-Toe!!!\n\n");
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			// Draw Board
			b.Draw();
			// Get input for row and column
			
			System.out.println("Player "+currentPlayer+": Row? [0,1,2]");
			row = sc.nextInt();
			System.out.println("Player "+currentPlayer+": Column? [0,1,2]");
			col = sc.nextInt();
			
			// place marker of current player on board at row and col            
			b.Place(currentPlayer, row, col);
			// check for winner, 
			// exit loop if winner or board full
			if (b.Winner(Marker.X) || b.Winner(Marker.O))
				winner = true;
			
			if (b.Full() || winner)
				break;
			// Switch Players
			if(currentPlayer==Marker.X)
				currentPlayer = Marker.O;
			else
				currentPlayer = Marker.X;
		}
		sc.close();
		//draw board one last time
		b.Draw();
		// check again for winner, if not it's a tie.
		if (winner) {            
			System.out.printf("GAME OVER. %s WINS!\n", currentPlayer);
		} else {
			System.out.printf("GAME OVER. It's a TIE!\n");
		}

	}
}
