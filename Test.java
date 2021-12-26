class Car{
	public int gear;
	public int speed;
	public Car(int gear, int speed) {
		this.gear=gear;
		this.speed=speed;
		}
	 public void Brake(int decrement) {
		 speed-=decrement;
		 }
	 
	 public void Accelerator(int increment) {
		 speed+=increment;
		 }
	 
	 public String todispalyGearandSpeedofCar() {
		 return ("No of gears are:"+gear+"\n"+"speed of car is "+speed);
	 }
	      }

class LamboCar extends Car{
	
	public int height;
	public LamboCar(int gear, int speed, int startheight) {
		super(gear,speed);
		
		height=startheight;
	}
	
	public void setHeight(int newValue) {
		height=newValue;
	}
	
	public String todispalyGearandSpeedofCar() {
		return(super.todispalyGearandSpeedofCar()+"\nheightofcar is " + height);
	}
	
}




public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LamboCar obj=new LamboCar(7,217, 44);
		System.out.println(obj.todispalyGearandSpeedofCar());
		

	}

}
