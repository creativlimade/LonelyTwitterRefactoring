package ca.ualberta.cs.lonelytweet;

import java.io.Serializable;
import java.util.Date;

public class LonelyTweet extends 
LonelyTweet {

	private static final long serialVersionUID = 1L;
	protected Date tweetDate;
	protected String tweetBody;

	public LonelyTweet() {
	}

	public LonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody();
	}
}