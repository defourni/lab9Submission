package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class NormalLonelyTweet extends Tweet {

	public NormalLonelyTweet() {
	}

	NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	boolean isValid() {
		int length = getTweetBody().trim().length();
		return length != 0
				&& length <= 10;
	}

}