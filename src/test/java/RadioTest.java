import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    @Test //тест переключение вперед
    public void testNextNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(2);
        radio.nextNumber();
        int expected = 3;
        int actual = radio.getNumberOfCurrentRadiostaion();
        Assertions.assertEquals(expected, actual);
    }

    @Test //тест переключение назад
    public void testPrevNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(2);
        radio.prevNumber();
        int expected = 1;
        int actual = radio.getNumberOfCurrentRadiostaion();
        Assertions.assertEquals(expected, actual);
    }

    @Test //тест при нажатии вперед после максимального номера должно перелючаться на 0
    public void testNextNumberAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(9);
        radio.nextNumber();
        int expected = 0;
        int actual = radio.getNumberOfCurrentRadiostaion();
        Assertions.assertEquals(expected, actual);
    }

    @Test //тест при нажатии назад при минимальном значении должно переключаться на 9
    public void testNextNumberBeforeMin() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(0);
        radio.prevNumber();
        int expected = 9;
        int actual = radio.getNumberOfCurrentRadiostaion();
        Assertions.assertEquals(expected, actual);
    }

    @Test // клиент имеет возможность выставлять номер станции через указание ее номера
    public void testGiveNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(2);
        int expected = 2;
        int actual = radio.getNumberOfCurrentRadiostaion();
        Assertions.assertEquals(expected, actual);
    }

    @Test //Номер текущей радиостанции может принимать значения только в пределах от 0 до 9
    public void testAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(10);
        radio.nextNumber();
        int expected = 1;
        int actual = radio.getNumberOfCurrentRadiostaion();
        Assertions.assertEquals(expected, actual);
    }

    @Test //Номер текущей радиостанции может принимать значения только в пределах от 0 до 9
    public void testBeforeMin() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(-1);
        radio.prevNumber();
        int expected = 9;
        int actual = radio.getNumberOfCurrentRadiostaion();
        Assertions.assertEquals(expected, actual);
    }

    @Test //тест возможность увеличивать громкость
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.increaseVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test //возможность увеличивать до 100
    public void testIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(105);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test //возможность уменьшить до 0
    public void testReductionVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reductionVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test //тест возможность уменьшать громкость
    public void testReductionVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.reductionVolume();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test//тест возможность выставления громкости до 100
    public void testCurrentVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test //тест возможность выставления громкости от 0
    public void testCurrentVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test //тест на невозможность увеличивать громкость после 100
    public void testConstantaMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test //тест на невозможность уменьшать громкость ниже 0
    public void testConstantaMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test //при нажатии на увеличение громкости после максимума ничего не происходит
    public void testIncreaseVolumeToMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
