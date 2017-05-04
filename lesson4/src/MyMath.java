/**
 * Created by damon on 28.04.2017.
 */
public class MyMath {

    /**
     * Создание калькулятора в зависимости от типа. Все должны поддерживать интерфейс где реализовано сложение
     * @param name Имя калькулятора
     * @return
     */
    public Calculable createCalcByName(final String name) {
        final Calculable calc;
        if("hex".equals(name)) {
            calc = new HexCalc(new Calculator(1,1));
        } else if ("dec".equals((name))) {
            //calc = new DecCalc();
            calc = new Calculator(2,2);
        }
        else {
            calc = new Calculator(3,3);
        }
        return calc;
    }

}
