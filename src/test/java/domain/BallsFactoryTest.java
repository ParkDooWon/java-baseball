package domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsFactoryTest {
    @Test
    void Player_야구공_리스트를_제대로_생성하는지_테스트() {
        List<Ball> testBalls = Arrays.asList(Ball.createBall(1)
                , Ball.createBall(2)
                , Ball.createBall(3));

        assertThat(BallsFactory.createPlayerBalls("123")).isEqualTo(testBalls);
    }

    @Test
    void Computer_야구공_리스트를_제대로_생성하는지_테스트() {
        List<Ball> testBalls = Arrays.asList(Ball.createBall(1)
                , Ball.createBall(2)
                , Ball.createBall(3));
        Generator manualNumberGenerator = new ManualNumberGenerator();

        assertThat(BallsFactory.createComputerBalls(manualNumberGenerator)).isEqualTo(testBalls);
    }
}
