package com.example.formationplus;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    MyHelper dbHelper = new MyHelper(getApplicationContext());
    Convention convention1=new Convention(1,"Stage",300);
    Etudiant etudiant1 = new Etudiant(1,"NIANG","Mor",convention1);
    Convention convention2=new Convention(2,"CDD",600);
    Etudiant etudiant2 = new Etudiant(2,"DIALLO","Papa",convention2);
    Etudiant[] etudiants= { etudiant1,etudiant2 };
    String[] etudi = {etudiant1.toString(), etudiant2.toString()};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyHelper myHelper = new MyHelper( MainActivity.this);
        setContentView(R.layout.activity_main);
        Spinner spin = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, etudi);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        TextView t = (TextView)findViewById(R.id.etudiant);
        t.setText("Convention "+etudiants[position].getConvention().getNom());
        TextView textarea = (TextView)findViewById(R.id.textarea);
        textarea.setText("Bonjour "+ etudiants[position].getNom() +" "+ etudiants[position].getPrenom()
                +"\nVous avez suivi "+ etudiants[position].getConvention().getNbHeur() +" heures de formation chez FormationPlus. " +
                "\nPouvez-vous nous retourner ce mail avec la pièce joince signée.\n" +
                "Cordialement.\n" +
                "FormationPlus" );
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

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
