package bad.robot.refactoring.chapter1;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        String result = "Rental record for " + getName() + "\n";
        for (Rental rental : rentals) {
            // show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf( rental.getCharge() ) + "\n";
        }

        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) + " frequent renter points";

        return result;
    }

    public String htmlStatement() {
        StringBuilder builder = new StringBuilder();
        builder.append("<h1>Rental record for <strong> ").append(getName()).append(" </strong> </h1> <p>");
        for(Rental rental : rentals) {
            builder.append(rental.getMovie().getTitle()).append(" : ").append(rental.getCharge()).append(" </p> <br/>");
        }
        builder.append("Account owed is ").append("<strong>").append(getTotalCharge()).append("</strong> <br />");
        builder.append("You earned ").append(getFrequentRenterPoints()).append(" frequent renter points");

        return builder.toString();
    }

    public int getFrequentRenterPoints() {
        int result = 0;
        for(Rental rental : rentals) {
            result += rental.getFrequentRenterPoints();
        }
        return result;
    }

    public double getTotalCharge() {
        double result = 0;
        for(Rental rental : rentals) {
            result += rental.getCharge();
        }
        return result;
    }

}
