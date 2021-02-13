import java.util.Random;

public class OopEmpWage {
    static int isPresent = 0;

    public static void main(String[] args) {
        dailyWage();
    }

    public static void empcheck() {

        Random RANDOM = new Random();
        int random = RANDOM.nextInt(2);
        if (random == 1) {
            System.out.println("Employee is full time");
            isPresent = 1;
        } else {
            System.out.println("Employee is part time");
            isPresent = 0;

        }
    }

    public static void dailyWage() {
        int wagePerHr = 20;
        int fullDayHr = 8;
        empcheck();
       switch (isPresent){
           case 1:
           fullDayHr=8;
           break;
           case 0:
           fullDayHr=4;
           break;
       }
        int dailyWage = wagePerHr*fullDayHr;
        System.out.println("Daliywage is : "+dailyWage);


    }

}
