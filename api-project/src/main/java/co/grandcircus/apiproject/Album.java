package co.grandcircus.apiproject;


public class Album {

    private String title;
    private String cover;



    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getCover() {
        return cover;
    }


    public void setCover(String cover) {
        this.cover = cover;
    }

    public Album() {}


    public Album(String title, String cover) {
        this.title = title;
        this.cover = cover;
    }



}
