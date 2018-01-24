package de.htwBerlin.ai.kbe.storage;

import java.util.Collection;

import de.htwBerlin.ai.kbe.bean.SongLists;

/**
 * CRD -> implemented all , U not required
 * @author 
 *
 */
public interface ISongListsDAO {

	/**
	 * Retrieves a SongLists
	 * 
	 * @param id
	 * @return
	 */
	public SongLists findSongListsById(Integer id);

	/**
	 * Retrieves all SongListss
	 * 
	 * @return
	 */
	public Collection<SongLists> findAllSongLists(String id);

	/**
	 * Save a new SongLists
	 * 
	 * @param SongLists
	 * @return the Id of the new SongListss
	 */
	public Integer saveSongLists(SongLists SongLists);

	/**
	 * Deletes the SongLists for the provided id
	 * 
	 * @param id
	 */
	public void deleteSongLists(Integer id);
}