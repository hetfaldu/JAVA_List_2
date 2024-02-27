public class TemperatureConverter {
    
    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        double fahrenheit = 98.6; // Example Fahrenheit temperature
        double celsius = 37.0; // Example Celsius temperature

        // Convert Fahrenheit to Celsius
        double celsiusEquivalent = fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsiusEquivalent + " Celsius");

        // Convert Celsius to Fahrenheit
        double fahrenheitEquivalent = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is equal to " + fahrenheitEquivalent + " Fahrenheit");
    }
}
