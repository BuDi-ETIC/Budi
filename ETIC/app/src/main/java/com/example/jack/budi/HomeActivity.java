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

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final ArrayList<Challenge> challenges = new ArrayList<Challenge>();

        challenges.add(new Challenge("Scott Monument",
                "200-foot spire dedicated to Sir Walter Scott, the famous Scottish poet.",
                "200-foot spire dedicated to Sir Walter Scott, the famous Scottish poet. Climb 287 to the tippy top and enjoy breathtaking views of the city, all for a fiver. Afraid of heights? Just climb to the first tier, and explore the Sir Walter Scott museum room.",
                10, 1,2));

        challenges.add(new Challenge("Elephant House",
                "Coined the ìbirthplace of Harry Potter,î this cafe is a must-see for any Potterhead wanting to glimpse a table where JK Rowling penned her books.",
                "Coined the ìbirthplace of Harry Potter,î this cafe is a must-see for any Potterhead wanting to glimpse a table where JK Rowling penned her books. Arrive early to skip the crowd and make sure to visit the bathroom for a veritable shrine to the series.",
                15, 0,3));

        challenges.add(new Challenge("Camera Obscura",
                "Enjoy unique 360 degree panoramic views over Edinburgh from the fascinating Camera Obscura and rooftop terrace.",
                "Enjoy unique 360 degree panoramic views over Edinburgh from the fascinating Camera Obscura and rooftop terrace. In World of Illusions, experience five floors of interactive hands-on optical illusions, tricks and fun things to do including vortex tunnel, mirror maze and shrinking room. Get involved, play, touch everything. Great fun for all ages and nationalities, whatever the weather.",
                100, 0,4));

        challenges.add(new Challenge("National Museum of Scotland",
                "Explore the diversity of the natural world, world cultures, science and technology, art, design and fashion, and Scottish history, all under one roof.",
                "2017 is the year of Scottish History, Heritage, and Archaeology. What better place to celebrate this by visiting the museum recently voted Scotlandís #1 visitor attraction. Explore the diversity of the natural world, world cultures, science and technology, art, design and fashion, and Scottish history, all under one roof. Free entry!",
                25, 0,6));

        challenges.add(new Challenge("Scottish National Gallery",
                "Collections of fine art situated in the heart of Edinburgh. Free entry!",
                "Situated in the heart of Edinburgh, the Scottish National Gallery is home to one of the best collections of fine art in the world. Free entry!",
                10, 0,7));

        challenges.add(new Challenge("Greyfriarís Kirkyard",
                "Graveyard predating the establishment of the Kirk in 1620. Beloved by Potter fans, many seek out the headstones that inspired names for characters in the series.",
                "24-hour access to the public, this graveyard predates the establishment of the Kirk in 1620. Although popularly associated with Greyfriars Bobby, this site was the setting for many historical events of national significance, including the imprisoning of Covenanters after the Battle of Bothwell Bridge in 1679. Beloved by Potter fans, many seek out the headstones that inspired names for characters in the series.",
                15, 0,9));

        challenges.add(new Challenge("Princes Street Gardens",
                "The former site of the \"Norí Loch\"(or North Lake), this public park has beautiful green gardens and pathways for you to venture between Edinburghís Old and New Towns.",
                "The former site of the \"Norí Loch\" (or North Lake), this public park has beautiful green gardens and pathways for you to venture between Edinburghís Old and New Towns.",
                15, 1,10));

        challenges.add(new Challenge("Calton Hill",
                "The panoramic views from Calton Hill have astonished and inspired visitors for centuries.",
                "The panoramic views from Calton Hill have astonished and inspired visitors for centuries. Major landmarks can be seen from a birdís eye view: Arthurís Seat with the Crags behind Holyrood Palace and the Parliament, Leith and the Firth of Forth, Princes Street in its New Town grid and the Royal Mile climbing up towards the Castle.",
                15, 1,11));




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
                Intent intent = new Intent(HomeActivity.this, ChallengeViewActivity.class);
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
            Toast.makeText(this, "You are on the Home Page", Toast.LENGTH_SHORT).show();

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

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
