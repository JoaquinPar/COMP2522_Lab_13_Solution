/**
 * A concrete command that performs a multiplication operation
 * on a Calculator receiver.
 * it also contains a method to undo such operation.
 *
 * @author Joaquin paredes
 * @version 1.0
 */
public class MultiplyCommand implements Command
{
    private final Calculator calc;
    private final double x;

    /**
     * Creates a new MultiplyCommand.
     *
     * @param calc the calculator that will perform the operation
     * @param x    the number to multiply by
     */
    public MultiplyCommand(final Calculator calc,
                      final double x)
    {
        this.calc = calc;
        this.x = x;
    }

    @Override
    public void execute()
    {
        calc.multiply(x);
    }

    @Override
    public void undo()
    {
        calc.divide(x);
    }
}
