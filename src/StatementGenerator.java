import java.util.Enumeration;

public class StatementGenerator {
	public static String generateStatement(Customer customer) {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration<Rental> rentals = customer.getRentals();
		String result = "Rental Record for " + customer.getName() + "\n";

		while (rentals.hasMoreElements()) {
			Rental each = rentals.nextElement();
			Movie movie = each.getTape().getMovie();
			double thisAmount = movie.calculateRentalAmount(each.getDaysRented());
			totalAmount += thisAmount;
			frequentRenterPoints++;
			if ((movie.getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1) {
				frequentRenterPoints++;
			}
			result += "\t" + each.getTape().getMovie().toString() + "\t" + String.valueOf(thisAmount) + "\n";
		}

		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
		return result;
	}
}
