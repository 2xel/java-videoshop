import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VideoShopTest {
    @Test
    public void 고객은_이름을_가지고_있다() {
        Customer customer = new Customer();
        customer.name = "jaemin";
        assertThat(customer.name).isEqualTo("jaemin");
    }

    @Test
    public void 비디오는_영화_스포츠_다큐멘터리가_있다() {
        assertThat(Video.VideoType.MOVIDE).isNotNull();
        assertThat(Video.VideoType.SPORT).isNotNull();
        assertThat(Video.VideoType.DOCUMENTARY).isNotNull();
    }

    @Test
    public void 비디오는_대여요금_대여기간을_가지고_있다() {
        Video video = new Video();
        video.dailyRentalFee = 1000;
        video.rentalPeriod = 3;
        assertThat(video.dailyRentalFee).isEqualTo(1000);
        assertThat(video.rentalPeriod).isEqualTo(3);
    }

    @Test
    public void 고객은_여러개의_비디오를_대여할_수_있다() {
        Customer customer = new Customer();
        Video video1 = new Video();
        Video video2 = new Video();
        customer.borrowVideo(video1);
        customer.borrowVideo(video2);
        assertThat(customer.borrowedVideos.size()).isEqualTo(2);
    }
}