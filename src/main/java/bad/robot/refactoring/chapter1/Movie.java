package bad.robot.refactoring.chapter1;

public class Movie {

    public enum PriceCode {
        REGULAR,
        CHILDREN,
        NEW_RELEASE
    }

    private String title;
    private Price price;

    public Movie(String title, PriceCode priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public PriceCode getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(PriceCode priceCode) {
        switch (priceCode) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            case CHILDREN:
                price = new ChildrenPrice();
                break;
        }
    }

    public double getCharge(int daysRented) {
        return price.getPrice(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        // add bonus for a two day new release rental
        if (getPriceCode() == PriceCode.NEW_RELEASE && daysRented > 1)
            return 2;
        else
            return 1;
    }

}
