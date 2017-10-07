package com.example.jack.budi;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jackhorsburgh on 07/10/2017.
 */

public class Challenge implements Parcelable {
    private String title;
    private String description;
    private int points;
    private int completed;

    public Challenge(String title, String description, int points, int completed){
        this.title=title;
        this.description=description;
        this.points=points;
        this.completed=completed;

    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //parcel part
    public Challenge(Parcel in){
        String[] data= new String[4];

        in.readStringArray(data);
        this.title= data[0];
        this.description= data[1];
        this.points= Integer.parseInt(data[2]);
        this.completed= Integer.parseInt(data[3]);
    }
    @Override
    public int describeContents() {
// TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
// TODO Auto-generated method stub

        dest.writeStringArray(new String[]{this.title,this.description,String.valueOf(this.points),String.valueOf(this.completed)});
    }

    public static final Parcelable.Creator<Challenge> CREATOR= new Parcelable.Creator<Challenge>() {

        @Override
        public Challenge createFromParcel(Parcel source) {
// TODO Auto-generated method stub
            return new Challenge(source);  //using parcelable constructor
        }

        @Override
        public Challenge[] newArray(int size) {
// TODO Auto-generated method stub
            return new Challenge[size];
        }
    };

}

