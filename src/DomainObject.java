public class DomainObject {
	
	private String _name;
	
	public DomainObject(String name) {
		_name = name;
	};

	public DomainObject() {
		_name = "no name";
	};

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String toString() {
		return _name;
	};

}
