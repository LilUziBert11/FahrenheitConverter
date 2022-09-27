import java.util.Scanner;

public class FahrenheitConverter {

    private static double CelsiusToFahrenheit(float celsius){ //first method

        double fahrenheitValue;
        fahrenheitValue= (1.8)*celsius + 32;
        return fahrenheitValue;
    }
    private static boolean InputValidation(float input){ //second method + input validation

        if (input < -30){
            return false;
        }
        if (input > 200){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input your celsius degree between -30 and 200"); //Ask user for C degree between specific numbers
        float userInput = sc.nextFloat(); //save C degree
        if (InputValidation(userInput)){ //Validate C degree
            double celsiusValue = CelsiusToFahrenheit(userInput); //passed the C degree (userInput) to the method
            System.out.format("%.2f Fahrenheit is %.2f Celsius",userInput, celsiusValue); //displays the results based of the users input
        }
        else {
            System.out.println("Please enter a valid number");
        }

    }
}

