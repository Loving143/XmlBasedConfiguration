package beans;

public class Student {
	
	private String name;
	private String address;
	private String age;
	
	public void getDetails() {
		System.out.println("The details of the Student are : \n"+"Name "+this.name+"adress "+this.address);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	

}
