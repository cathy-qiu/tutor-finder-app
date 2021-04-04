package com.example.hpuser.access2ed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
// import android.widget.Toast;

public class SelectSubject extends AppCompatActivity {

    private Button[] button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button[0] = findViewById(R.id.buttonMath);
        button[1] = findViewById(R.id.buttonSci);
        button[2] = findViewById(R.id.buttonLang);
        button[3] = findViewById(R.id.buttonEmploy);
        button[4] = findViewById(R.id.buttonLit);
        button[5] = findViewById(R.id.buttonCook);
        button[6] = findViewById(R.id.buttonCode);
        button[7] = findViewById(R.id.buttonFS);
        button[8] = findViewById(R.id.buttonFandH);
        button[9] = findViewById(R.id.buttonEntre);
        button[10] = findViewById(R.id.buttonRobot);
        button[11] = findViewById(R.id.buttonConstruct);

        button[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(SelectSubject.this, SelectTutor3.class);
                startActivity(i1);
            }
        });
        button[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(SelectSubject.this, SelectTutor3.class);
                startActivity(i1);
            }
        });
        button[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(SelectSubject.this, SelectTutor3.class);
                startActivity(i1);
            }
        });

    }
}

