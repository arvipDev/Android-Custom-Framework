package services;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by ARVIND on 11/10/2016.
 */

public class SecondDatabaseSvcImpl implements IDatabaseSvc
{

    public final static String NAME = "SecondDatabaseSvcImpl";

    @Override
    public String getServiceName() {
        return null;
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
}
