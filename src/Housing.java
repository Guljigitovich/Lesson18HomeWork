import java.util.Arrays;

public abstract class Housing  {
    private String name;
    private String address;
    private int maxGuest;


    public Housing(String name, String address,int maxGuest) {
        this.name = name;
        this.address = address;
        this.maxGuest = maxGuest;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    @Override
    public String toString() {
        return " Housing{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", maxGuest=" + maxGuest +
                '}';
    }
}
