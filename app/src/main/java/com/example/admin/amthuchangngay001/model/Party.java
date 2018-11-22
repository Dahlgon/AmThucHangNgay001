package com.example.admin.amthuchangngay001.model;

public class Party {
    private String PartyName;
    private String PartyAdd;
    private String PartyContact;

    public Party(String partyName, String partyAdd, String partyContact) {
        PartyName = partyName;
        PartyAdd = partyAdd;
        PartyContact = partyContact;
    }

    public String getPartyName() {
        return PartyName;
    }

    public void setPartyName(String partyName) {
        PartyName = partyName;
    }

    public String getPartyAdd() {
        return PartyAdd;
    }

    public void setPartyAdd(String partyAdd) {
        PartyAdd = partyAdd;
    }

    public String getPartyContact() {
        return PartyContact;
    }

    public void setPartyContact(String partyContact) {
        PartyContact = partyContact;
    }
}
