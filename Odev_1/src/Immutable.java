import java.time.LocalDate;
import java.awt.Color;

 final class Immutable {

    private final int year;
    private final int seats;
    private final LocalDate product_year;
    private final int km;
    final Color color;
    private Model model;


    public Immutable(int year, int seats, int km, Color color, Model model,LocalDate product_year) {

        this.year = year;
        this.seats = seats;
        this.product_year = product_year;
        this.km = km;
        this.color = color;
        this.model = model;

    }

    public int getYear() {
        return year;
    }

    public int getSeats() {
        return seats;
    }

    public LocalDate getProduct_year() {
        return product_year;
    }

    public int getKm() {
        return km;
    }

    public Color getColor() {
        return color;
    }

}




