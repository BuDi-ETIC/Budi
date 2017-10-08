package com.example.jack.budi;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jackhorsburgh on 07/10/2017.
 */

public class Challenge implements Parcelable {
    private String title;
    private String description;
    private String descriptionLong;
    private int image;
    private int points;
    private int completed;
    private int cID;


    public Challenge(String title, String description, String descriptionLong, int image, int points, int completed,int cID){
        this.title=title;
        this.description=description;
        this.descriptionLong=descriptionLong;
        this.image=image;
        this.points=points;
        this.completed=completed;
        this.cID=cID;
    }

    public int getImage() {return  image;}

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
        String[] data= new String[7];

        in.readStringArray(data);
        this.title= data[0];
        this.description= data[1];
        this.descriptionLong= data[2];
        this.image=Integer.parseInt(data[3]);
        this.points= Integer.parseInt(data[4]);
        this.completed= Integer.parseInt(data[5]);
        this.cID= Integer.parseInt(data[6]);
    }
    @Override
    public int describeContents() {
// TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
// TODO Auto-generated method stub

        dest.writeStringArray(new String[]{this.title,this.description,this.descriptionLong,String.valueOf(this.image),String.valueOf(this.points),String.valueOf(this.completed),String.valueOf(this.cID)});
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

    public String getDescriptionLong() {
        return descriptionLong;
    }

    public void setDescriptionLong(String descriptionLong) {
        this.descriptionLong = descriptionLong;
    }

}

