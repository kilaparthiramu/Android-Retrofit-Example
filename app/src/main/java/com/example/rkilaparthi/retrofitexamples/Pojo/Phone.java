package com.example.rkilaparthi.retrofitexamples.Pojo;

/**
 * Created by rkilaparthi on 9/22/2016.
 */
public class Phone
{
    private String office;

    private String home;

    private String mobile;

    public String getOffice ()
    {
        return office;
    }

    public void setOffice (String office)
    {
        this.office = office;
    }

    public String getHome ()
    {
        return home;
    }

    public void setHome (String home)
    {
        this.home = home;
    }

    public String getMobile ()
    {
        return mobile;
    }

    public void setMobile (String mobile)
    {
        this.mobile = mobile;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [office = "+office+", home = "+home+", mobile = "+mobile+"]";
    }
}