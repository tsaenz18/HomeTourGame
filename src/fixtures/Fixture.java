package fixtures;

public abstract class Fixture {
	private String name;
	private String shortDescription;
	private String longDescription;
	
	public Fixture(String name, String shortDescription, String longDescription) {
		//System.out.println("Constructing a Room");
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public String getLongDescription() {
		return longDescription;
	}

}
