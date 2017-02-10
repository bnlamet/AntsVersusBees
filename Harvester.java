
public class Harvester extends Ants{
	
	public Harvester(int armor, int xcorr, int ycorr){
		super(1,xcorr, ycorr); //armor is set to 1
		super.name="Harvester";
		super.cost=1;
		this.damage=0;
	}
	
	public String toString(){
		String ln1 = name + "\n";
		String ln2 = super.toString();
		return(ln1+ln2);}
	
	public int addFood(){
		return 1;
	}
}
