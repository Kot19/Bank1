
public class Bank1 {

        public static void main(String[] args) {
            withdraw(99);
            withdraw(10);
        }

        private static double balance = 100;
        private static double comission = 0.05;

        private static void withdraw(double withdraw) {
            System.out.println("I want withdraw $" + withdraw);
            double commissionFee = comission * withdraw;
            if ((commissionFee + withdraw) < balance) {
                balance = balance - commissionFee - withdraw;
                System.out.println("OK. Commission is : $" + commissionFee + ". Your balance is : $" + balance + ".");
            } else {
                System.out.println("NOT OK.");
            }
        }


    }


