package Task5p1.Loggers;

import Task5p1.Task5p1;

public class DbLogger extends CustomLogger {
    @Override
    protected String getLogTarget() {
        return "database";
    }
}
