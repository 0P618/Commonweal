package com.goldenratio.commonweal.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.goldenratio.commonweal.dao.entity.User;

/**
 * Created by Kiuber on 2016/6/11.
 */

public class UserDao {

    private SQLiteDatabase db;

    public UserDao(Context context) {
        DBHelper dbHelper = new DBHelper(context);
        this.db = dbHelper.getWritableDatabase();
    }

    public void insert(String sql) {
        db.execSQL(sql);
    }

    public void insert(String sql, Object[] bindArgs) {
        db.execSQL(sql, bindArgs);
    }

    public void update(String sql) {
        db.execSQL(sql);
    }

    public void update(String sql, Object[] bindArgs) {
        db.execSQL(sql, bindArgs);
    }

    public void delete(String sql) {
        db.execSQL(sql);
    }

    public void delete(String sql, Object[] bindArgs) {
        db.execSQL(sql, bindArgs);
    }

    public Cursor query(String sql) {
        Cursor cursor = db.rawQuery(sql, null);
        return cursor;
    }
}
