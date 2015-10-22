package arielspear.thedoubleclicksapp.models;

import java.util.ArrayList;

/**
 * Created by Ariel Spear on 10/22/15.
 */
public class AlbumLib {
    private ArrayList<Album> mAlbums;

    public AlbumLib() {
        setAlbums();
    }

    private void setAlbums() {
        mAlbums = new ArrayList<>();

        ArrayList<String> mBetaTestingSongs = new ArrayList<>();
        mBetaTestingSongs.add("Always Be Here (WoW)");
        mBetaTestingSongs.add("This Fantasy World");
        mBetaTestingSongs.add("Dungeons and Dragons");
        mBetaTestingSongs.add("Modern Poetry");
        mBetaTestingSongs.add("Sent from my iPhone");
        mBetaTestingSongs.add("Technical Writer");
        mBetaTestingSongs.add("Jury Duty");
        mBetaTestingSongs.add("Apostrophe");
        mBetaTestingSongs.add("Noob Cannon");
        mBetaTestingSongs.add("I Hate Beatboxing");
        mBetaTestingSongs.add("Godzilla");
        mBetaTestingSongs.add("Lonely Like Me");

        ArrayList<String> mPresidentSnakesSongs = new ArrayList<>();
        mPresidentSnakesSongs.add("Tiny Paper Elephant");
        mPresidentSnakesSongs.add("Cats At Parties");
        mPresidentSnakesSongs.add("Really Big Chickens");
        mPresidentSnakesSongs.add("President Snakes (Part 1)");
        mPresidentSnakesSongs.add("The Middle");
        mPresidentSnakesSongs.add("This Is My Jam");
        mPresidentSnakesSongs.add("Happy Holidays, Too");
        mPresidentSnakesSongs.add("Bad Memories");
        mPresidentSnakesSongs.add("President Snakes (Part 2)");
        mPresidentSnakesSongs.add("Now I Am The Fastest");
        mPresidentSnakesSongs.add("Why Can't Every City Be Portland?");
        mPresidentSnakesSongs.add("Coming Home To You");
        mPresidentSnakesSongs.add("Thank God It's Over");

        ArrayList<String> mDimetrodonSongs = new ArrayList<>();
        mDimetrodonSongs.add("Cats and Netflix");
        mDimetrodonSongs.add("Unstoppable Force");
        mDimetrodonSongs.add("Dimetrodon");
        mDimetrodonSongs.add("Ennui (On We Go)");
        mDimetrodonSongs.add("Where Did You Go?");
        mDimetrodonSongs.add("Wonder");
        mDimetrodonSongs.add("Internet Troll");
        mDimetrodonSongs.add("Working For Me");
        mDimetrodonSongs.add("Tabletop (featuring Adam Warrock)");
        mDimetrodonSongs.add("Godzilla");
        mDimetrodonSongs.add("Love You Like A Burrito");
        mDimetrodonSongs.add("Will They Or Won't They (live in Seattle)");
        mDimetrodonSongs.add("Clever Girl (live in Seattle)");

        ArrayList<String> mLasersSongs = new ArrayList<>();
        mLasersSongs.add("Lasers and Feelings");
        mLasersSongs.add("Can't You See The World Is Ending");
        mLasersSongs.add("The Guy Who Yelled Freebird");
        mLasersSongs.add("Something Else");
        mLasersSongs.add("The Mystery's Gone");
        mLasersSongs.add("Nothing To Prove");
        mLasersSongs.add("Impostor");
        mLasersSongs.add("Rock Star Life");
        mLasersSongs.add("Christmas Ain't About Me");
        mLasersSongs.add("Oh, Mr. Darcy");

        ArrayList<String> mChainmailSongs = new ArrayList<>();
        mChainmailSongs.add("Oh, Mr. Darcy");
        mChainmailSongs.add("Spock Impersonator");
        mChainmailSongs.add("The Nerdy Birthday Song");
        mChainmailSongs.add("Apostrophe");
        mChainmailSongs.add("No Easy Way");
        mChainmailSongs.add("Clever Girl");
        mChainmailSongs.add("The Way I Glow");
        mChainmailSongs.add("The Internet National Anthem");
        mChainmailSongs.add("Don't You Love Me?");
        mChainmailSongs.add("Will They or Won't They?");
        mChainmailSongs.add("Worst Superpower Ever");
        mChainmailSongs.add("A Lullaby For Mr. Bear (adult version)");
        mChainmailSongs.add("A Song about EVE Online");
        mChainmailSongs.add("Ironically");
        mChainmailSongs.add("This Fantasy World");


        mAlbums.add(new Album(
                "President Snakes",
                "August 2015",
                "http://thedoubleclicks.bandcamp.com/album/president-snakes",
                mPresidentSnakesSongs
        ));

        mAlbums.add(new Album(
                "Dimetrodon",
                "June 2014",
                "http://thedoubleclicks.bandcamp.com/album/dimetrodon",
                mDimetrodonSongs
        ));

        mAlbums.add(new Album(
                "Lasers and Feelings",
                "July 2013",
                "http://thedoubleclicks.bandcamp.com/album/lasers-and-feelings",
                mLasersSongs
        ));

        mAlbums.add(new Album(
                "Chainmail and Cello",
                "April 2012 ",
                "http://thedoubleclicks.bandcamp.com/album/chainmail-and-cello",
                mChainmailSongs
        ));

        mAlbums.add(new Album(
                "Beta Testing 1-2-3",
                "2010",
                "http://thedoubleclicks.bandcamp.com/album/beta-testing-1-2-3",
                mBetaTestingSongs
        ));
    }

}
