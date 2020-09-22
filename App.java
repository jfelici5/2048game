import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App extends GameBoard
{
    
    public App(int N, int target) {
        super(N, target);
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args)
    {
     GameBoard game = new GameBoard(4, 2048);
     System.out.println("***************** INSTRUCTIONS **********************");
     System.out.println("1. The game begins with a 4x4 matrix, with all zeroes except one. When atleast one tile has 2048 value, the player wins.");
     System.out.println("2. The player is allowed 4 different types of moves : left, right, up or down. The move has to be typed in as string on the console. Enter \"exit\" to exit the game.");
     System.out.println();
     System.out.println("******************** START *************************");
     game.printBoard();
     BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = bufferRead.readLine();
			while (input != null){
                boolean movePossible = false;
                System.out.println("The largest value is " + findMax(board));
				if(input.equalsIgnoreCase("a")){
                    movePossible = game.left();
                    if(movePossible){
                        steps++;
                    }
                    System.out.println("Total valid moves: " + steps);
				}else if(input.equalsIgnoreCase("d")){
                    movePossible = game.right();
                    if(movePossible){
                        steps++;
                    }
                    System.out.println("Total valid moves: " + steps);
				}else if(input.equalsIgnoreCase("w")){
                    movePossible = game.up();
                    if(movePossible){
                        steps++;
                    }
                    System.out.println("Total valid moves: " + steps);				
                }else if(input.equalsIgnoreCase("s")){
                    movePossible = game.down();
                    if(movePossible){
                        steps++;
                    }
                    System.out.println("Total valid moves: " + steps);				}else if(input.equalsIgnoreCase("exit")){
					System.out.println("*************** Exiting the Game! ************");
					break;
				}else {
					System.out.println("Invalid input! Enter move again.");
					game.printBoard();
					input = bufferRead.readLine();
					continue;
				}
				System.out.println("*********************************************");
				if(movePossible){
					game.addNewNumber();
				}
				game.printBoard();
				if(game.isWin()){
					System.out.println("****************** WIN **********************");
					break;
				}else if(game.isFull() && !game.canMove()){
					System.out.println("****************** GAME OVER! LOST! **********************");
					break;
				}
				input = bufferRead.readLine();
			}
			game.printBoard();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
    }
}