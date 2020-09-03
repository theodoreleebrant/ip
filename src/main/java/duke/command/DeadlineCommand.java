package duke.command;

import duke.Task;
import duke.TaskList;
import duke.Ui;

public class DeadlineCommand implements Command {
    Task toBeAdded;

    public DeadlineCommand(Task toBeAdded) {
        this.toBeAdded = toBeAdded;
    }

    @Override
    public String execute(TaskList tasks) {
        // Do TaskList stuff
        tasks.add(toBeAdded);
        // Do UI stuff
        return Ui.printAdd(toBeAdded.getDescription() + "\n", tasks.length());
        // Do storage stuff
        // tbc
    }
}
