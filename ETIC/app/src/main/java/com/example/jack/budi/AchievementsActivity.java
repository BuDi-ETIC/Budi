package com.example.jack.budi;

import android.content.Intent;
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
        challenges.add(new Challenge("St. Gileís Cathedral",
                "St Gilesí Cathedral is the beautiful and historic City Church of Edinburgh.",
                "St Gilesí Cathedral is the beautiful and historic City Church of Edinburgh. With its famed crown spire it stands on the Royal Mile between Edinburgh Castle and the Palace of Holyroodhouse. Also known as the High Kirk of Edinburgh, it is the Mother Church of Presbyterianism and contains the Chapel of the Order of the Thistle (Scotlandís chivalric company of knights headed by the Queen).",
                50, 2,8));
        challenges.add(new Challenge("Scotch Whisky Experience",
                "Take a barrel ride as you actually become part of the whisky making process. Experience for yourself our regional whiskies and whether you like fruity, sweet or smoky flavours.",
                "Take a barrel ride as you actually become part of the whisky making process. Experience for yourself our regional whiskies and whether you like fruity, sweet or smoky flavours. Our experts will help you select your perfect dram.Enter the vault containing the world's largest collection of Scotch Whiskies and enjoy a special tutored nosing and tasting. Explore Scotland's whisky history from the very beginnings through to the global success of today.",
                15, 2,5));
        challenges.add(new Challenge("Edinburgh Castle",
                "World famous icon of Scotland. Part of the Old and New Towns of Edinburghís World Heritage Site.",
                "A world famous icon of Scotland and part of the Old and New Towns of Edinburghís World Heritage Site. Part of Edinburghís history since the 12th century, it was recently voted top UK Heritage Attraction in the British Travel Awards and is Scotlandís number one paid-for tourist attraction. This most famous of Scottish castles has a complex building history.",
                10, 2,1));



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
                Intent intent = new Intent(AchievementsActivity.this, ChallengeViewActivity.class);
                Challenge obj;
                //do something on the click of a challenge item
                switch (i) {
                    case 0:
                        obj = challenges.get(0);
                        intent.putExtra("userTag",obj);
                        startActivity(intent);
                        break;
                    case 1:
                        obj = challenges.get(1);
                        intent.putExtra("userTag",obj);
                        startActivity(intent);
                        break;
                    case 2:
                        obj = challenges.get(2);
                        intent.putExtra("userTag",obj);
                        startActivity(intent);
                        break;
                    case 3:
                        obj = challenges.get(3);
                        intent.putExtra("userTag",obj);
                        startActivity(intent);
                        break;
                    case 4:
                        obj = challenges.get(4);
                        intent.putExtra("userTag",obj);
                        startActivity(intent);
                        break;
                    case 5:
                        obj = challenges.get(5);
                        intent.putExtra("userTag",obj);
                        startActivity(intent);
                        break;
                    case 6:
                        obj = challenges.get(6);
                        intent.putExtra("userTag",obj);
                        startActivity(intent);
                        break;
                    case 7:
                        obj = challenges.get(7);
                        intent.putExtra("userTag",obj);
                        startActivity(intent);
                        break;
                    case 8:
                        obj = challenges.get(8);
                        intent.putExtra("userTag",obj);
                        startActivity(intent);
                        break;
                    case 9:
                        obj = challenges.get(9);
                        intent.putExtra("userTag",obj);
                        startActivity(intent);
                        break;
                    case 10:
                        obj = challenges.get(10);
                        intent.putExtra("userTag",obj);
                        startActivity(intent);
                        break;
                    case 11:
                        obj = challenges.get(11);
                        intent.putExtra("userTag",obj);
                        startActivity(intent);
                        break;

            }
        }});

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
