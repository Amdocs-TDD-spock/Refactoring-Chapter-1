package bad.robot.refactoring.chapter1;

/**
 * Created by marino on 3/18/16.
 */
public class NewReleasePrice extends Price {


    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getPrice(int daysRented) {
        return daysRented * 3;
    }

}
