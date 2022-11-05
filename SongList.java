import java.util.ArrayList;

public class SongList {
    private ArrayList<Song> Songs = new ArrayList<>();


    public boolean add(Song pSong) {
        return Songs.add(pSong);
    }

    public Song get(int index) {
        return Songs.get(index);
    }

}