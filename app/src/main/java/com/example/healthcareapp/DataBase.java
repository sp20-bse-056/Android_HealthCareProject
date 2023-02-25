package com.example.healthcareapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBase extends SQLiteOpenHelper {
    public DataBase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

//=================
        String qury1= "Create table user( Username text , Email text , password text)";

        sqLiteDatabase.execSQL(qury1);

//=================
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {


     }
//==================
     public void register(String edSignUPName, String edSignUpEmail , String edsignUPpassword){

        ContentValues cv = new  ContentValues();
        cv.put("edSignUPName", edSignUPName  );
        cv.put("edSignUpEmail", edSignUpEmail);
        cv.put("edsignUPpassword", edsignUPpassword);

SQLiteDatabase db = getWritableDatabase();

db.insert("users" , null ,cv);
db.close();
//=========================================

     }

// Record read from the rigistration activity

    public int login(String username, String password){

int result =0;
String str[]= new String[2];

str[0]= username;
str[1]= password;

SQLiteDatabase db = getReadableDatabase();

Cursor c = db.rawQuery( "select * from user where username = ? and password = ? ", str);

if(c.moveToFirst()){

    result = 1;
}
        return result;



    }


}
