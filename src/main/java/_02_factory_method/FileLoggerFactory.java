package _02_factory_method;

public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger creatLogger() {
        return new FileLogger();
    }
}
