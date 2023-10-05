
public class NewReleaseMovieType extends Movie {

	public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double calculateRentalAmount(int daysRented) {
        return daysRented * 3;
    }

}
