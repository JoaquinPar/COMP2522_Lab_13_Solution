/**
 * The Command interface declares the operations that every command must support.
 * Each command must be able to:
 *  - execute() : perform the action
 *  - undo()    : reverse the action
 *
 * @author Joaquin Paredes
 * @version 1.0
 */
public interface Command
{
    /**
     * Executes the command's primary action.
     */
    void execute();

    /**
     * Reverts the effects of execute().
     */
    void undo();
}
