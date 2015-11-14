
public class Car {

	public int CurrentGear;
	public int CurrentSpeed;
	public String Color;
	public String Brand;

	public void nextGear(){
		CurrentGear++;
	}
	
	public void setCurrentGear(int gear){
		CurrentGear = gear;
	}
	
	public int getCurrentGear(){
		return CurrentGear;
	}
	
	public void accelerate () {
		CurrentSpeed += 10;
	}
	
	public void accelerate (int speed) {
		CurrentSpeed += speed;
	}
}
