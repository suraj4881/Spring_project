package in.demo.annotationautowirid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	@Autowired
	@Qualifier("ad2")
	private Address address;

//	public Student(Address address) {
//		super();
//		this.address = address;
//	}
	
	

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	






	
	
	
	
}
