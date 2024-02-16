package Employee;

public class Employee {
	
	private final int id;
	private final String name;
	private int salary;
	private String currCompany;
	private String PrevCompany;
	public Employee(int id, String name, int salary, String currCompany, String prevCompany) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.currCompany = currCompany;
		PrevCompany = prevCompany;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCurrCompany() {
		return currCompany;
	}
	public void setCurrCompany(String currCompany) {
		this.currCompany = currCompany;
	}
	public String getPrevCompany() {
		return PrevCompany;
	}
	public void setPrevCompany(String prevCompany) {
		PrevCompany = prevCompany;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	

}
