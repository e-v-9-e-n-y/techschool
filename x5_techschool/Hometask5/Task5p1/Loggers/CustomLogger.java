package Task5p1.Loggers;

import Task5p1.Task5p1;

public abstract class CustomLogger {
    protected abstract String getLogTarget();

    public void log(String message) {
        System.out.println("Log into " + getLogTarget() + ":" + message);
    }

    ;
}
