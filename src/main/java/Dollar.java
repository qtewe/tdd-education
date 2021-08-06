/**
 * @author Dmitry Polyakov
 * @created 07/08/2021 - 0:49
 * @project tddeducation
 */
public class Dollar {
    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int multiplier) {
        amount *= multiplier;
    }
}
