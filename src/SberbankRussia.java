
public class SberbankRussia {
    public static void main(String[] args) {
         withdraw1 (100);
        withdraw2 (499);

    }

    private static double[] balances = {1200, 250, 2000, 500, 3200};
    String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    private static double comission = 0.05;

    private static void withdraw1(double withdraw1) {
        System.out.println("Ann want withdraw $" + withdraw1);
        double commissionFee1 = comission * withdraw1;
        double balance1 = 250;
        if ((commissionFee1 + withdraw1) < balance1) {
            balance1 = balance1 - commissionFee1 - withdraw1;
            System.out.println("OK. Commission is : $" + commissionFee1 + ". Ann,Your balance is : $" + balance1 + ".");

        }
    }
    private static void withdraw2(double withdraw2) {
        System.out.println("Oww want withdraw $" + withdraw2 );
        double commissionFee2 = comission * withdraw2;
        double balance2 = 500;

        System.out.println("NOT OK.");

    }
}
