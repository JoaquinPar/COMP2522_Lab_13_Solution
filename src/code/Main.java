public class Main
{
    public static void main(final String[] args)
    {
        final Calculator calc;
        final CommandStack stack;

        calc = new Calculator(0);
        stack = new CommandStack();

        stack.execute(new AddCommand(calc, 5));
        System.out.println(calc.getValue());

        stack.undo();
        System.out.println(calc.getValue());

        stack.execute(new AddCommand(calc, 30));
        stack.execute(new MultiplyCommand(calc, 3));
        System.out.println(calc.getValue());

        stack.execute(new DivideCommand(calc, 2));
        stack.execute(new SubtractCommand(calc, 5));
        System.out.println(calc.getValue());

        stack.undo();
        System.out.println(calc.getValue());
    }
}