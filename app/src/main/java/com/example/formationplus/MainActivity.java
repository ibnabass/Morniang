package com.example.formationplus;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    MyHelper dbHelper = new MyHelper(getApplicationContext());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        MyHelper myHelper = new MyHelper( MainActivity.this);
        //database();
    }
    public void database(){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("nom","java");
        values.put("nbHeur",10);
        long idConvention= db.insert("CONVENTION",null,values);
        values.put("Prenom","papa");
        values.put("nom","diallo");
        values.put("mail","diallo@gmail.com");
        long idEtudiant= db.insert("Etudiant",null,values);


    }

}
