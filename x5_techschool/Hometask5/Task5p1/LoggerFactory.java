package Task5p1;

import Task5p1.Loggers.ConsoleLogger;
import Task5p1.Loggers.CustomLogger;
import Task5p1.Loggers.DbLogger;
import Task5p1.Loggers.FileLogger;

public class LoggerFactory {
    public static CustomLogger getLogger(LoggerType loggerType) {
        switch (loggerType) {
            case loggerConsole: return new ConsoleLogger();
            case loggerDb:      return new DbLogger();
            case loggerFile:    return new FileLogger();
            default: return null;
        }
    }
}
