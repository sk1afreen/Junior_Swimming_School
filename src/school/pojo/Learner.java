package school.pojo;


public class Learner {
	
	
	private int id;
	private String name;
	private String  gender;
	private int  age;
	private String phone;
	private int level;
	
	
	public Learner() {
		
	}
	public Learner(int id, String name, String gender, int age, String phone, int level) {
		
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.level = level;
	}
	
	public Learner(String name, String gender, int age, String phone, int level) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.level = level;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
	@Override
	public String toString() {
		return "Learner [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", phone=" + phone
				+ ", level=" + level + "]";
	}

	
	
	
	
}
