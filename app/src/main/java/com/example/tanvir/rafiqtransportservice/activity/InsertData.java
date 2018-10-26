package com.example.tanvir.rafiqtransportservice.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.tanvir.rafiqtransportservice.Data;
import com.example.tanvir.rafiqtransportservice.R;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;

public class InsertData extends AppCompatActivity {

    private EditText eTdate,eTtime,eTtransportName,eTload,eTunLoad,eTrent,eTadvance;
    private Button BtndataEntry;
    private RadioButton Radpaid,Radunpaid;
    DatabaseReference databaseData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);
        if(!FirebaseApp.getApps(this).isEmpty()) {
            FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        }

        databaseData = FirebaseDatabase.getInstance().getReference("data");
        eTdate = findViewById(R.id.eTdate);
        eTtime = findViewById(R.id.eTtime);
        eTtransportName = findViewById(R.id.eTtransportName);
        eTload = findViewById(R.id.eTload);
        eTunLoad = findViewById(R.id.eTunLoad);
        eTrent = findViewById(R.id.eTrent);
        eTadvance = findViewById(R.id.eTadvance);
        BtndataEntry = findViewById(R.id.BtndataEntry);

        BtndataEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addData();
            }
        });


    }

    private void addData(){
        String date = eTdate.getText().toString().trim();
        String time = eTtime.getText().toString().trim();
        String transportName = eTtransportName.getText().toString().trim();
        String load = eTload.getText().toString().trim();
        String unLoad = eTunLoad.getText().toString().trim();
        String rent = eTrent.getText().toString().trim();
        String advance = eTadvance.getText().toString().trim();

        if(!TextUtils.isEmpty(date)){
            String id = databaseData.push().getKey();
            Data data = new Data(id, date);
            databaseData.child(id).setValue(data);

            Toast.makeText(this,"Data added",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"You Should Enter A Date",Toast.LENGTH_LONG).show();
        }
    }
}
