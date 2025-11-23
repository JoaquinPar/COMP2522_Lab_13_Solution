/**
 * A concrete command that performs a subtraction operation
 * on a Calculator receiver.
 * it also contains a method to undo such operation.
 *
 * @author Joaquin paredes
 * @version 1.0
 */
public class SubtractCommand implements Command
{
    private final Calculator calc;
    private final double x;

    /**
     * Creates a new SubtractCommand.
     *
     * @param calc the calculator that will perform the operation
     * @param x    the number to subtract
     */
    public SubtractCommand(final Calculator calc,
                      final double x)
    {
        this.calc = calc;
        this.x = x;
    }

    @Override
    public void execute()
    {
        calc.subtract(x);
    }

    @Override
    public void undo()
    {
        calc.add(x);
    }
}
