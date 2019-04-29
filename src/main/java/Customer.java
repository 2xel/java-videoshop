import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    @Getter
    private String name;
    public List<Video> borrowedVideos = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void borrowVideo(Video video) {
        borrowedVideos.add(video);
    }

    public int calculateRentalFee() {
        return borrowedVideos.stream().mapToInt(video -> video.getDailyRentalFee()*video.getRentalPeriod()).sum();
    }

    @Override
    public boolean equals(Object obj) {
        Customer customer = (Customer) obj;
        return name.toLowerCase().equals(customer.getName().toLowerCase());
    }
}
