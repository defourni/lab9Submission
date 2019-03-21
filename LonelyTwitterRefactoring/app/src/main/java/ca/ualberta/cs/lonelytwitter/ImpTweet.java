package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImpTweet extends Tweet {

    public ImpTweet() {
    }

    public ImpTweet(String text, Date date) {
        this.tweetDate = date;
        this.tweetBody = text;
    }

    public boolean isValid(){
        int length = getTweetBody().trim().length();
        return length >= 10
                && length <= 100;
    }
}
