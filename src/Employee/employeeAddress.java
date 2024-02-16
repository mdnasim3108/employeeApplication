package Employee;

public class employeeAddress extends Employee {
	
	int doorNo;
	String city;
	String Street;
	String country;
	String state;
	String pincode;

	public employeeAddress(Employee e,int doorNo,String city,String Street,String country,String state,String pincode) {
			super(e.getId(),e.getName(),e.getSalary(),e.getCurrCompany(),e.getPrevCompany());
			this.doorNo = doorNo;
			this.city = city;
			this.Street = Street;
			this.country = country;
			this.state = state;
			this.pincode = pincode;
	}

	public String toString(){

		return this.getName()+" "+this.getId()+" "+this.getSalary()+" "+this.getCurrCompany()+" "+this.getPrevCompany()+" "+doorNo+" "+city+" "+Street+" "+country+" "+pincode;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
}
