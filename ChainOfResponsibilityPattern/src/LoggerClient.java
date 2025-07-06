public class LoggerClient {
    public static Logger getChainOfLoggers() {
        Logger errorLogger = new ErrorLogger();
        Logger debugLogger = new DebugLogger();
        Logger infoLogger = new InfoLogger();

        errorLogger.setNext(debugLogger);
        debugLogger.setNext(infoLogger);

        return errorLogger;  // First handler in the chain
    }

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(Logger.INFO, "This is an information.");
        loggerChain.logMessage(Logger.DEBUG, "This is a debug level info.");
        loggerChain.logMessage(Logger.ERROR, "This is an error message.");
    }
}
