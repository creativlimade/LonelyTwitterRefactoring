package ca.ualberta.cs.lonelytweet;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public class ImportantLonelyTweet implements Serializable
{

	public ImportantLonelyTweet()
	{

		super();
	}

	public Date getTweetDate()
	{
		return tweetDate;
	}

	public void setTweetDate(Date tweetDate)
	{
		this.tweetDate = tweetDate;
	}



	public void setTweetBody(String tweetBody)
	{
		this.tweetBody = tweetBody;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException
	{
		out.writeObject(tweetDate);
		out.writeObject(tweetBody);
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException,
			ClassNotFoundException
	{
		tweetDate = (Date) in.readObject();
		tweetBody = (String) in.readObject();
	}
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20) {
			return false;
		}

		return true;
	}
	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody();
	}
	
	public String getTweetBody()
	{
		return tweetBody.toUpperCase();
	}

}