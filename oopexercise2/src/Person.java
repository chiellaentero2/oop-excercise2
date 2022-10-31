   public abstract class Person {
	protected int age;
	protected String name, nationality;
	protected Relationship r;
	protected Girlfriend g;
	protected Boyfriend b;
	
	public enum Relationship {
		GIRLFRIEND,
		BOYFRIEND
	}
	
	public Person(String name, int age, String Nationality, Relationship r) {
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.r = r;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNationality() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Relationship getRelationship() {
		return r;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setRelationship(Relationship r) {
		this.r = r;
	}
	
	public String greetings(Person p) {
		return "null";
	}
	
	public String greetings() {
		return "null";
	}
} 

  

