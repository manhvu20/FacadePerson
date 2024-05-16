package facadeperson;

public class PersonInfor {
    private final Person address;
    private final Person phone;
    private final Person name;
    
    public PersonInfor(String name, String phone, String address) {
        this.name = new Name(name);
        this.phone = new PhoneNum(phone);
        this.address = new Address(address);
    }
    
    public void displayPersonInfor(){
        System.out.println("\nPerson Information:");
        name.display();        
        phone.display();
        address.display();
    }
}

