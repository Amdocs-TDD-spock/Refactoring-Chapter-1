package bad.robot.refactoring.chapter1;

import static bad.robot.refactoring.chapter1.Movie.*;

/**
 * Created by marino on 3/18/16.
 */
public abstract class Price {

    abstract PriceCode getPriceCode();
    abstract double getPrice(int daysRented);

}
