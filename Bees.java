
import java.util.Random;

public class Bees extends Insect {
	private String name;
	public int spawnx; 
	
	public Bees(int armor, int xcorr, int ycorr){
		super(armor, xcorr, ycorr);
		this.name = "Bee";
		this.spawnx=xcorr;
	}
	
	public int sting(Ants a){
		a.reduceArmor(1);
		game.getAnt(xcorr,ycorr).throwsAt(this);
		return armor;
	}
	
	public void moveBee(){
		//Bee moves if it isn't already in queen row or in the last row of colony matrix
		Random r = new Random();
		int move = r.nextInt(3);
		
		//If the bees are at the hive, they only move up or down from the hive
		if(xcorr==spawnx){
			move = r.nextInt(2);
			switch(move){
			case 0: ycorr--; break; //up
			case 1: ycorr++; break; //down
			}
		}
		else{
			switch(move){
			//Bees can only move forward toward queens, one space at a time
				case 0: xcorr--; break; //left
				case 1: xcorr--; ycorr--; break; //left & up
				case 2: xcorr--; ycorr++; break; //left & down
			}
		}
		//If the ant is a queen, change boolean to dead.
		if (gameBoard[xcorr][ycorr]=='q'){
			sting(game.getQueen(xcorr,ycorr));
			//We decided bees die after they kill queens
			this.armor=-1;
			this.xcorr=-1; this.ycorr=-1; //move to grave yard
		}

		if (gameBoard[xcorr][ycorr]=='a'){ //If there is an ant in that spot, sting it
			sting(game.getAnt(xcorr,ycorr));
			//call sting with that ant
		}
		
		if(xcorr==0){
			//If a bee makes it to an empty queen space
			//It can't move just up or down, so it can't kill anything else
			//So it dies automatically.
			xcorr=-1;ycorr=-1;
		}
		
	}
	
	public String toString(){
		String ln1 = name + "\n";
		String ln2 = super.toString();
		return(ln1+ln2);
	}
}
