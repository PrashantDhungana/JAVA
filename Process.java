import java.util.Scanner;

public class Process {
    private SongList songList = new SongList();

    public void fillData()
    {
        songList.add(new Song("Anmol Gurung ", "Babari Rang"));
        songList.add(new Song("Pushpan Pradhan", "Kehi Aadha"));
        songList.add(new Song("Sujan Chapagain", "Gala Pukka"));
        songList.add(new Song("Queen", "Bohemian Rhapsody"));
        songList.add(new Song("Ashutosh KC", "Maya"));
        songList.add(new Song("Neetsh Jung Kunwar", "Gedai Jasto Jindagi"));
        songList.add(new Song("SD YOGI", "Keshari"));
        songList.add(new Song("Sushant KC", "Risaune Bhaye"));
        songList.add(new Song("Swoopna Suman", "Kasari Bhanu"));
        songList.add(new Song("Queen", "I want to break free"));
    }

    public void inputSong()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Artist");
        artist = scan.nextLine();

        System.out.println("Enter Title");
        title = scan.nextLine();

        songList.add(new Song(artist, title));
        
    }

    public Song getSong(int index)
    {
        return  songList.get(index);
    }

    public void printSongs()
    {
        for (int i = 0; i < alSongs.size(); i++)
        {
            s = songList.get(i);
            System.out.println(s.getArtist()+"\t"+s.getTitle());
        
        }
    }

    public void getData()
    {
        Song song = songList.get(1);
        System.out.println(song);
        
    }


}
