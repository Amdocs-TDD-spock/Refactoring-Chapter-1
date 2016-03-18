package bad.robot.refactoring.chapter1;

import static bad.robot.refactoring.chapter1.Movie.*;

/**
 * Created by marino on 3/18/16.
 */
public class NewReleasePrice extends Price {


    @Override
    PriceCode getPriceCode() {
        return PriceCode.NEW_RELEASE;
    }

    @Override
    double getPrice(int daysRented) {
        return daysRented * 3;
    }

}
