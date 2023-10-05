
public abstract class Movie extends DomainObject {

	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	public abstract int getPriceCode();
    public abstract double calculateRentalAmount(int daysRented);


}
