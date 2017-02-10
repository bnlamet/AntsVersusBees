
public abstract class Ants extends Insect{
	public int damage;
	public int food;
	public String name;
	public int cost;
	
	public Ants(int armor, int xcorr, int ycorr){
		super(armor, xcorr, ycorr);
	}
	
	public Boolean isAnt(){
		return true;
	}
	
	public int throwsAt(Bees b){
		b.reduceArmor(damage);
		return armor;
	}
	
	public int addFood(){
		return 0;
	}
}
