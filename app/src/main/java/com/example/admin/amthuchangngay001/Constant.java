package com.example.admin.amthuchangngay001;

public interface Constant {
    boolean isDEBUG = true;
    //normal
    String NORMAL_TABLE= "normal";
    String COLUMN_NORMALNAME= "normalname";
    String COLUMN_NORMALADD= "normaladdres";
    String COLUMN_NORMALCONTACT= "normalcontact";

    String CREATE_NORMAL_TABLE = "CREATE TABLE IF NOT EXISTS " + NORMAL_TABLE + "(" +
            COLUMN_NORMALNAME + " VARCHAR PRIMARY KEY," +
            COLUMN_NORMALADD + " VARCHAR," +
            COLUMN_NORMALCONTACT + " VARCHAR" +
            ")";

//    fastfood

    String FAST_TABLE= "fastfood";
    String COLUMN_FASTNAME= "fastname";
    String COLUMN_FASTADD= "fastaddres";
    String COLUMN_FASTCONTACT= "fastcontact";

    String CREATE_FAST_TABLE = "CREATE TABLE IF NOT EXISTS " + FAST_TABLE + "(" +
            COLUMN_FASTNAME + " VARCHAR PRIMARY KEY," +
            COLUMN_FASTADD + " VARCHAR," +
            COLUMN_FASTCONTACT + " VARCHAR" +
            ")";

//    office
String OFFICE_TABLE= "office";
    String COLUMN_OFFICENAME= "officename";
    String COLUMN_OFFICEADD= "officeaddres";
    String COLUMN_OFFICECONTACT= "officecontact";

    String CREATE_OFFICE_TABLE = "CREATE TABLE IF NOT EXISTS " + OFFICE_TABLE + "(" +
            COLUMN_OFFICENAME + " VARCHAR PRIMARY KEY," +
            COLUMN_OFFICEADD + " VARCHAR," +
            COLUMN_OFFICECONTACT + " VARCHAR" +
            ")";

//    party
String PARTY_TABLE= "party";
    String COLUMN_PARTYNAME= "partyname";
    String COLUMN_PARTYADD= "partyaddres";
    String COLUMN_PARTYCONTACT= "partycontact";

    String CREATE_PARTY_TABLE = "CREATE TABLE IF NOT EXISTS " + PARTY_TABLE + "(" +
            COLUMN_PARTYNAME + " VARCHAR PRIMARY KEY," +
            COLUMN_PARTYADD + " VARCHAR," +
            COLUMN_PARTYCONTACT + " VARCHAR" +
            ")";
}