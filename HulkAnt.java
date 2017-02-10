public class HulkAnt extends Ants {
	//Extra Credit Ant
	public HulkAnt(int armor, int xcorr, int ycorr){
		super(10,xcorr, ycorr); 
		super.name="Hulk";
		super.damage = 5;
		super.cost = 10;
	}
	
	//This is a really strong ant that inflicts a lot of damage.
	public String toString(){
		String ln1 = name + "\n";
		String ln2 = super.toString();
		return(ln1+ln2);}
}
