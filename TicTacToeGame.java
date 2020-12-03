import java.util.*;
import java.lang.*;

public class TicTacToeGame {

	public static void main(String[] args) {
		char[] board = createBoard();
                char computerLetter;
		Scanner userInput = new Scanner(System.in);
                char userLetter = chooseLetter(userInput);
                if(userLetter == 'X'){
		       computerLetter='O';
                }
                else if(userLetter == 'O'){
                       computerLetter= 'X';
                }
                else{
                	System.out.print("Enter only X or O");
                }
		showBoard(board);
	}
	//User Case1
	private static char[] createBoard() {
		char[] board = new char[10];
		for(int i=1; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}
	//User Case2
        private static char chooseLetter(Scanner userInput) {
                System.out.print("Enter your option between X or O- ");
                return userInput.next().charAt(0);
        }
	//User Case3
	private static void showBoard(char[] board) { 
		for(int i=1;i<10;i++) 
		{
		System.out.println(board[i] + "|" +board[i+1] + "|" +board[i+2] );
		}
	}
}
