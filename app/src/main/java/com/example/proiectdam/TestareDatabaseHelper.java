package com.example.proiectdam;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TestareDatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "testare.db";
    public static final String TABLE_NAME = "programare_table";
    public static final String COL_ID = "ID";
    public static final String COL_NAME = "Nume";
    public static final String COL_CNP = "CNP";
    public static final String COL_PHONE = "Telefon";
    public static final String COL_UNIT = "Unitate";
    public TestareDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME
                + " (" + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COL_NAME + " TEXT, "
                + COL_CNP + " TEXT,"
                + COL_PHONE + " TEXT, "
                + COL_UNIT + " TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
    }
    public boolean insertData(String nume, String cnp, String tel, String unit) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_NAME, nume);
        values.put(COL_CNP, cnp);
        values.put(COL_PHONE, tel);
        values.put(COL_UNIT, unit);
        long result = db.insert(TABLE_NAME, null, values);
        return result != -1;
    }
    public Cursor getAllData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "Select * from " + TABLE_NAME;
        return db.rawQuery(query,null);
    }
}
