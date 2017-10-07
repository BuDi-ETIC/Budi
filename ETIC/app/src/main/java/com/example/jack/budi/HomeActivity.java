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

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final ArrayList<Challenge> challenges = new ArrayList<Challenge>();
        challenges.add(new Challenge("Edinburgh Castle",
                "I am a castle, I am a castle, I am a castle, I am a castle, I am a castle, I am a castle,",
                "Longer Description",
                500, 2,1));
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


        ChallengeAdapter  challengeAdapter= new ChallengeAdapter(this, challenges);

        ListView listView = (ListView) findViewById(R.id.challenge_list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(challengeAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               //do something on the click of a challenge item
                switch (i) {
                    case 0:
                        Challenge obj = challenges.get(0);
                        Intent intent = new Intent(HomeActivity.this, ChallengeViewActivity.class);
                        intent.putExtra("userTag",obj);
                        startActivity(intent);
                        break;



                }
            }
        });





        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
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
            Intent intentHome = new Intent(HomeActivity.this, HomeActivity.class);
            startActivity(intentHome);

        } else if (id == R.id.nav_achievements) {
            Intent intentAchievements = new Intent(HomeActivity.this, AchievementsActivity.class);
            startActivity(intentAchievements);
        } else if (id == R.id.nav_leaderboard) {
            Intent intentLeaderboard = new Intent(HomeActivity.this, LeaderboardActivity.class);
            startActivity(intentLeaderboard);

        } else if (id == R.id.nav_settings) {

        } else if (id == R.id.nav_logout) {
            Intent intentLogin = new Intent(this, LoginActivity.class);
            startActivity(intentLogin);

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
