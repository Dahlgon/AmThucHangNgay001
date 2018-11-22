package com.example.admin.amthuchangngay001.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.admin.amthuchangngay001.Constant;

public class DatabaseManager extends SQLiteOpenHelper implements Constant{
    private static final String DATABASE_NAME = "AmThucHangNgay";
    private static final int DATABASE_VERSION = 1;
    public DatabaseManager (Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_NORMAL_TABLE);

        if (isDEBUG) Log.e("CREATE_NORMAL_TABLE", CREATE_NORMAL_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldv, int newv) {

        db.execSQL("DROP TABLE IF EXISTS " + NORMAL_TABLE);

        onCreate(db);

    }
}
