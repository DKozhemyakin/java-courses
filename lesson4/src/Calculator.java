/**
 * Created by damon on 28.04.2017.
 */
public class Calculator implements Calculable{

    private int result;
    private final int firstValue;
    private final int secondValue;

    public Calculator(int first, int second) {

        this.firstValue = first;
        this.secondValue = second;
    }

    /**
     * суммирует входные параметры
     * @param params список аргументов
     */
    public void add(int ... params) {
        for (Integer param:params) {
            this.result += param;
        }
//        this.result = param1 + param2;
    }

    public int getResult(){
        return this.result;
    }

    public void clearResult(){
        this.result = 0;
    }

    public int addTwoPreinitValues(){
        return this.firstValue + this.secondValue;
    }
}
