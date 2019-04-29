import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {
    @Test
    public void 고객은_이름을_가지고_있다() {
        Customer customer = new Customer("jaemin");
        assertThat(customer.getName()).isEqualTo("jaemin");
    }

    @Test
    public void 고객의_이름은_대소문자를_구별하지_않는다() {
        Customer customer1 = new Customer("jAeMiN");
        Customer customer2 = new Customer("jaemin");
        assertThat(customer1).isEqualTo(customer2);
    }

    @Test
    public void 고객은_여러개의_비디오를_대여할_수_있다() {
        Customer customer = new Customer("jaemin");
        customer.borrowVideo(new Video(Video.VideoType.MOVIE, "어벤져스", 1000, 3));
        customer.borrowVideo(new Video(Video.VideoType.SPORT, "프리미어리그", 500, 7));
        assertThat(customer.borrowedVideos.size()).isEqualTo(2);
    }

    @Test
    public void 총대여가격() {
        Customer customer = new Customer("jaemin");
        customer.borrowVideo(new Video(Video.VideoType.MOVIE, "어벤져스", 1000, 3));
        customer.borrowVideo(new Video(Video.VideoType.SPORT, "프리미어리그", 500, 7));
        assertThat(customer.calculateRentalFee()).isEqualTo(6500);
        customer.borrowVideo(new Video(Video.VideoType.DOCUMENTARY, "그것이 알고싶다", 300, 14));
        assertThat(customer.calculateRentalFee()).isEqualTo(10700);
    }
}