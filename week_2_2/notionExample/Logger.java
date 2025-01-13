package week_2_2.notionExample;

class Logger {
    private final FileLogger fileLogger = new FileLogger();
    private final ConsoleLogger consoleLogger = new ConsoleLogger();

    void logToFile(String message) {
        fileLogger.log(message);
    }

    void logToConsole(String message) {
        consoleLogger.log(message);
    }
}
