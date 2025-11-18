package behavioral.Command.main;

import java.util.LinkedList;
import java.util.List;

public class MailTaskRunner implements Runnable{

    private Thread runner;

    private List<Command> pendingCommands;

    private volatile boolean stop;

    private static final MailTaskRunner RUNNER = new MailTaskRunner();

    public static final MailTaskRunner getInstance() {
        return RUNNER;
    }

    private MailTaskRunner() {
        pendingCommands = new LinkedList<>();
        runner = new Thread(this);
        runner.start();
    }

    @Override
    public void run() {
        while (true) {
            Command command = null;
            synchronized (pendingCommands) {
                if (pendingCommands.isEmpty()) {
                    try {
                        pendingCommands.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Runner interrupted");

                        if (stop) {
                            System.out.println("Runner stopping");
                            return;
                        }
                    }
                } else {
                    command = pendingCommands.remove(0);
                }
            }
            if (command == null) {
                return;
            }
        }
    }

    public void addCommand(Command command) {
        synchronized (pendingCommands) {
            pendingCommands.add(command);
            pendingCommands.notifyAll();
        }
    }

    public void shutdown() {
        this.stop = true;
        this.runner.interrupt();
    }
}
