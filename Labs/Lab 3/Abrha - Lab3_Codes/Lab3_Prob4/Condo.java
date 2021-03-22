package Lab3_Prob4;

public class Condo extends Property{
int floorNumber;
Address address;
Condo(int numberOfFloor){
	this.floorNumber=numberOfFloor;
}
public int getNumberOfFloor() {
	return floorNumber;
}
public void setNumberOfFloor(int numberOfFloor) {
	this.floorNumber = numberOfFloor;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public double computeRent() {
	return 400*floorNumber;
}
}
