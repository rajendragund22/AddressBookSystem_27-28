package com.bridgelabz.assignment;

public class Contact {

    String firstname;
    String lastname;
    String city;
    String state;
    int zipcode;
    String phonenumber;
    String email;

    public Contact(String firstname, String lastname, String city, String state, int zipcode,
                   String phonenumber, String email) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phonenumber = phonenumber;
        this.email = email;
    }


    public Contact() {
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) //set first name.
    {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) //set last name.
    {
        this.lastname = lastname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) //set city.
    {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) //set state.
    {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) //set zipcode.
    {
        this.zipcode = zipcode;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) //set phone number.
    {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;

    }

    public void setEmail(String email) //set email.
    {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact [firstname=" + firstname + ", lastname=" + lastname + ", city=" + city + ", state="
                + state + ", zipcode=" + zipcode + ", phonenumber=" + phonenumber + ",email=" + email + "]";
    }

}