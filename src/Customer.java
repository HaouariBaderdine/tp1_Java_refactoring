import java.util.Enumeration;
import java.util.Vector;

public class Customer extends DomainObject {

	public Customer(String name) {
		set_name(name);
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "Rental Record for " + toString() + "\n";
		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = rentals.nextElement();
			// determine amounts for each line
			switch (each.get_tape().get_movie().get_priceCode()) {
			case Movie.REGULAR:
				thisAmount += 2;
				if (each.get_daysRented() > 2)
					thisAmount += (each.get_daysRented() - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				thisAmount += each.get_daysRented() * 3;
				break;
			case Movie.CHILDRENS:
				thisAmount += 1.5;
				if (each.get_daysRented() > 3)
					thisAmount += (each.get_daysRented() - 3) * 1.5;
				break;
			}
			totalAmount += thisAmount;
			// add frequent renter points
			frequentRenterPoints++;
			// add bonus for a two day new release rental
			if ((each.get_tape().get_movie().get_priceCode() == Movie.NEW_RELEASE) && each.get_daysRented() > 1)
				frequentRenterPoints++;
			// show figures for this rental
			result += "\t" + each.get_tape().get_movie().toString() + "\t" + String.valueOf(thisAmount) + "\n";
		}
		// add footer lir lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + "frequent renter points";

		return result;
	}

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	private Vector<Rental> _rentals = new Vector<Rental>();

}
