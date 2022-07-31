package co.grandcircus.apiproject;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Favorites")
public class SearchResult {
    @Id
    private String id;
    private String title;
    private String link;
    private int duration;
    private String preview;
    private Artist artist;
    private Album album;
    private String type;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SearchResult() {}

    public SearchResult(String id, String title, String link, int duration, String preview,
            Artist artist, Album album, String type) {
        this.id = id;
        this.title = title;
        this.link = link;
        this.duration = duration;
        this.preview = preview;
        this.artist = artist;
        this.album = album;
        this.type = type;
    }



}
