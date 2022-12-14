import java.util.Objects;

public class PhoneBook {
    private String number;
    private String name;

    public PhoneBook(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phonebook = (PhoneBook) o;
        return Objects.equals(number, phonebook.number) && Objects.equals(name, phonebook.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
}
