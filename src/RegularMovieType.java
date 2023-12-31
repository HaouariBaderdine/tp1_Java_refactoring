
public class RegularMovieType extends Movie {

	public int getPriceCode() {
		return Movie.REGULAR;
	}

	public double calculateRentalAmount(int daysRented) {
		double amount = 2;
		if (daysRented > 2) {
			amount += (daysRented - 2) * 1.5;
		}
		return amount;
	}

}
