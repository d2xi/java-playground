package remotes;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import commands.Command;
import java.util.logging.Logger;

public class TwoSlotRemoteControl implements Remote{

    private static  final Logger logger = Logger.getLogger(TwoSlotRemoteControl.class.getName());
    private Command[] commands;
    private Command lastCommand;
    private List<String> history;

    public TwoSlotRemoteControl(){
        commands = new Command[2];
        history = new LinkedList<>();
    }

    @Override
    public void setCommand(int slotId, Command command){
        String msg = String.format("Saved command %s into slot %d.", command, slotId);
        logger.info(msg);
        commands[slotId] = command;
    }
    
    @Override
    public void executeCommand(int slotId){
        Command cmd = commands[slotId];
        if (cmd != null){
            cmd.execute();
            String msg = String.format("Executed %s from slot %d.",cmd, slotId);
            history.add(msg);
            logger.info(msg);
        }
    }
    
    @Override
    public void undoLastCommand() {
        if (lastCommand != null){
            history.add("Undone the command "+lastCommand);
            lastCommand.undo();
        }
        lastCommand = null;
    }

    public void printHistory(){
        logger.info("Remote controller history has been printed.");
        System.out.println("Remote controller history:");
        IntStream.range(0, Math.max(0,history.size())).forEach(posId -> System.out.println(posId+": "+history.get(posId)));
    }
}