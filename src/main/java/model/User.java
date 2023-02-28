package model;

public class User extends Person{
    private UserType userType = UserType.USER;

    public User(String firstName, String lastName, String password, String email) {
        super(firstName, lastName, password, email);
    }
}
