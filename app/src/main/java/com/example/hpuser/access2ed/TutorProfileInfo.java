package com.example.hpuser.access2ed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TutorProfileInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_tutor_profile);
        final EditText etname = (EditText)findViewById(R.id.editText);

        Button btnSave = (Button)findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Saved Successfuly "+
                        etname.getText().toString(),Toast.LENGTH_LONG).show();
                Intent i1=new Intent(TutorProfileInfo.this,MainActivity.class);
                startActivity(i1);
            }
        });
    }
}