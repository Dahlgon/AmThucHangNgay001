package com.example.admin.amthuchangngay001.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.admin.amthuchangngay001.Constant;
import com.example.admin.amthuchangngay001.model.Normal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public long updateNormal(Normal normal) {
        SQLiteDatabase dtb = databaseManager.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_NORMALNAME, normal.getNormalName());
        contentValues.put(COLUMN_NORMALADD, normal.getNormalAdd());
        contentValues.put(COLUMN_NORMALCONTACT, normal.getNormalContact());
        return dtb.update(NORMAL_TABLE, contentValues, COLUMN_NORMALNAME + " = ?",
                new String[]{String.valueOf(normal.getNormalName())});
    }

    public List<Normal> getAllNormals() {

        List<Normal> normals = new ArrayList<>();
        String selectQuery = "SELECT  * FROM " + NORMAL_TABLE;

        SQLiteDatabase dtb = databaseManager.getWritableDatabase();
        Cursor cursor = dtb.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                String normalname = cursor.getString(cursor.getColumnIndex(COLUMN_NORMALNAME));
                String normaladd = cursor.getString(cursor.getColumnIndex(COLUMN_NORMALADD));
                long normalcontact = cursor.getLong(cursor.getColumnIndex(COLUMN_NORMALCONTACT));
                Normal normal = new Normal();
                normal.setNormalName(normalname);
                normal.setNormalAdd(normaladd);
                normal.setNormalContact(normalcontact);
                normals.add(normal);
            } while (cursor.moveToNext());
        }
        cursor.close();
        dtb.close();

        return normals;

    }
    public List<Normal> getAllNormalLike(String ID) {

        List<Normal> normals = new ArrayList<>();
        String selectQuery = "SELECT  * FROM " + NORMAL_TABLE +" WHERE "+COLUMN_NORMALNAME+" like '%"+ID+"%'";
        Log.e("getAllNormalLike",selectQuery);
        SQLiteDatabase dtb = databaseManager.getWritableDatabase();
        Cursor cursor = dtb.rawQuery(selectQuery,null);
        if (cursor.moveToFirst()) {
            do {
                String normalname = cursor.getString(cursor.getColumnIndex(COLUMN_NORMALNAME));
                String normaladd = cursor.getString(cursor.getColumnIndex(COLUMN_NORMALADD));
                long normalcontact = cursor.getLong(cursor.getColumnIndex(COLUMN_NORMALCONTACT));
                Normal normal = new Normal();
                normal.setNormalName(normalname);
                normal.setNormalAdd(normaladd);
                normal.setNormalContact(normalcontact);
                normals.add(normal);
            } while (cursor.moveToNext());
        }
        cursor.close();
        dtb.close();

        return normals;

    }

    public Normal getNormalByName(String normalName) {
        Normal normal =null;
        SQLiteDatabase db = databaseManager.getReadableDatabase();

        Cursor cursor = db.query(NORMAL_TABLE, new String[]{COLUMN_NORMALNAME,COLUMN_NORMALADD,COLUMN_NORMALCONTACT},
                COLUMN_NORMALNAME + "=?", new String[]{normalName},
                null, null, null, null);
        if (cursor != null && cursor.moveToFirst()) {
            String nmname = cursor.getString(cursor.getColumnIndex(COLUMN_NORMALNAME));
            String nmadd = cursor.getString(cursor.getColumnIndex(COLUMN_NORMALADD));
            long nmcontact = cursor.getLong(cursor.getColumnIndex(COLUMN_NORMALCONTACT));
            normal = new Normal();
        }
        Objects.requireNonNull(cursor).close();
        return normal;
    }



}
