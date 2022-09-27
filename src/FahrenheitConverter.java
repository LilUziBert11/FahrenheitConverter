public class FahrenheitConverter {

    public static void main(String[] args) {
        CelsiusToFahrenheit(60);
        double celsiusValue = CelsiusToFahrenheit(60);
        System.out.format("60 Fahrenheit is %.2f Celsius",celsiusValue);

    }

    private static double CelsiusToFahrenheit(float celsius){

        double fahrenheitValue;
        fahrenheitValue= (1.8)*celsius + 32;
        return fahrenheitValue;
    }

}
