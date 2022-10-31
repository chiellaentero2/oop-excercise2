public class Girlfriend extends Person {
	private String job;
	
	public Girlfriend(String name, int age, String nationality, String job) {
		super(name, age, nationality, Relationship.GIRLFRIEND);
		this.job = job;
		this.g = this;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public String greetings(Person p) {
		return "Hows your day, love? " + p.getName();
	}
}