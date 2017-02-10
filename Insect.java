
public abstract class Insect{
	public int armor;
	public int xcorr; 
	public int ycorr;
	
	//Constructor
	public Insect(int armor, int xcorr, int ycorr){
		this.armor = armor;
		this.xcorr = xcorr;
		this.ycorr = ycorr;
	}
	
	//Method
	public int reduceArmor(int h){
		armor -=h;
		if (armor<=0){ //If armor of the insect is reduced to 0 or below
			//Move to grave yard
			xcorr=(-1);
			ycorr=(-1);
			}
		return armor;
	}
	
	public String toString(){
		String ln1 = "Insect\n";
		String ln2 = "Armor =" + armor +"\n";
		String ln3 = "Coordinates = ("+xcorr+","+ycorr+")\n";
		return(ln1+ln2+ln3);
	}
	
	public Boolean isAnt(){
		return false;}
}

