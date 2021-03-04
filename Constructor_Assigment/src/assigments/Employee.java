package assigments;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String email;
	private Project project;
	private Address presentAddress;
	private Address permanentAddress;
	
	
	
	public Employee(int id, String name, int age, String email, Project project, Address presentAddress,
			Address permanentAddress) {
		this(id,name,age, email);
		this.project = project;
		this.presentAddress = presentAddress;
		this.permanentAddress = permanentAddress;
	}

	public Employee(int id, String name, int age, String email) {
		this(id,name,age);
		this.email = email;
	}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Employee(int id, String name, int age) {
		this(id,name);
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() { 
		return email;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Address getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(Address presentAddress) {
		this.presentAddress = presentAddress;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", project=" + project
				+ ", presentAddress=" + presentAddress + ", permanentAddress=" + permanentAddress + "]";
	}
	
	
	
	
	
	

}
