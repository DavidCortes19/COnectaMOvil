package com.example.conectamovil.Controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConexionHelper extends SQLiteOpenHelper {

    public ConexionHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utility.CREAR_TABLA_USUARIO);
        db.execSQL(Utility.CREAR_TABLA_MENSAJERIA);
        db.execSQL(Utility.CREAR_TABLA_INFORMACION);
        db.execSQL(Utility.CREAR_TABLA_CONTACTOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+Utility.TABLA_USUARIO);
        db.execSQL("DROP TABLE IF EXISTS "+Utility.TABLA_MENSAJERIA);
        db.execSQL("DROP TABLE IF EXISTS "+Utility.TABLA_INFORMACION);
        db.execSQL("DROP TABLE IF EXISTS "+Utility.TABLA_CONTACTOS);
        onCreate(db);
    }

}