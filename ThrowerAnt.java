
public class ThrowerAnt extends Ants {
	
	public ThrowerAnt(int armor, int xcorr, int ycorr){
		super(2,xcorr, ycorr); //food cost is 2, armor is 2
		super.name="Thrower";
		super.damage = 2;
		super.cost = 2;
	}
	
	
	public String toString(){
		String ln1 = name + "\n";
		String ln2 = super.toString();
		return(ln1+ln2);}
}
