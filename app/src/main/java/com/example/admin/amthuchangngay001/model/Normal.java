package com.example.admin.amthuchangngay001.model;

public class Normal {
    private String NormalName;
    private String NormalAdd;
    private String NormalContact;

    public Normal(String normalName, String normalAdd, String normalContact) {
        NormalName = normalName;
        NormalAdd = normalAdd;
        NormalContact = normalContact;
    }

    public String getNormalName() {
        return NormalName;
    }

    public void setNormalName(String normalName) {
        NormalName = normalName;
    }

    public String getNormalAdd() {
        return NormalAdd;
    }

    public void setNormalAdd(String normalAdd) {
        NormalAdd = normalAdd;
    }

    public String getNormalContact() {
        return NormalContact;
    }

    public void setNormalContact(String normalContact) {
        NormalContact = normalContact;
    }
}
