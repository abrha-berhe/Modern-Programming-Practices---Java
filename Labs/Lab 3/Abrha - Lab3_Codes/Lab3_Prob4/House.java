package Lab3_Prob4;

public class House extends Property {
double lotSize;
Address address;
House(double lotSize){	
	this.lotSize=lotSize;
}
public double getLotSize() {
	return lotSize;
}
public void setLotSize(double lotSize) {
	this.lotSize = lotSize;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public double computeRent() {
	return 0.1*lotSize;
}
}
