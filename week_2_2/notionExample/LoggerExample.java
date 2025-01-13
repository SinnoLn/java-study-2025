package week_2_2.notionExample;

public class LoggerExample {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.logToFile("에러 로그: 디스크 공간 부족");
        logger.logToConsole("에러 로그: 메모리 부족");
    }
}
