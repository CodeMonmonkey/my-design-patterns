package _02_factory_method;

public class Client {

    public static void main(String[] args) {
        DataBaseLoggerFactory dataBaseLoggerFactory = new DataBaseLoggerFactory();
        Logger logger = dataBaseLoggerFactory.creatLogger();
        logger.writeLog();

        FileLoggerFactory fileLoggerFactory = new FileLoggerFactory();
        Logger logger1 = fileLoggerFactory.creatLogger();
        logger1.writeLog();
    }
}
