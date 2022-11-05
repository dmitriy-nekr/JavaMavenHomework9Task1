import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setCurrentStation() {
        Radio radio = new Radio();
        int actual = radio.setCurrentStation(8);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation1() {
        Radio radio = new Radio();
        int actual = radio.setCurrentStation(12);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation2() {
        Radio radio = new Radio();
        int actual = radio.setCurrentStation(-1);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int actual = radio.next();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int actual = radio.next();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int actual = radio.prev();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int actual = radio.prev();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 10;
        int actual = radio.increaseVolume();
        int expected = 10;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldIncreaseVolume1() {
        Radio radio = new Radio();
        radio.currentVolume = 9;
        int actual = radio.increaseVolume();
        int expected = 10;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        int actual = radio.reduceVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldReduceVolume1() {
        Radio radio = new Radio();
        radio.currentVolume = 1;
        int actual = radio.reduceVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
}
