import java.util.Scanner;

public class InterestEarned {
    public static void main(String... args){
        Scanner  scanner = new Scanner(System.in);
        System.out.print("Enter interest rate: ");
        double interest = scanner.nextDouble();
        System.out.print("Enter times compounded: ");
        double times = scanner.nextDouble();
        System.out.print("Enter principal: ");
        double principal = scanner.nextDouble();
        double amount = principal * Math.pow((1.0 + interest / (times * 100)), times);
        double actualInterest = amount - principal;
        System.out.println("Interest: $" + actualInterest + "\n" +
                "Amount in Savings: $" + amount +  "\n");

    }
}
