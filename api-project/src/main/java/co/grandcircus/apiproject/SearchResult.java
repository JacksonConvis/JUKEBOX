package co.grandcircus.apiproject;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("favorites")
public class SearchResult {
    @Id
    private String id;
    private String title;
    // private String link;
    private int duration;
    private String preview;
    private Artist artist;
    private Album album;
    private boolean liked;

    public boolean isLiked() {
		return liked;
	}

	public void setLiked(boolean liked) {
		this.liked = liked;
	}

	public String getId() {
        return id;
    }

    public void set_Id(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public SearchResult() {}
    public SearchResult(String id, String title, int duration, String preview, Artist artist,
            Album album, boolean liked) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.preview = preview;
        this.artist = artist;
        this.album = album;
        this.liked = liked;
    }



}
