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
        challenges.add(new Challenge("Loch Lomond",
                "Find a breathtaking view. An exhilarating ride. Or a moment on the loch shore. Discover everything the National Park has to offer.",
                "Find a breathtaking view. An exhilarating ride. Or a moment on the loch shore. Discover everything the National Park has to offer. Our National Park boasts some of the most stunning scenery in the world. From breathtaking mountains and glens,to the vast tranquil beauty of our Lochs. What will you see when you visit?",
                R.drawable.i14,
                100, 0, 14));
        challenges.add(new Challenge("Skara Brae",
                "The Neolithic settlement of Skara Brae is one of the best preserved groups of prehistoric houses in Western Europe.",
                "The Neolithic settlement of Skara Brae, near the dramatic white beach of the Bay of Skaill, is one of the best preserved groups of prehistoric houses in Western Europe. Uncovered by a storm in 1850, the attraction presents a remarkable picture of life around 5,000 years ago. Visitors can experience a prehistoric village and see ancient homes fitted with stone beds, dressers and seats. A replica construction allows visitors to fully understand the interior of a prehistoric house.",
                R.drawable.i19,
                200, 0, 19));


        challenges.add(new Challenge("Scott Monument",
                "200-foot spire dedicated to Sir Walter Scott, the famous Scottish poet.",
                "200-foot spire dedicated to Sir Walter Scott, the famous Scottish poet. Climb 287 to the tippy top and enjoy breathtaking views of the city, all for a fiver. Afraid of heights? Just climb to the first tier, and explore the Sir Walter Scott museum room.",
                R.drawable.i2,
                10, 0, 2));

        challenges.add(new Challenge("Elephant House",
                "Coined the \"birthplace of Harry Potter,\" this cafe is a must-see for any Potterhead wanting to glimpse a table where JK Rowling penned her books.",
                "Coined the \"birthplace of Harry Potter,\" this cafe is a must-see for any Potterhead wanting to glimpse a table where JK Rowling penned her books. Arrive early to skip the crowd and make sure to visit the bathroom for a veritable shrine to the series.",
                R.drawable.i3,
                15, 0, 3));

        challenges.add(new Challenge("Camera Obscura",
                "Enjoy unique 360 degree panoramic views over Edinburgh from the fascinating Camera Obscura and rooftop terrace.",
                "Enjoy unique 360 degree panoramic views over Edinburgh from the fascinating Camera Obscura and rooftop terrace. In World of Illusions, experience five floors of interactive hands-on optical illusions, tricks and fun things to do including vortex tunnel, mirror maze and shrinking room. Get involved, play, touch everything. Great fun for all ages and nationalities, whatever the weather.",
                R.drawable.i4,
                10, 0, 4));



        challenges.add(new Challenge("National Museum of Scotland",
                "Explore the diversity of the natural world, world cultures, science and technology, art, design and fashion, and Scottish history, all under one roof.",
                "2017 is the year of Scottish History, Heritage, and Archaeology. What better place to celebrate this by visiting the museum recently voted Scotlandís #1 visitor attraction. Explore the diversity of the natural world, world cultures, science and technology, art, design and fashion, and Scottish history, all under one roof. Free entry!",
                R.drawable.i6,
                10, 0, 6));

        challenges.add(new Challenge("Scottish National Gallery",
                "Collections of fine art situated in the heart of Edinburgh. Free entry!",
                "Situated in the heart of Edinburgh, the Scottish National Gallery is home to one of the best collections of fine art in the world. Free entry!",
                R.drawable.i7,
                10, 0, 7));



        challenges.add(new Challenge("Greyfriarís Kirkyard",
                "Graveyard predating the establishment of the Kirk in 1620. Beloved by Potter fans, many seek out the headstones that inspired names for characters in the series.",
                "24-hour access to the public, this graveyard predates the establishment of the Kirk in 1620. Although popularly associated with Greyfriars Bobby, this site was the setting for many historical events of national significance, including the imprisoning of Covenanters after the Battle of Bothwell Bridge in 1679. Beloved by Potter fans, many seek out the headstones that inspired names for characters in the series.",
                R.drawable.i9,
                15, 0, 9));

        challenges.add(new Challenge("Princes Street Gardens",
                "The former site of the \"Norí Loch\" (or North Lake), this public park has beautiful green gardens and pathways for you to venture between Edinburghís Old and New Towns.",
                "The former site of the \"Norí Loch\" (or North Lake), this public park has beautiful green gardens and pathways for you to venture between Edinburghís Old and New Towns.",
                R.drawable.i10,
                10, 1, 10));

        challenges.add(new Challenge("Calton Hill",
                "The panoramic views from Calton Hill have astonished and inspired visitors for centuries.",
                "The panoramic views from Calton Hill have astonished and inspired visitors for centuries. Major landmarks can be seen from a birdís eye view: Arthurís Seat with the Crags behind Holyrood Palace and the Parliament, Leith and the Firth of Forth, Princes Street in its New Town grid and the Royal Mile climbing up towards the Castle.",
                R.drawable.i11,
                15, 1, 11));

        challenges.add(new Challenge("Edinburgh Gin Distillery Tours",
                "Learn about the history of gin, discover the botanicals used in our recipes, and have a tasting of our classic G&T.",
                "Learn about the history of gin, taking in Edinburghís distilling past in our exhibition area, then experience up close in our still room how we make it today using our two working copper stills. Youíll have a chance to discover the botanicals used in our recipes, finishing with a tasting of a classic Edinburgh G&T, or for those who prefer, a miniature to take home. The tour price includes a 10% discount on purchases from our on-site gift shop.",
                R.drawable.i12,
                15, 0, 12));

        challenges.add(new Challenge("Mystery of Gilmerton Cove",
                "One of Scotland's most curious sights, Gilmerton Cove is a series of chambers and passageways lying hidden beneath the streets of Edinburgh.",
                "Enter one of Scotland's most curious heritage sites. An archeological mystery that has baffled investigators for over 300 years. Gilmerton Cove is a series of chambers and passageways lying hidden beneath the streets on the South side of Edinburgh. Join us on a guided tour and help us unravel the mysteries of this strange mysterious labyrinth. Please note this attraction is by appointment only, please call to book a slot.",
                R.drawable.i13,
                50, 0, 13));



        challenges.add(new Challenge("Gorgie City Farm & Cafe",
                "A FREE entry urban farm & cafe with a play park for kids.",
                "Gorgie City Farm is a much loved green breathing space for the local community and visitors, free and available for all to enjoy. An urban farm and play park for kids, we have many different animals on our land from chickens, ducks, and cattle to pigs, sheep and goats, even land snails and tortoises. We have an education garden, herb and sensory garden, several greenhouses, a poly-tunnel and a vegetable garden.",
                R.drawable.i15,
                50, 0, 15));

        challenges.add(new Challenge("Wild West Cowboy Street",
                "Hidden in a street in Edinburgh's Morningside neighborhood lies the Wild West street, an offbeat Edinburgh quirk.",
                "Hidden in a street in Morningside lies Edinburghís Wild West.  It was built in the mid 90s as part of the ambience of the sales area for a furniture business, which specialised in Southwestern style.  There were a number of let units in ëEl Pasoí too, occupied by ceramists and other artists. The project took six months and by great stroke of good luck, one of the employees, and his very talented girlfriend, had worked on the construction of Euro Disney ñ hence the authentic paint effects and signage.",
                R.drawable.i16,
                50, 0, 16));

        challenges.add(new Challenge("Royal Yacht Britannia",
                "Step aboard The Queen's former floating palace and experience this iconic 5 star attraction for yourself. Rated Scotland's Best Attraction for 11 years running",
                "Step aboard The Queen's former floating palace and experience this iconic 5 star attraction for yourself. Rated Scotland's Best Attraction for 11 years running. Britannia is one of the most famous ships in the world. Sailing a million miles on a thousand official visits, during 40 years in service, the Royal Yacht played host to glittering state banquets and official receptions, but was also home to the Royal Family and crew of 220 Royal Yachtsmen. Explore Britannia's highly accessible 5 decks with highlights including the elegant Royal Apartments, Crew's Quarters, Engine Room and stunning Royal Deck Tea Room. FREE audio guide in 30 languages and British Sign Language Tablet. Highly accessible for wheelchairs and buggies. Open year round with FREE parking for 1600 cars at Ocean Terminal. Only 15 minutes from Edinburgh city centre (local buses every 10 minutes - 11, 22, 34 and 35 to Ocean Terminal).",
                R.drawable.i17,
                25, 0, 17));

        challenges.add(new Challenge("Fairy Pools",
                "A magical place of outstanding natural beauty at the foot of the Black Cuillin mountains.",
                "A magical place of outstanding natural beauty at the foot of the Black Cuillin mountains. The Fairy Pools is becoming increasingly popular so when you visit, please drive carefully on the single track roads, follow the parking enforcement notices and take all your litter away with you. There is a WC at the nearby Glenbrittle Campsite along with some great coffee c/o the Cuillin Coffee Co. Thank you and we hope you enjoy your visit!",
                R.drawable.i18,
                100, 0, 18));





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
                    case 12:
                        obj = challenges.get(12);
                        intent.putExtra("userTag",obj);
                        startActivity(intent);
                        break;
                    case 13:
                        obj = challenges.get(13);
                        intent.putExtra("userTag",obj);
                        startActivity(intent);
                        break;
                    case 14:
                        obj = challenges.get(14);
                        intent.putExtra("userTag",obj);
                        startActivity(intent);
                        break;
                    case 15:
                        obj = challenges.get(15);
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
            Intent tweetIntent = new Intent(Intent.ACTION_SEND);
            tweetIntent.putExtra(Intent.EXTRA_TEXT, "Test tweet");
            tweetIntent.setType("application/twitter");

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
