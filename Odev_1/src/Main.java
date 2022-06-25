import java.awt.*;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {

        Immutable ornek = new Immutable(2021,5,2500,Color.blue, Model.BMW, LocalDate.of(2020,10,14));

        System.out.println(ornek.getColor());
        System.out.println(ornek.getKm());
        System.out.println(ornek.getSeats());
        System.out.println(ornek.getYear());
        System.out.println(Model.BMW);
        System.out.println(ornek.getProduct_year());

    }
}
