package _02_factory_method;

public class DataBaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger creatLogger() {
        return new DataBaseLogger();
    }
}
