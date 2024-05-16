package facadeperson;

public class PhoneNum implements Person {
    private final String phone;

    public PhoneNum(String phone) {
        this.phone = phone;
    }

    @Override
    public void display() {
        System.out.println("Phone Number: " + phone);
    }
}

