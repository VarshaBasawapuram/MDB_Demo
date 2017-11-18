package com.example.s528735.assignment_08;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by S528735 on 11/16/2017.
 */

public class OrderDetailsSQLiteHelper extends SQLiteOpenHelper {

    public OrderDetailsSQLiteHelper(Context context, Integer in) {
        super(context, "orderDetailsDB",null,1);
    }

    private static final String createOrdersDB = "create table orders(" + "_id2 integer primary key autoincrement," +
            "Person_Name text not null," +
            "Cookie_Type text not null," +
            "Boxes_Count integer," +
            "Total_Price integer)";
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try{
            sqLiteDatabase.execSQL(createOrdersDB);
        } catch (Exception e){
            Log.d("cookieDB",e.getMessage());
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("Drop table if exists movies");
        sqLiteDatabase.execSQL("Drop table if exists orders");

        onCreate(sqLiteDatabase);
    }
}
