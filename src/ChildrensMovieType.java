
public class ChildrensMovieType extends Movie {

	public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    public double calculateRentalAmount(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3) {
            amount += (daysRented - 3) * 1.5;
        }
        return amount;
    }

}
