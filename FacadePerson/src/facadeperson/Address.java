package facadeperson;

public class Address implements Person{
    private final String address;

    public Address(String address) {
        this.address = address;
    }

    @Override
    public void display() {
        System.out.println("Address: " + address);
    }
}




