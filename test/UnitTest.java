/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static org.junit.Assert.*;
import src.driver.album.java.*;
import org.junit.Test;

/**
 *
 * @author ACER
 */
public class AlbumTest {
    @Test
    public void tesPlay(){
        Song testSong = new Song();

        int dataInput = 130;
        String expectedResult =  "Intermediate";
        testSong.setDuration()
        assertEquals(testSong.play(), expectedResult)

    };
}
