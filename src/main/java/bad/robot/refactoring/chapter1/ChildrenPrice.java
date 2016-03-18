package bad.robot.refactoring.chapter1;

/**
 * Created by marino on 3/18/16.
 */
public class ChildrenPrice extends Price {

    private static final double BASE_PRICE = 1.5;

    @Override
    int getPriceCode() {
        return Movie.CHILDREN;
    }

    @Override
    double getPrice(int daysRented) {
        double amount = BASE_PRICE;
        if (daysRented > 3)
            amount += (daysRented - 3) * 1.5;

        return amount;
    }

}
