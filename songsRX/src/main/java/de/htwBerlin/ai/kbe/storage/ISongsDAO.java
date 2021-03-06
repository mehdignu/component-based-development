package de.htwBerlin.ai.kbe.storage;

import java.util.Collection;

import de.htwBerlin.ai.kbe.bean.Song;

/**
 * CRUD -> U not yet implemented
 * @author 
 *
 */
public interface ISongsDAO {

	/**
	 * Retrieves a Song
	 * 
	 * @param id
	 * @return
	 */
	public Song findSongById(Integer id);

	/**
	 * Retrieves all Songs
	 * 
	 * @return
	 */
	public Collection<Song> findAllSongs();

	/**
	 * Save a new Song
	 * 
	 * @param Song
	 * @return the Id of the new Songs
	 */
	public Integer saveSong(Song Song);

	/**
	 * Deletes the Song for the provided id
	 * 
	 * @param id
	 */
	public boolean deleteSong(Integer id);
	
	
    /**
     * need for put request song service
     * returns true (success), when contact exists in map and was updated
	 * returns false, when Song does not exist in database
     * @param song
     * @param id
     * @return
     */
	public static boolean updateSong(Song song,Integer id) { /* TODO */  return false;};
}
