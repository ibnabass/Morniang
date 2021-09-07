package com.example.formationplus;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class MyHelper extends SQLiteOpenHelper {
    //Liste<Etudiant>l = new ArrayList<Etudiant>();
    static final String DB_NAME ="Bdonnes.db";
    static final int DB_VERSION=1;
    public MyHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="CREATE TABLE ETUDIANT(idEtudiant INTEGER PRIMARY KEY AUTOINCREMENT,nom TEXT,Prenom TEXT, mail TEXT, idConvention INTEGER)";
        String sql1="CREATE TABLE CONVENTION(idConvention INTEGER PRIMARY KEY AUTOINCREMENT,nbHeur INTEGER, nom TEXT)";
        String sql2="CREATE TABLE ATTESTATION(idAttestation INTEGER , message TEXT,idEtudiant INTEGER, idConvention INTEGER)";

        // On cree les tables
        db.execSQL(sql);
        db.execSQL(sql1);
        db.execSQL(sql2);

        // String sql_ ="CREATE TABLE CONVENTION(idConvention INTEGER ,nom TEXT, nbheure INTEGER)";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
    // On lance la création de la base de données
   // public void callCreateDataBase(){
       // SQLiteDatabase sqLiteDatabase=this.getWritableDatabase()


   // }

}


