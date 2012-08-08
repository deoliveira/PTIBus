package org.grupoandroid.ptibus.db;

import org.grupoandroid.ptibus.models.DaoMaster;
import org.grupoandroid.ptibus.models.DaoSession;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper {
	
	private static final String DB_NAME = "ptibus.db";
	
	static SQLiteDatabase db;
	
	public static DaoSession getDaoSession (Context context) {
		SQLiteOpenHelper helper = new DaoMaster.DevOpenHelper(context, DB_NAME, null);
		db = helper.getWritableDatabase();
		DaoMaster daoMaster = new DaoMaster(db);
		return daoMaster.newSession();
	}
	
}
