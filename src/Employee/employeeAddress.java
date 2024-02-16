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

}
