import java.util.Scanner;

public class Calculation extends Thread {


  Scanner sc = new Scanner(System.in);
  int choice;
  public Calculation() {
        // choice = i;
  }

  double Celcius_to_Fahrenheit(double Celcius) {
    double Fahrenheit = (Celcius * 9 / 5) + 32;
    return Fahrenheit;
  }

  double Celcius_to_Kelvin(double Celcius) {
    double Kelvin = Celcius + 273.15;
    return Kelvin;
  }

  double Fahrenheit_to_Celcius(double Fahrenheit) {
    double Celcius = (Fahrenheit - 32) * 5 / 9;
    return Celcius;
  }

  double Fahrenheit_to_Kelvin(double Fahrenheit) {
    double Kelvin = (Fahrenheit - 32) * 5 / 9 + 273.15;
    return Kelvin;
  }

  double Kelvin_to_Celcius(double Kelvin) {
    double Celcius = Kelvin - 273.15;
    return Celcius;
  }

  double Kelvin_to_Fahrenheit(double Kelvin) {
    double Fahrenheit = (Kelvin - 273.15) * 9 / 5 + 32;
    return Fahrenheit;
  }

  double Input_Temperature(String Temperature) {
    System.out.println("Enter the " + Temperature + " value:");
    double val = sc.nextDouble();
    return val;
  }

  void Output_Temperature(double Value, String Temperature) {
    System.out.println("The " + Temperature + " value is: " + Value);
  }

  @Override
  public void run() {
        do{
                System.out.println("\nEnter Your Temperature Choice Number: ");
                int Temprature_Choice = sc.nextInt();
                double Choice_Number = 0;
                switch(Temprature_Choice){
                    case 1: Choice_Number = Input_Temperature("Celcius");
                        Output_Temperature(Celcius_to_Fahrenheit(Choice_Number), "Fahrenheit");
                        break;
                    case 2: Choice_Number = Input_Temperature("Celcius");
                        Output_Temperature(Celcius_to_Kelvin(Choice_Number), "Kelvin");
                        break;
                    case 3: Choice_Number = Input_Temperature("Fahrenheit");
                        Output_Temperature(Fahrenheit_to_Celcius(Choice_Number), "Celcius");
                        break;
                    case 4: Choice_Number = Input_Temperature("Fahrenheit");
                        Output_Temperature(Fahrenheit_to_Kelvin(Choice_Number), "Kelvin");
                        break;
                    case 5:Choice_Number = Input_Temperature("Kelvin");
                        Output_Temperature(Kelvin_to_Celcius(Choice_Number), "Celcius");
                        break;
                    case 6: Choice_Number = Input_Temperature("Kelvin");
                        Output_Temperature(Kelvin_to_Fahrenheit(Choice_Number), "Fahrenheit");
                        break;
                    case 7: System.exit(0);
                        break;
                    default: System.out.println("Invalid Input");
                }
            }
            while(true);
  }
}
