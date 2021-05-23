//MusicAlbum.java
package com.gmail.yamkela22y;
/**
 * @author YAMKELA MACWILI
 * @version 1.0 
 */
public class MusicAlbum {
	
	private String title;
	private String artistName;
	private int numberOfTracks;
	private String[] trackNames;
	
	public MusicAlbum()
	{
		title = "";
		artistName = "";
		numberOfTracks = 0;
		trackNames = new String[numberOfTracks];
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setArtistName(String artistName)
	{
		this. artistName = artistName;
	}

	public void setNumberOfTrack(int numberOfTracks)
	{
		this.numberOfTracks = numberOfTracks;
	}
	
	public void setTrackNames(String[] trackNames)
	{
			this.trackNames = trackNames;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getArtisttName() 
	{
		return artistName;
	}
	
	public int getNumberOfTracks()
	{
		return numberOfTracks;
	}
	
	public String[] getTrackNames()
	{
		return trackNames;
	}
	
	@Override
	
	public String toString()
	{
		return " Album title: "+ title+ "\n Artist Name: "+ artistName + "\n\n\n"+ "Press OK to displya Tracks";
	}
}