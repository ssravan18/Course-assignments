package assign;

public class Associate {
	int id, Experience;
	String name, Technology;
	
	public Associate(int id, String name, String Technology, int Experience) {
		this.id = id;
		this.name = name;
		this.Technology = Technology;
		this.Experience = Experience;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	public int getid() {
		return id;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	
	public void setTechnology(String tech) {
		this.Technology = tech;
	}
	public String getTechnology() {
		return Technology;
	}
	
	public void setExperience(int exp) {
		this.Experience = exp;
	}
	public int getExperience() {
		return Experience;
	}
	
}
