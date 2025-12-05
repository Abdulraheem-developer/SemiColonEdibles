public class RiderPayment {

    public static int calculateWage(int successfulDelivery) {
        int basePay = 5000;
        int amountPerParcel = 0;

        
        int rate = successfulDelivery; 

        if (rate < 50) {
            amountPerParcel = 160;
        } else if (rate <= 59) {
            amountPerParcel = 200;
        } else if (rate <= 69) {
            amountPerParcel = 250;
        } else { // 70% and above
            amountPerParcel = 500;
        }

        return (successfulDelivery * amountPerParcel) + basePay;
    }

    public static void main(String[] args) {
        System.out.println(calculateWage(80)); 
        System.out.println(calculateWage(25)); 
    }
}

