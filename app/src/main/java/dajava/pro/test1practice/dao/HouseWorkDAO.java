package dajava.pro.test1practice.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import dajava.pro.test1practice.DBHelper;
import dajava.pro.test1practice.model.HouseWork;

public class HouseWorkDAO {
    public static ArrayList<HouseWork> getAll(Context context){
        ArrayList<HouseWork> list = new ArrayList<>();
        DBHelper helper = new DBHelper(context);
        SQLiteDatabase db = helper.getReadableDatabase();
        Cursor cs = db.rawQuery("Select * from housework",null);
        cs.moveToFirst();
        while(!cs.isAfterLast()){
            int id =cs.getInt(0);
            String name = cs.getString(1);
            String des = cs.getString(2);
            String gender = cs.getString(3);
            String finish_date = cs.getString(4);
            HouseWork houseWork = new HouseWork(id,name,des,gender,finish_date);
            list.add(houseWork);
        }
        cs.close();
        db.close();
        return list;
    }
}
