package com.example.jack.budi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AchievementsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ArrayList<Challenge> challenges = new ArrayList<Challenge>();
        challenges.add(new Challenge("Edinburgh Castle",
                "I am a castle, I am a castle, I am a castle, I am a castle, I am a castle, I am a castle,",
                "Longer Description",
                500, 0,1));
        challenges.add(new Challenge("Edinburgh Castle",
                "I am a castle, I am a castle, I am a castle, I am a castle, I am a castle, I am a castle,",
                "Longer Description",
                500, 0,2));
        challenges.add(new Challenge("Edinburgh Castle",
                "I am a castle, I am a castle, I am a castle, I am a castle, I am a castle, I am a castle,",
                "Longer Description",
                500, 0,3));
        challenges.add(new Challenge("Edinburgh Castle",
                "I am a castle, I am a castle, I am a castle, I am a castle, I am a castle, I am a castle,",
                "Longer Description",
                500, 0,4));
        challenges.add(new Challenge("Edinburgh Castle",
                "I am a castle, I am a castle, I am a castle, I am a castle, I am a castle, I am a castle,",
                "Longer Description",
                500, 0,5));



        ChallengeAdapter  challengeAdapter= new ChallengeAdapter(AchievementsActivity.this, challenges);

        ListView listView = (ListView) findViewById(R.id.achievements_list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(challengeAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //do something on the click of a challenge item
            }
        });

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
