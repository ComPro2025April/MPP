package lesson3.lab.prob3;


import lesson3.lab.prob1.Person;

public class House extends Property {
	private double lotSize;
	private Address address;
	public Address getAddress() {
		return address;
	}
	public House(Address address, double lotSize) {
		this.address = address;
		this.lotSize = lotSize;
	}

	public double computeRent(){
		return 0.1 * lotSize;
	}
}
