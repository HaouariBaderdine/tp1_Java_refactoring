
public class Tape extends DomainObject {
	
	private String _serialNumber;
	
	private Movie _movie;

	public Movie get_movie() {
		return _movie;
	}

	public void set_movie(Movie _movie) {
		this._movie = _movie;
	}

	public Tape(String serialNumber, Movie movie) {
		set_serialNumber(serialNumber);
		_movie = movie;
	}

	public String get_serialNumber() {
		return _serialNumber;
	}

	public void set_serialNumber(String _serialNumber) {
		this._serialNumber = _serialNumber;
	}
}
