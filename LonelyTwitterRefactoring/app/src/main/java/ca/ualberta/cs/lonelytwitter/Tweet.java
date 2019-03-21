package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

public abstract class Tweet {
    Date tweetDate;
    String tweetBody;

    private Date getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    String getTweetBody() {
        return tweetBody;
    }

    public void setTweetBody(String tweetBody) {
        this.tweetBody = tweetBody;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(tweetDate);
        out.writeObject(tweetBody);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        tweetDate = (Date) in.readObject();
        tweetBody = (String) in.readObject();
    }

    @Override
    public String toString() {
        return getTweetDate() + " | " + getTweetBody() ;
    }
}
