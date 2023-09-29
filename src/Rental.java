
public class Rental extends DomainObject {
	
	private int _daysRented;
	
	private Tape _tape;
	
	public Rental(Tape tape, int daysRented) {
		_tape = tape;
		_daysRented = daysRented;
	}

	public int get_daysRented() {
		return _daysRented;
	}

	public void set_daysRented(int _daysRented) {
		this._daysRented = _daysRented;
	}

	public Tape get_tape() {
		return _tape;
	}

	public void set_tape(Tape _tape) {
		this._tape = _tape;
	}
	
	

}
