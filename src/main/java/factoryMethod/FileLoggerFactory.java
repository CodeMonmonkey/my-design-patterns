package factoryMethod;

public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger creatLogger() {
        return new FileLogger();
    }
}
