public class Passport {
    private long numPassport;
    private String lastName;
    private String firstName;
    private String midlName;
    private String birthday;

    public Passport(long numPassport, String lastName, String firstName, String midlName, String birthday) {
        this.numPassport = numPassport;
        if (lastName != null && !lastName.isEmpty() && !lastName.isBlank()) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException();
        }
        if (firstName != null && !firstName.isEmpty() && !firstName.isBlank()) {
            this.firstName = firstName;
        }
        this.midlName = midlName;
        if (birthday != null && !birthday.isEmpty() && !birthday.isBlank()) {
            this.birthday = birthday;
        }
    }

    public long getNumPassport() {
        return numPassport;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMidlName() {
        return midlName;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "numPassport=" + numPassport +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", midlName='" + midlName + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
