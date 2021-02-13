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
            System.out.println("Employee is working full time today");
            isPresent = 1;
        } else {
            System.out.println("Employee is working part time today");
            isPresent = 0;

        }
    }

    public static void dailyWage() {
        int wagePerHr = 20;
        int fullDayHr = 0;
        int workingDayPerMonth=20;
        int workingHrPerMonth=100;
        int workedDays=0;
        int workedHrs=0;
        int totalWage=0;
        while (workedHrs<workingHrPerMonth && workedDays<workingDayPerMonth) {
            workedHrs = workedHrs+fullDayHr;
            workedDays++;
            switch (isPresent) {
                case 1:
                    fullDayHr = 8;
                    break;
                case 0:
                    fullDayHr = 4;
                    break;

            }
            empcheck();
             int dailyWage = wagePerHr * fullDayHr;

            System.out.println("Todays salary is : " + dailyWage);
             totalWage = totalWage+dailyWage;


        }

        System.out.println(totalWage+ " : is total monthly salary");
    }

}
