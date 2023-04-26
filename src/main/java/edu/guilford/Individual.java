package edu.guilford;

public class Individual {
    // set attributes for name, email, and phone
    private String name;
    private String email;
    private String phone;

    // constructor that gives default data
 public Individual() {
     name = "John Doe";
     email = "JohnDoe5@guilford.edu";
     phone = "555-555-5555";
 }

    // set constructor
 public Individual (String name, String email, String phone) {
     this.name = name;
     this.email = email;
     this.phone = phone;
 }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        // update the name field
        // nameField.setText(name);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        // update the email field
        // emailField.setText(email);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        // update the phone field
        // phoneField.setText(phone);
    }

    // toString method

    @Override
    public String toString() {
        return "individual{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
