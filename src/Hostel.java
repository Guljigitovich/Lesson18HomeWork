import java.util.Arrays;

public class Hostel extends Housing implements PublicRent{


    public Hostel(String name, String address,int maxGuest) {
        super(name, address,maxGuest);
    }

    @Override
    public void rent() {

            System.out.println( "Pay a rent");
    }
}
