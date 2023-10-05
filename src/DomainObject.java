public class DomainObject {
	
	private String name;
	
	public DomainObject(String name) {
		this.name = name;
	};

	public DomainObject() {
		name = "no name";
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	};

}
