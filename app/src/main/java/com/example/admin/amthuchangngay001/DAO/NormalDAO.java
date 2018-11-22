package com.example.admin.amthuchangngay001.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.admin.amthuchangngay001.Constant;
import com.example.admin.amthuchangngay001.model.Normal;

public class NormalDAO implements Constant{
    private final DatabaseManager databaseManager;
    public NormalDAO(Context context){
        this.databaseManager = new DatabaseManager(context);
    }

    public long insertNormal (Normal normal){
        SQLiteDatabase dtb = databaseManager.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_NORMALNAME, normal.getNormalName());
        contentValues.put(COLUMN_NORMALADD, normal.getNormalAdd());
        contentValues.put(COLUMN_NORMALCONTACT, normal.getNormalContact());
        long result = dtb.insert(NORMAL_TABLE, null, contentValues);
        if (Constant.isDEBUG) Log.e("insertBill", "insertBill ID : " +normal.getNormalName());
        dtb.close();
        return result;
    }

    public long deleteNormal (String NormalName){
        SQLiteDatabase dtb = databaseManager.getWritableDatabase();
        long result = dtb.delete(NORMAL_TABLE, COLUMN_NORMALNAME + "?",
                new String[]{String.valueOf(NormalName)});
        dtb.close();
        return result;
    }

}
