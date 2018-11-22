package com.example.admin.amthuchangngay001.model;

public class Office {
    private String OfficeName;
    private String OfficeAdd;
    private String OfficeContact;

    public Office(String officeName, String officeAdd, String officeContact) {
        OfficeName = officeName;
        OfficeAdd = officeAdd;
        OfficeContact = officeContact;
    }

    public String getOfficeName() {
        return OfficeName;
    }

    public void setOfficeName(String officeName) {
        OfficeName = officeName;
    }

    public String getOfficeAdd() {
        return OfficeAdd;
    }

    public void setOfficeAdd(String officeAdd) {
        OfficeAdd = officeAdd;
    }

    public String getOfficeContact() {
        return OfficeContact;
    }

    public void setOfficeContact(String officeContact) {
        OfficeContact = officeContact;
    }
}
