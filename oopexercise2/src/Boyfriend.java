public class Boyfriend extends Person {
	private String job;
    private final Boyfriend b;
	
	public Boyfriend(String name, int age, String nationality, String job) {
		super(name, age, nationality, Relationship.BOYFRIEND);
		this.job = job;
		this.b = this;
	}
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	
	public String greetings() {
		return "It's okay love, I'm a little bit tired right now.";
	}
} 

