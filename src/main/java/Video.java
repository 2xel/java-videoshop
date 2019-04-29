import lombok.Getter;

public class Video {

    public enum VideoType {
        SPORT, MOVIE, DOCUMENTARY
    }

    @Getter
    private VideoType videoType;
    @Getter
    private String name;
    @Getter
    private int dailyRentalFee;
    @Getter
    private int rentalPeriod;

    public Video(VideoType videoType, String name, int dailyRentalFee, int rentalPeriod) {
        this.videoType = videoType;
        this.name = name;
        this.dailyRentalFee = dailyRentalFee;
        this.rentalPeriod = rentalPeriod;
    }

}
