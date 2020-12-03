import java.util.*;
import java.lang.*;

public class TicTacToeGame {

	public static void main(String[] args) {
		char[] board = createBoard();

	}
	//User Case1
	public static char[] createBoard() {
		char[] board = new char[10];
		for(int i=1; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}

}
