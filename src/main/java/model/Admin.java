package model;

public class Admin extends Person{
    private UserType userType = UserType.ADMIN;

    public Admin(String firstName, String lastName, String password, String email) {
        super(firstName, lastName, password, email);
    }
}
