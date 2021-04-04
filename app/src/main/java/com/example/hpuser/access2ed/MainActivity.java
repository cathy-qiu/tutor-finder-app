package com.example.hpuser.access2ed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button tutorButton, tuteeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tutorButton = (Button) findViewById(R.id.tutorButton);
        tutorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TutorProfileInfo.class);
                startActivity(i);
            }

        });
        tuteeButton = (Button) findViewById(R.id.tuteeButton);
        tuteeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, UserSearchPAge.class);
                startActivity(i);
            }

        });
    }
}
