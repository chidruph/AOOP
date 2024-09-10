package lab4b;

public class LogCommand implements Command {
    public LogHandler handler;
    
    public LogCommand(LogHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute(String message) {
        handler.handleLog(message);
    }
} 


