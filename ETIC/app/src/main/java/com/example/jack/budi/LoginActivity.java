package com.example.jack.budi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //find login button view
        Button button = (Button) findViewById(R.id.login_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //create new intent
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);

            }
        });
    }
}
