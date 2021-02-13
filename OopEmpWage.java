import java.util.Random;

public class OopEmpWage {

    public static void main(String[] args) {
        OopEmpWage RANDOMCHECK=new OopEmpWage();
        RANDOMCHECK.randomcheck();

    }

    public void randomcheck(){
        Random RANDOM=new Random();
        int random=  RANDOM.nextInt(2);
        if(random==1){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
    }

}
