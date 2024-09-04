public class Main {
    public static void main(String[] args){
        System.out.println("Hej");
    }

    public double convertToFahrenheit(double celsius){
        return (9 / 5d * celsius) + 32;
    }

    public double convertToCelsius(double fahrenheit){
        return (fahrenheit-32) * 5/9d;
    }
}
