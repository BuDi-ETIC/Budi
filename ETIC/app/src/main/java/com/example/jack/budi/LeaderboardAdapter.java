package com.example.jack.budi;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.jack.budi.R.id.leaderboard_background;

/**
 * Created by jackhorsburgh on 07/10/2017.
 */

public class LeaderboardAdapter extends ArrayAdapter {

    private int i =0 ;
    public LeaderboardAdapter(Activity context, ArrayList<Player> players){
        super(context, 0 , players);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.leaderboard_list_view, parent, false);
        }



        Player player = (Player) getItem(position);


        //find the text view of the custom view
        TextView playerName = (TextView) listItemView.findViewById(R.id.leaderboard_username);

        //Set the text in the TextView
        playerName.setText(player.getUsername());


        //find the text view of the custom view
        TextView playerLvlName = (TextView) listItemView.findViewById(R.id.leaderboard_lvl_name);

        if (isBetween(player.getGameScore(),0,24)){
            playerLvlName.setText("Newbie");
        }else if(isBetween(player.getGameScore(),25,99)){
            playerLvlName.setText("Wee Yin");
        }else if(isBetween(player.getGameScore(),100,249)){
            playerLvlName.setText("Traveler");
        }else if(isBetween(player.getGameScore(),250,499)){
            playerLvlName.setText("Clansman");
        }else if(isBetween(player.getGameScore(),500,1000) ){
            playerLvlName.setText("Yer Local");
        }else if(1000<player.getGameScore()) {
            playerLvlName.setText("True Scot");
        }

        //find the text view of the custom view
        TextView playerScore = (TextView) listItemView.findViewById(R.id.leaderboard_points);
        playerScore.setText(player.getGameScore()+"");

        TextView pPosition = (TextView) listItemView.findViewById(R.id.leaderboard_rank);
        pPosition.setText(player.getpID()+"");



        //return the listItemView (containing 3 TextViews)
        return listItemView;



    }

    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }
}
