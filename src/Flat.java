import java.util.Arrays;

public class Flat extends Housing implements PublicService{


    public Flat(String name, String address,int maxGuest) {
        super(name, address,maxGuest);
    }

    @Override
    public void service() {
                System.out.println("Pay a utility bill");
    }
}
