package com.example.hpuser.access2ed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserSearchPAge extends AppCompatActivity {

    private Button findsubjectbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_search_page);

        findsubjectbutton = (Button) findViewById(R.id.findsubjectbutton);
        findsubjectbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserSearchPAge.this, SelectSubject.class);
                startActivity(i);
            }
        });
    }
}