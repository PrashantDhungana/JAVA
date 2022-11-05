public class Song{
    
    public static ArrayList<Song> songList;
    public String artist, title;
    public Integer play;

    public Song(String artist, String title){
        songList = new ArrayList<Song>(); 
        this.artist = artist;
        this.title = title;
        this.play = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Integer getPlay() {
        return play;
    }

    @Override
    public String toString()
    {
        return artist + " - " + title + " (" + play + "s)";
    }
}
  