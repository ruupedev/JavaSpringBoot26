package domain;

public class Friend {

    private String firstname;
    private String lastname;

    public Friend(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Friend() {

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Friend [firstname=" + firstname + ", lastname=" + lastname + "]";
    }

}
