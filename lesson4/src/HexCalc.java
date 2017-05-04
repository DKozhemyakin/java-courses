/**
 * Created by damon on 28.04.2017.
 */
public class HexCalc implements Calculable{
    /**
     * Базовая реализация
     */
    private final Calculable calc;


    /**
     * Constructor
     * @param calc    Базовый калькулятор
     */
    public HexCalc(final Calculable calc) {
        this.calc = calc;
    }

    /**
     *
     * (@inheritDoc)
     */
    @Override
    public void add(final int ... args){
        this.calc.add(args);
    }

    @Override
    public int getResult() {
        return this.calc.getResult();
    }
}
