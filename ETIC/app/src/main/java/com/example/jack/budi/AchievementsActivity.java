package com.example.jack.budi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AchievementsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ArrayList<Challenge> challenges = new ArrayList<Challenge>();
        challenges.add(new Challenge("Edinburgh Castle",
                "World famous icon of Scotland. Part of the Old and New Towns of Edinburghís World Heritage Site.",
                "A world famous icon of Scotland and part of the Old and New Towns of Edinburghís World Heritage Site. Part of Edinburghís history since the 12th century, it was recently voted top UK Heritage Attraction in the British Travel Awards and is Scotlandís number one paid-for tourist attraction. This most famous of Scottish castles has a complex building history.",
                R.drawable.i1,
                10, 2, 1));

        challenges.add(new Challenge("St. Gileís Cathedral",
                "St Gilesí Cathedral is the beautiful and historic City Church of Edinburgh.",
                "St Gilesí Cathedral is the beautiful and historic City Church of Edinburgh. With its famed crown spire it stands on the Royal Mile between Edinburgh Castle and the Palace of Holyroodhouse. Also known as the High Kirk of Edinburgh, it is the Mother Church of Presbyterianism and contains the Chapel of the Order of the Thistle (Scotlandís chivalric company of knights headed by the Queen).",
                R.drawable.i8,
                10, 2, 8));

        challenges.add(new Challenge("Scotch Whisky Experience",
                "Take a barrel ride as you actually become part of the whisky making process. Experience for yourself our regional whiskies and whether you like fruity, sweet or smoky flavours.",
                "Take a barrel ride as you actually become part of the whisky making process. Experience for yourself our regional whiskies and whether you like fruity, sweet or smoky flavours. Our experts will help you select your perfect dram.Enter the vault containing the world's largest collection of Scotch Whiskies and enjoy a special tutored nosing and tasting. Explore Scotland's whisky history from the very beginnings through to the global success of today.",
                R.drawable.i5,
                15, 2, 5));
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

            }
        }});


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_achievements);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view_ach);
        navigationView.setNavigationItemSelectedListener(AchievementsActivity.this);



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_achievements);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent intentHome = new Intent(AchievementsActivity.this, HomeActivity.class);
            startActivity(intentHome);

        } else if (id == R.id.nav_achievements) {
//            Intent intentAchievements = new Intent(AchievementsActivity.this, AchievementsActivity.class);
//            startActivity(intentAchievements);

            Toast.makeText(this, "You are on the Achievements Page", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_leaderboard) {
            Intent intentLeaderboard = new Intent(AchievementsActivity.this, LeaderboardActivity.class);
            startActivity(intentLeaderboard);

        } else if (id == R.id.nav_settings) {

        } else if (id == R.id.nav_logout) {
            Intent intentLogin = new Intent(this, LoginActivity.class);
            startActivity(intentLogin);

        } else if (id == R.id.nav_share) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_achievements);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
