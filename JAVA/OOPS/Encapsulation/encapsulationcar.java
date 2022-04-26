public class encapsulationcar    //ex1
{
private int noofgear,model,noofwheels,maxspeed;
private String carcolor;

public void setnoofgear(int gear)
{

	noofgear = gear;
	System.out.println("NO OF GEARS  : " + noofgear);

}
public void setmodel(int m)
{

	model = m;
	System.out.println("model  : " + model);
}
public void setnoofwheels(int wheels)
{

	noofwheels = wheels;
	System.out.println("noofwheels  : " + noofwheels);
}
public void setmaxspeed(int speed)
{

	maxspeed = speed;
	System.out.println("maxspeed : " + maxspeed);
}
public void setcarcolor(String color)
{

	carcolor = color;
	System.out.println("carcolor : " + carcolor);
}



public static void main(String[] args)
{
	encapsulationcar car = new encapsulationcar();
	car.setnoofgear(5);
	car.setmodel(2021);
	car.setnoofwheels(4);
	car.setmaxspeed(150);
	car.setcarcolor("white");
}

}
	

