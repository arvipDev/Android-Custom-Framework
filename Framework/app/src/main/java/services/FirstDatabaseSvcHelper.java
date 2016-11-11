package services;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ARVIND on 11/10/2016.
 */

public class FirstDatabaseSvcHelper extends SQLiteOpenHelper implements IDatabaseSvc {

    public final static String NAME = "FirstDatabaseSvcImpl";

    public FirstDatabaseSvcHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void createTable(SQLiteDatabase db) {

    }

    @Override
    public void insert() {

    }

    @Override
    public void delete() {

    }

    @Override
    public String getServiceName() {
        return null;
    }
}

