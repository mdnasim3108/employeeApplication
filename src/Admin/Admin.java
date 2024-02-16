package Admin;

public class Admin {
	private int id;
	private String adminName;
	private String adminPassword;
	private String role;
	
	
	public Admin(int id, String adminName, String adminPassword, String role) {
		
		this.id = id;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.role = role;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAdminName() {
		return adminName;
	}


	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}


	public String getAdminPassword() {
		return adminPassword;
	}


	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
}
