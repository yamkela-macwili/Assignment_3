//MusicAlbumApp.java
package com.gmail.yamkela22y;
import javax.swing.JOptionPane;

public class MusicAlbumApp {
		
	public static void main(String[] args)
	{
		for(int counter = 1; counter <=5; counter++)
		{
			MusicAlbum myAlbum = new MusicAlbum();
				
			String title = JOptionPane.showInputDialog(null, "Enter the title of Album ") ;
			String artistName = JOptionPane.showInputDialog(null, "Enter the Artist Name ");
			String numTrack = JOptionPane.showInputDialog(null, "Enter the number of Tracks in the Album ") ;
			int numberOfTracks=Integer.parseInt(numTrack);
			String[] trackNames = new String[numberOfTracks] ;
				
			for (int i =0; i < numberOfTracks; i++)
			{
				trackNames[i] = JOptionPane.showInputDialog(null, "Enter Track Name And the minutes");
				myAlbum.setTrackNames(trackNames);
			}
		
			myAlbum.setTitle(title);
			myAlbum.setArtistName(artistName);
			myAlbum.setNumberOfTrack(numberOfTracks);
			myAlbum.setTrackNames(trackNames);
			
			JOptionPane.showMessageDialog(null, myAlbum.toString(), "Music Album",1);
			JOptionPane.showMessageDialog(null, myAlbum.getTrackNames(),"TRACKS" ,1);
		}
		
		System.exit(0);
	}
}
