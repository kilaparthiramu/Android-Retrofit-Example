package com.example.rkilaparthi.retrofitexamples.Pojo;

/**
 * Created by rkilaparthi on 9/22/2016.
 */
public class MyPojo
{
    protected Contacts[] contacts;
    private  Phone phone;

    public Contacts[] getContacts ()
    {
        return contacts;
    }

    public void setContacts (Contacts[] contacts)
    {
        this.contacts = contacts;
    }
    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone coord) {
        this.phone = coord;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [contacts = "+contacts+"]";
    }
}
