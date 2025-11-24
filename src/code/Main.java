import java.util.Scanner;

public class Main
{
    public static void main(final String[] args)
    {
        final Scanner scanner;
        final Calculator calc;
        final CommandStack stack;
        final int initialNum;

        scanner = new Scanner(System.in);
        stack = new CommandStack();

        System.out.print("Enter an initial number for the calculator: ");
        initialNum = scanner.nextInt();

        calc = new Calculator(initialNum);

        System.out.println("Type commands like: 5 + | 10 * | 3 / | undo | quit");

        while (true)
        {
            final double num;
            final String op;
            final String operation;
            final Command cmd;

            System.out.print("> ");

            if (!scanner.hasNextDouble())
            {
                op = scanner.next();

                if (op.equalsIgnoreCase("undo"))
                {
                    stack.undo();
                    System.out.println("= " + calc.getValue());
                    continue;
                }

                if (op.equalsIgnoreCase("quit"))
                {
                    System.out.println("Goodbye!");
                    break;
                }

                System.out.println("Invalid input.");
                continue;
            }

            num = scanner.nextDouble();
            operation = scanner.next();

            cmd = switch (operation)
            {
                case "+" -> new AddCommand(calc, num);
                case "-" -> new SubtractCommand(calc, num);
                case "*" -> new MultiplyCommand(calc, num);
                case "/" -> new DivideCommand(calc, num);
                default -> null;
            };

            if (cmd == null)
            {
                System.out.println("Unknown operation.");
                continue;
            }

            stack.execute(cmd);
            System.out.println("= " + calc.getValue());
        }

        scanner.close();
    }
}