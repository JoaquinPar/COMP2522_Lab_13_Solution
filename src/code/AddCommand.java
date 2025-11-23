/**
 * A concrete command that performs an addition operation
 * on a Calculator receiver.
 * it also contains a method to undo such operation.
 *
 * @author Joaquin paredes
 * @version 1.0
 */
public class AddCommand implements Command
{
    private final Calculator calc;
    private final double x;

    /**
     * Creates a new AddCommand.
     *
     * @param calc the calculator that will perform the operation
     * @param x    the number to add
     */
    public AddCommand(final Calculator calc,
                      final double x)
    {
        this.calc = calc;
        this.x = x;
    }

    @Override
    public void execute()
    {
        calc.add(x);
    }

    @Override
    public void undo()
    {
        calc.subtract(x);
    }
}
