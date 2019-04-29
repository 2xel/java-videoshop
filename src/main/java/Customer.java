import java.util.ArrayList;
import java.util.List;

public class Customer {
    public String name;
    public List<Video> borrowedVideos = new ArrayList<>();

    public void borrowVideo(Video video) {
        borrowedVideos.add(video);
    }
}
