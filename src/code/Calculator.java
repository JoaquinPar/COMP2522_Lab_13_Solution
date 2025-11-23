/**
 * Represents an operation that can be executed and later undone.
 *
 * The Command pattern encapsulates a request as an object, allowing
 * operations to be parameterized and queued. Each concrete command
 * stores any data it needs to perform and reverse its action.
 *
 * @author Joaquin Paredes
 * @version 1.0
 */
public class Calculator
{
    private double currValue;

    /**
     * Creates a calculator initialized with a starting value.
     *
     * @param currValue the initial value
     */
    public Calculator(final double currValue)
    {
        this.currValue = currValue;
    }

    /**
     * Adds a value to the current total.
     */
    public void add(final double value)
    {
        currValue += value;
    }

    /**
     * Subtracts a value from the current total.
     */
    public void subtract(final double value)
    {
        currValue -= value;
    }

    /**
     * Multiplies the current total by a value.
     */
    public void multiply(final double value)
    {
        currValue *= value;
    }

    /**
     * Divides the current total by a value.
     */
    public void divide(final double value)
    {
        currValue /= value;
    }

    /**
     * Returns the current stored value.
     *
     * @return the current value
     */
    public double getValue()
    {
        return currValue;
    }
}
