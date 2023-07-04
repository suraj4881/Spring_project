package in.demo.annotation;




public class Student {
    
	
	
	private Address address;

	
//	
//	public Student(int id, String name, Address address) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.address = address;
//	}



	public void setAddress(Address address) {
		this.address = address;
	}
	


	public Address getAddress() {
		return address;
	}

	
	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}





	
    
	

}
