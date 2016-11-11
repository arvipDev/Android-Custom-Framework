package services;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by ARVIND on 11/10/2016.
 */

public interface IDatabaseSvc extends IService {
    public void createTable(SQLiteDatabase db);

    public void insert();

    public void delete();

}
