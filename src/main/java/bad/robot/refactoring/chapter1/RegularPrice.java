package bad.robot.refactoring.chapter1;

/**
 * Created by marino on 3/18/16.
 */
public class RegularPrice extends Price {

    private static final double BASE_PRICE = 2;

    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    double getPrice(int daysRented) {
        double amount = BASE_PRICE;
        if (daysRented > 2)
            amount += (daysRented - 2) * 1.5;

        return amount;
    }

}
