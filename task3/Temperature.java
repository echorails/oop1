

public class Temperature {

    // поля (доступ только через методы)
    private double value;
    private char scale; // 'C' или 'F'

    /* ---------------- Constructors ---------------- */

    // 1) default constructor (0 градусов Цельсия)
    public Temperature() {
        this.value = 0;
        this.scale = 'C';
    }

    // 2) constructor with value only (scale = Celsius)
    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    // 3) constructor with scale only (value = 0)
    public Temperature(char scale) {
        this.value = 0;
        this.scale = scale;
    }

    // 4) constructor with value and scale
    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    /* ---------------- Get methods ---------------- */

    // return temperature in Celsius
    public double getCelsius() {
        if (scale == 'C') {
            return value;
        } else {
            return 5 * (value - 32) / 9;
        }
    }

    // return temperature in Fahrenheit
    public double getFahrenheit() {
        if (scale == 'F') {
            return value;
        } else {
            return (9 * value) / 5 + 32;
        }
    }

    // return scale
    public char getScale() {
        return scale;
    }

    /* ---------------- Set methods ---------------- */

    // set only value
    public void setValue(double value) {
        this.value = value;
    }

    // set only scale
    public void setScale(char scale) {
        this.scale = scale;
    }

    // set value and scale
    public void setValueAndScale(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }
}
 



