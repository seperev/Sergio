package com.example.spv.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by SPV on 01/03/2016.
 */
public class Usuario extends SQLiteOpenHelper {

    private static final String nombreBD = "Base_De_Datos.db";
    private static final String crearTablaUsuario =
            "CREATE TABLE com.example.spv.myapplication.Usuario (id TEXT, nombre TEXT);";

    public Usuario(Context context){

        super(context, nombreBD, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(crearTablaUsuario);
        db.execSQL(insertar_en_usuario);

    }

    public static final String insertar_en_usuario =
            "insert into "+nombreBD+" values(6, pepe)";

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
