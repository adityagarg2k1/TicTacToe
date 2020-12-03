import java.util.*;
import java.lang.*;

public class TicTacToeGame {

	public static void main(String[] args) {
		char[] board = createBoard();
                Scanner userInput = new Scanner(System.in);
                char userLetter = chooseBoard(userInput);
                if(userLetter = 'X')
                {       computerLetter="O";
                }
                else if(userLetter=="O")
                {        computerLetter="X";
                }
                else
                {
                System.Out.Print("Enter only X or O");
                }

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
        private static char chooseBoard(Scanner userInput) {
                System.out.print("Enter your option between X or O- ");
                return userInput.next.charAt(0);
        }
}
