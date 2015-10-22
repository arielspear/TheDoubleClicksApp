package arielspear.thedoubleclicksapp.models;

import java.util.ArrayList;

/**
 * Created by Ariel Spear on 10/22/15.
 */
public class Album {
    private String mName;
    private String mDate;
    private String mLink;
    private ArrayList<String> mSongs;

    public Album( String name, String date, String link, ArrayList<String> songs) {
        mName = name;
        mDate = date;
        mLink = link;
        mSongs = songs;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getLink() {
        return mLink;
    }

    public void setLink(String link) {
        mLink = link;
    }

    public ArrayList<String> getSongs() {
        return mSongs;
    }

    public void setSongs(ArrayList<String> songs) {
        mSongs = songs;
    }
}
