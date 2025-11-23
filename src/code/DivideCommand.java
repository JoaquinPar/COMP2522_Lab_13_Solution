/**
 * A concrete command that performs a division operation
 * on a Calculator receiver.
 * it also contains a method to undo such operation.
 *
 * @author Joaquin paredes
 * @version 1.0
 */
public class DivideCommand implements Command
{
    private final Calculator calc;
    private final double x;

    /**
     * Creates a new DivideCommand.
     *
     * @param calc the calculator that will perform the operation
     * @param x    the number to divide by
     */
    public DivideCommand(final Calculator calc,
                      final double x)
    {
        this.calc = calc;
        this.x = x;
    }

    @Override
    public void execute()
    {
        calc.divide(x);
    }

    @Override
    public void undo()
    {
        calc.multiply(x);
    }
}
