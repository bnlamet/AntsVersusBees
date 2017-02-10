import java.util.Scanner;
import java.util.Random;

//This is the game board matrix
public class Colony {
	public char hive;
	public char[][] board; //character array representing insects
	public Queens[] queens;
	
	//Constructing Colony is constructing game board
	public Colony(){
		//Ask user what size/difficulty game board they want
		String mode;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Select Difficulty: (Easy, Medium, Hard, or Custom)\n");
		mode = scanner.next();
		//scanner.close(); //we don't want this to be closed yet because we need inputs later.
		switch(mode.toLowerCase()){
		case "easy": board = new char[6][6]; break;
		case "medium": board = new char[5][5]; break;
		case "hard" : board = new char[4][4]; break;
		case "custom": scanner = new Scanner(System.in);
			System.out.println("Please enter size:");
			int size=ParseInt(scanner.nextLine());
			this.board=new char[size][size];
			break;
		}
		
		//Set coordinates of hive randomly and place it on the board.
		Random r = new Random();
		int x = r.nextInt(board.length); //random height
		int y = board.length; //hive is always in the rightmost column
		hive = new Insect(0,x,y); //place the hive at that location
		board[x][y]=hive;
		
		//Fill the left-most column with Queens
		queens = new Queens[board.length]; //new array of queens, all with ycorr=0
		int i=0;
		while(i<board.length){
			queens[i]=new Queens(0,i); //initialize to alive
			board[i][0]='q'; //put the queens on the left of the board
		} //ends while
	} //ends colony

	private int ParseInt(String nextLine) {
		// TODO Auto-generated method stub
		return 0;
	}
	
} //ends class
