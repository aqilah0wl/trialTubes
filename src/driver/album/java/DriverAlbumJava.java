/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver.album.java;

/**
 *
 * @author ACER
 */
public class DriverAlbumJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Song song1 = new Song();
        Song song2 = new Song()
        System.out.println("Hello World");
        song1.setTitle("Melukis Senja");
        song1.setArtist("Budi Doremi");
        song1.setDuration(240);
        
        song2.setTitle("Photography");
        song2.setArtist("Ed Sheeran");
        song2.setDuration(274);
        
        Album album = new Album();
        album.setTitle("Pernah Hits");
        album.setYear(2021);
        album.setTotalSongs(2);
        album.addSong(song1);
        album.addSong(song2);
        album.displayInfo();
    }
    
}
