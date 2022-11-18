import java.util.Arrays;

public class Hotel extends Housing implements PublicRent {


    public Hotel(String name, String address,int maxGuest) {
        super(name, address,maxGuest);
    }

    @Override
    public void rent() {

            System.out.println("Pay a rent");
        }

}
