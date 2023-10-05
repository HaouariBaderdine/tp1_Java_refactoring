import java.util.Enumeration;
import java.util.Vector;

public class Customer extends DomainObject {

    private Vector<Rental> _rentals = new Vector<Rental>();
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String statement() {
        return StatementGenerator.generateStatement(this);
    }

    // Getter for rentals
    public Enumeration<Rental> getRentals() {
        return _rentals.elements();
    }
}