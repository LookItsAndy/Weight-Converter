import java.util.Scanner;


public class WeightConverter {

    public static void main(String[] args){

        System.out.println("What would you like to convert you weight into? Pounds or Kilograms");

         Scanner unit = new Scanner(System.in);

         String u = unit.nextLine();

         

        if (u.equals ("Kilograms")) {
            System.out.println("Now converting into Kilograms");

            System.out.println("Type in your weight");

            Scanner pounds = new Scanner(System.in);

            double p = pounds.nextDouble();

            double poundresult = p / 2.20462262;

            System.out.println("Your weight in kilograms is " + poundresult);
        }

            else if (u.equals("Pounds")) {
                System.out.println("Now converting in to Pounds");

                System.out.println("Type in your weight");

                Scanner kilograms = new Scanner(System.in);

                double k = kilograms.nextDouble();

                double kilogramresult = k * 2.20462262;

                System.out.println("Your weight in pounds is " + kilogramresult);

            }


        
            
        }

    }

    
