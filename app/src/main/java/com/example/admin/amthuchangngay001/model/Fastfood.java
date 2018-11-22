package com.example.admin.amthuchangngay001.model;

public class Fastfood {
    private String FastName;
    private String FastAdd;
    private String FastContact;

    public Fastfood(String fastName, String fastAdd, String fastContact) {
        FastName = fastName;
        FastAdd = fastAdd;
        FastContact = fastContact;
    }

    public String getFastName() {
        return FastName;
    }

    public void setFastName(String fastName) {
        FastName = fastName;
    }

    public String getFastAdd() {
        return FastAdd;
    }

    public void setFastAdd(String fastAdd) {
        FastAdd = fastAdd;
    }

    public String getFastContact() {
        return FastContact;
    }

    public void setFastContact(String fastContact) {
        FastContact = fastContact;
    }
}
