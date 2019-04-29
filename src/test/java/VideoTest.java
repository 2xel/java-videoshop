import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VideoTest {
    @Test
    public void 비디오는_영화_스포츠_다큐멘터리가_있다() {
        assertThat(Video.VideoType.MOVIE).isNotNull();
        assertThat(Video.VideoType.SPORT).isNotNull();
        assertThat(Video.VideoType.DOCUMENTARY).isNotNull();
    }

    @Test
    public void 비디오는_대여요금_대여기간을_가지고_있다() {
        Video video = new Video(Video.VideoType.MOVIE, "어벤져스", 1000, 3);
        assertThat(video.getDailyRentalFee()).isEqualTo(1000);
        assertThat(video.getRentalPeriod()).isEqualTo(3);
    }

}
