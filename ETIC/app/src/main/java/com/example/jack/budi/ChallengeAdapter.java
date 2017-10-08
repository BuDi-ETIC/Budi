package com.example.jack.budi;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jackhorsburgh on 07/10/2017.
 */

public class ChallengeAdapter extends ArrayAdapter {

    public ChallengeAdapter(Activity context, ArrayList<Challenge> challenge) {
        super(context, 0, challenge);
    }


    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.achievement_list_view, parent, false);
        }

        Challenge challengePos = (Challenge) getItem(position);



            //find the text view of the custom view
            TextView title = (TextView) listItemView.findViewById(R.id.title_challenge);

            //Set the text in the TextView
            title.setText(challengePos.getTitle());

            //find the text view of the custom view
            TextView description = (TextView) listItemView.findViewById(R.id.description_challenge);

            //Set the text in the TextView
            description.setText(challengePos.getDescription());

            //Find the Image view of the custom view
            ImageView imgChallenge = (ImageView) listItemView.findViewById(R.id.image_challenge);


            switch (challengePos.getPoints()) {
                case 10:
                    imgChallenge.setImageResource(R.drawable.ic_10);
                    break;
                case 15:
                    imgChallenge.setImageResource(R.drawable.ic_menu_camera);
                    break;
                case 25:
                    imgChallenge.setImageResource(R.drawable.ic_25);
                    break;
                case 50:
                    imgChallenge.setImageResource(R.drawable.ic_menu_camera);
                    break;
                case 100:
                    imgChallenge.setImageResource(R.drawable.ic_100);
                    break;
                case 150:
                    imgChallenge.setImageResource(R.drawable.ic_menu_camera);
                    break;
                case 200:
                    imgChallenge.setImageResource(R.drawable.ic_200);
                    break;
            }



        ImageView picChallenge = (ImageView) listItemView.findViewById(R.id.pic_challenge);
        picChallenge.setImageResource(challengePos.getImage());










            //return the listItemView (containing 2 TextViews)
            return listItemView;

        }
    }


