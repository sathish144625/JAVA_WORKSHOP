public class Vehicle
{
int noofgear,petroltankcapacity,noofwheels,maxspeed;
String bikecolor;

public static void main(String[] args)
{
Vehicle scooty = new Vehicle();
scooty.noofgear=0;
scooty.petroltankcapacity=5;
scooty.noofwheels=2;
scooty.maxspeed=100;
scooty.bikecolor="blue";
System.out.println("\t\tSCOOTY");
System.out.println(" noofgear :"+ scooty.noofgear + "\n petroltankcapacity:"+ scooty.petroltankcapacity + "\n noofwheels:" +scooty.noofwheels +"\n maxspeed:"+scooty.maxspeed +" \n bikecolo:"+scooty.bikecolor);
System.out.println("*********************************************");
Vehicle r15 = new Vehicle();
r15.noofgear=6;
r15.petroltankcapacity=12;
r15.noofwheels=2;
r15.maxspeed=130;
r15.bikecolor="Black";
System.out.println("\t\tR15");
System.out.println(" noofgear :"+ r15.noofgear + "\n petroltankcapacity:"+ r15.petroltankcapacity + "\n noofwheels:" + r15.noofwheels +"\n maxspeed:"+ r15.maxspeed +" \n bikecolo:"+ r15.bikecolor);
}
}
	

