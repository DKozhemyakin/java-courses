import java.util.Scanner;

/**
 * Created by damon on 28.04.2017.
 */
public class InteractRunner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
/*
        try {
            Calculator calc = new Calculator(1,5);
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter first arg: ");
                String first = reader.next();
                System.out.println("Enter second arg: ");
                String second = reader.next();
                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("calc.getResult() = " + calc.getResult());
                calc.clearResult();
                System.out.println("Exit: yes/no");
                exit = reader.next();
            }
        } finally {
            reader.close();
        }
*/

        Calculator calc2 = new Calculator(1,5);
        int res = calc2.addTwoPreinitValues();
        System.out.println("res = " + res);

        //=============

        MyMath mm = new MyMath();
        Calculable calc3 = mm.createCalcByName("hex");
        calc3.add(4,5);
        System.out.println("cal = " + calc3.getResult());


        test1();
    }

    private static void test1(){
        System.out.println("true = " + true);
    }

}
