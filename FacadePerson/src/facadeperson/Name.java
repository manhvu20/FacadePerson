package facadeperson;

public class Name implements Person {
    private final String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
    }
}

