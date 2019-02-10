package tictactoe;

import java.util.Random;

/**
 * AiPlayer.java (Tic-Tac-Toe Eclipse Project)
 * 
 * by: Joel Fischer
 */


/**
 * An entity AiPlayer that is a player but chooses its
 * move to play through an algorithm that is fairly smart.
 * 
 * @author jfischer
 */
public class AiPlayer {

	//private static char[] board;//The game board{ '\0', '\0', 'o', '\0', '\0', '\0','\0', '\0', '\0' }
	int scale;
	/**
	 * AiPlayer constructor
	 * 
	 * @param mark This player's mark
	 * @param playerNum This player's number (1 or 2)
	*/
	public AiPlayer(char[] board,int scale) {
		//super(mark, playerNum);
		//Set the other player's mark as well
                /*
                board 
		if(mark == 'X')
			this.otherMark = 'O';
		else
			this.otherMark = 'X';*/
                //this.board=board ;
                //for(int i=0;i<this.board.length;i++)
                // System.out.print(this.board[i]+",,");
                this.scale=scale;
	}
 
	/**
	 * Overridden function. Implements the algorithm for the AI to choose its move.
	 */
	//@Override
	public static int getMoveAi(char[] board,int scale) {
		//Create a copy of the main board for this algorithm's use
		//this.board= 
		int move = 0;
                
		//Set types of positions (used for prioritizing move choice)
		int[] corners = new int[] {0, 2, 6, 8};
		int[] sides = new int[] {1, 3, 5, 7};
		
		//BoardGui.playerMark = this.getMarker();
		
		//Test if the AI can win in this next turn
		for(move=0; move<scale; move++){
			//Check if the slot is empty
			if('\0'==board[move]){
				//Test if filling the slot will cause this player to win
				if(isWinnerWithAi('o', move, board))
					return move; //If it does, return the move
			}
		}
		
		//Test if the player can win in the next move and block
		for(move=0; move<scale; move++){
			//Check if the slot is empty
			if('\0'==board[move]){
                            //System.out.println(move);
				//Test if filling the slot with the opponents mark will cause him to win
				if(isWinnerWithAi('x', move, board))
					return move; //If it does, block him with our mark
			}
		}
		
		//Test if any corners are open (in general they are better than center or sides)
		move = randomFromArrayAi(corners, board); //Pick a random corner
		if(move != -1)
			return move;
		
		//Test if the center is open (in general better than sides)
		if('\0'==board[4]){
			move = 4; //I know I could just return 4, but I'd rather use move
			return move;
		}
		
		//Test if any sides are open (last option)
		move = randomFromArrayAi(sides, board); //Pick a random side
		if(move != -1)
			return move;
		
		//There's nothing open...we should never reach this point (World should have realized
		//this earlier)
		return -1;
	}
	
	/**
	 * Check and see if the mark can become a winner with any possible move
	 * 
	 * @param mark The mark to check
	 * @param slot The slot to check
	 * @return win BOOLEAN: True if it creates a winner
	 */
	private static boolean isWinnerWithAi(char mark, int slot,char[] board) {
		//Create ANOTHER copy of the board, so we don't mess up the copy of the master
		char[] tempBoard = new char[9];
		for (int i=0; i<9; i++)
			tempBoard[i] = board[i];
		
		//Set the mark into the slot on the board
		tempBoard[slot] = mark;
		//Call the World function to test for a winner with this configuration
		boolean win = isWinnerAi(mark, tempBoard);
		return win; //Return the result
	}
        public static boolean isWinnerAi(int mark, char[] tb){
		//Return true if any case causes a winner
		return ((tb[0] == mark && tb[1] == mark && tb[2] == mark) || //Across Top
				(tb[3] == mark && tb[4] == mark && tb[5] == mark) || //Across Mid
				(tb[6] == mark && tb[7] == mark && tb[8] == mark) || //Across Bottom
				(tb[0] == mark && tb[3] == mark && tb[6] == mark) || //Down Left
				(tb[1] == mark && tb[4] == mark && tb[7] == mark) || //Down Mid
				(tb[2] == mark && tb[5] == mark && tb[8] == mark) || //Down Right
				(tb[0] == mark && tb[4] == mark && tb[8] == mark) || //Diag TL -> BR
				(tb[2] == mark && tb[4] == mark && tb[6] == mark)    //Diag TR -> BL
				);
	}
	
	/**
	 * Pick a random value from a 4 slot array
	 * 
	 * @param list The array to pick from
	 * @return The selection
	 */
	private static int randomFromArrayAi(int[] list,char[] board)
        {        // System.out.println("rrrrr");
		int[] okMoves = new int[4]; //List of moves that are not already filled
		int move = -1;
		Random choose = new Random(); //Create a new random number generator
		
		//Run through each member of the list and test it to see if it is usable.
		//If it is, put it into the list of ok moves. If it is not, put -1 in its place (NOK)
		for(int i=0; i<4; i++)
                {
			//Test if it's free
			if(isFreeAi(list[i], board))
				//It is, put it in the ok list
                        { //  System.out.println(board[i]+"ggggg"+list[i]);
				okMoves[i] = list[i];
                        }
			//It is not, put -1 in its place
			else
				okMoves[i] = -1;
		}
		
		//Brute force check to make sure there is at least one valid value
		if(okMoves[0] == -1 && okMoves[1] == -1 && okMoves[2] == -1 && okMoves[3] == -1){
			return -1; //If there isn't, return a bad status
		//If there is at least one valid value
		} else {
			//Brute force until we get a choice that's not -1.
			do{
				move = choose.nextInt(okMoves.length);
			} while(okMoves[move] == -1);
			return okMoves[move]; //Return the valid move
		}
	}
        public static boolean isFreeAi(int move,char[] board){
		char[] tempBoard = board;
		//If the space is empty, return true
		if('\0'==tempBoard[move]){
			return true;
		}
		else{
			return false;
		}
	}
}
