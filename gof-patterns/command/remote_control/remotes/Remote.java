package remotes;

import commands.Command;

public interface Remote {
    public void setCommand(int slotId, Command command);
    public void executeCommand(int slotId);
    public void undoLastCommand();
}
