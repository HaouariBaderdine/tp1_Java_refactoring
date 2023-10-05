
public class Tape extends DomainObject {
	
	private String serialNumber;
	
	private Movie movie;

	public Tape(String serialNumber, Movie movie) {
		setSerialNumber(serialNumber);
		this.movie = movie;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Movie getMovie() {
		// TODO Auto-generated method stub
		return this.movie;
	}
	
	
    
}
