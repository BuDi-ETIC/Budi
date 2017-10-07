package com.example.jack.budi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.TextView;

public class ChallengeViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Challenge uobj= getIntent().getParcelableExtra("userTag");

        TextView title = (TextView) findViewById(R.id.challenge_view_title);
        title.setText(uobj.getTitle());

        TextView des = (TextView) findViewById(R.id.challenge_view_description);
        des.setText(uobj.getDescriptionLong());

        Button btn = (Button) findViewById(R.id.challenge_view_button);
        switch (uobj.getCompleted()){
            case 0:
                btn.setText("ACCEPT CHALLENGE");
                break;
            case 1:
                btn.setText("CHALLENGE PENDING");
                break;
            case 2:
                btn.setText("CHALLENGE COMPLETED");
                break;

        }


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

}
