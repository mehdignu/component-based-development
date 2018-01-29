package de.htwBerlin.ai.kbe.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "song")
@Entity
@Table(name = "Song")
public class Song {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String artist;
	private String album;
	private Integer released;
	
//	@ManyToMany(mappedBy="songs",fetch=FetchType.EAGER)
//	private List<SongLists> songlists ;


	public Song(String title, String album,String artist, Integer released) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.released = released;
	}

	public Song() {
	}
	
//    public List<SongLists> getSonglists() {
//        if(songlists == null) {
//        	songlists =  new ArrayList<SongLists>();
//        }
//        return songlists;
//    }
//
//    public void setSonglists(List<SongLists> songlists) {
//        this.songlists = songlists;
//    }
    


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public Integer getReleased() {
		return released;
	}

	public void setReleased(Integer released) {
		this.released = released;
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", title=" + title + ", artist=" + artist + ", album=" + album + ", released="
				+ released + "]";
	}

}
