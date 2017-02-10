
public class Queens extends Ants{
		//They have armor, xcorr, ycorr, and alive or not boolean
	public Boolean alive;
	
	public Queens(int xcorr, int ycorr){
		super(0,xcorr,ycorr); //armor, xcorr, ycorr
		this.alive = true;
		super.name = "Queen";
		this.damage=0;
	}
}
