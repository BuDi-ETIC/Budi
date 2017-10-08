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

public class LeaderboardActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player(1, "TheLengend27", "password", 10015, "Scottish"));
        players.add(new Player(2, "Jack", "password", 700, "Northern Irish"));
        players.add(new Player(3, "Sean", "password", 500, "English"));
        players.add(new Player(4, "Zsolt", "password", 350, "Jamican"));
        players.add(new Player(5, "True Scot", "password", 275, "Jamican"));
        players.add(new Player(6, "Erin ", "password", 200, "Jamican"));
        players.add(new Player(7, "Crunchy321", "password", 100, "Jamican"));
        players.add(new Player(8, "Product Forge", "password", 15, "Jamican"));
        players.add(new Player(9, "Traveller123", "password", 0, "Jamican"));


        LeaderboardAdapter leaderboardAdapter = new LeaderboardAdapter(LeaderboardActivity.this, players);

        ListView listView = (ListView) findViewById(R.id.leaderboard_list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(leaderboardAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //do something on the click of a challenge item
            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_leaderboard);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view_lead);
        navigationView.setNavigationItemSelectedListener(LeaderboardActivity.this);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_leaderboard);
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
            Intent intentHome = new Intent(LeaderboardActivity.this, HomeActivity.class);
            startActivity(intentHome);

        } else if (id == R.id.nav_achievements) {
            Intent intentAchievements = new Intent(LeaderboardActivity.this, AchievementsActivity.class);
            startActivity(intentAchievements);

        } else if (id == R.id.nav_leaderboard) {
//            Intent intentLeaderboard = new Intent(LeaderboardActivity.this, LeaderboardActivity.class);
//            startActivity(intentLeaderboard);
            Toast.makeText(this, "You are on the Leaderboard page", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_settings) {

        } else if (id == R.id.nav_logout) {
            Intent intentLogin = new Intent(this, LoginActivity.class);
            startActivity(intentLogin);

        } else if (id == R.id.nav_share) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_leaderboard);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}


